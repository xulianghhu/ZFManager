package com.comdosoft.financial.manage.service.cs;

import static com.comdosoft.financial.manage.service.cs.CsConstants.CsCancelStatus.CANCEL;
import static com.comdosoft.financial.manage.service.cs.CsConstants.CsCancelStatus.FINISH;
import static com.comdosoft.financial.manage.service.cs.CsConstants.CsCancelStatus.HANDLE;
import static com.comdosoft.financial.manage.service.cs.CsConstants.CsCancelStatus.SUSPEND;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.comdosoft.financial.manage.domain.Response;
import com.comdosoft.financial.manage.domain.zhangfu.CsCancel;
import com.comdosoft.financial.manage.domain.zhangfu.CsCancelMark;
import com.comdosoft.financial.manage.domain.zhangfu.Customer;
import com.comdosoft.financial.manage.mapper.zhangfu.CsCancelMapper;
import com.comdosoft.financial.manage.mapper.zhangfu.CsCancelMarkMapper;
import com.comdosoft.financial.manage.mapper.zhangfu.TerminalMapper;
import com.comdosoft.financial.manage.utils.HttpFile;
import com.comdosoft.financial.manage.utils.page.Page;
import com.comdosoft.financial.manage.utils.page.PageRequest;

@Service
public class CsCancelService {

	@Value("${page.size}")
	private Integer pageSize;

	@Autowired
	private CsCancelMapper csCancelMapper;
	@Autowired
	private TerminalMapper terminalMapper;
	@Autowired
	private CsCancelMarkMapper csCancelMarkMapper;
	
	
	public Page<CsCancel> findPage(Customer customer, int page, Integer status, String keyword) {
		long count = csCancelMapper.countSelective(status, keyword);
		PageRequest request = new PageRequest(page, pageSize);
		if (count == 0) {
			return new Page<CsCancel>(new PageRequest(1, pageSize), new ArrayList<CsCancel>(), count);
		} else {
			if (pageSize <= 0) pageSize = 1;
			int totalPage = (int)Math.ceil((double) count / pageSize);
			if (page > totalPage) request = new PageRequest(totalPage, pageSize);
		}
		List<CsCancel> result = csCancelMapper.findPageSelective(request,customer.getId(), status, keyword);
		Page<CsCancel> csCancels = new Page<CsCancel>(request, result, count);
		return csCancels;
	}
	
	public CsCancel findInfoById(Integer id) {
		return csCancelMapper.selectInfoByPrimaryKey(id);
	}
	
	public CsCancel updateStatus(Integer csCancelId, Integer status) {
		CsCancel csCancel = csCancelMapper.selectByPrimaryKey(csCancelId);
		csCancel.setStatus(status);
		csCancel.setUpdatedAt(new Date());
		csCancelMapper.updateByPrimaryKey(csCancel);
		return csCancel;
	}
	
	public void handle(Integer csCancelId) {
		updateStatus(csCancelId, HANDLE);
	}
	
	@Transactional("transactionManager")
	public void cancel(Integer csCancelId) {
		CsCancel csCancel = updateStatus(csCancelId, CANCEL);
		Integer terminalId = csCancel.getTerminalId();
		if (null != terminalId) {
			terminalMapper.closeCsReturnDepotsById(terminalId);
		}
	}
	
	@Transactional("transactionManager")
	public void finish(Integer csCancelId) {
		CsCancel csCancel = updateStatus(csCancelId, FINISH);
		Integer terminalId = csCancel.getTerminalId();
		if (null != terminalId) {
			terminalMapper.closeCsReturnDepotsById(terminalId);
		}
	}
	
	public void resubmit(Integer csCancelId) {
		updateStatus(csCancelId, SUSPEND);
	}
	
	public void dispatch(String ids, Integer customerId, String customerName) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ids", ids.split(","));
		params.put("customerId", customerId);
		params.put("customerName", customerName);
		csCancelMapper.dispatchUserByIds(params);
	}
	
	public CsCancelMark createMark(Customer customer, Integer csCancelId, String content) {
		CsCancelMark csCancelMark = new CsCancelMark();
		csCancelMark.setCustomerId(customer.getId());
		csCancelMark.setCsCancelId(csCancelId);
		csCancelMark.setCreatedAt(new Date());
		csCancelMark.setContent(content);
		csCancelMarkMapper.insert(csCancelMark);
		csCancelMark.setCustomer(customer);
		return csCancelMark;
	}
	
	public List<CsCancelMark> findMarksByCsCancelId(Integer csCancelId) {
		return csCancelMarkMapper.selectByCancelId(csCancelId);
	}
	
	public Map<String, Object> makeWar(String urlPaths,String warPath) throws Exception{
		Map<String, Object> result=new HashMap<String, Object>();
		int resultCode=Response.SUCCESS_CODE;
		StringBuilder resultInfo=new StringBuilder();
		
		JSONArray jsArray=JSONArray.parseArray(urlPaths);
		ArrayList<String> urlPathsList=new ArrayList<String>();
		for(int i=0;i<jsArray.size();i++){
			String urlTemp=((Map<String, Object>)jsArray.get(i)).get("path").toString();
			urlPathsList.add(urlTemp);
		}
		String[] urlPaths1 =new String[urlPathsList.size()];
		urlPathsList.toArray(urlPaths1);
		int i=HttpFile.postWar(urlPaths1, warPath);
		if(i==0){
			resultInfo.setLength(0);
			resultInfo.append("生成war包成功");
		}else{
			resultCode=Response.ERROR_CODE;
			resultInfo.setLength(0);
			resultInfo.append("生成war包失败");
			throw new Exception("生成war包失败");
		}
		result.put("resultCode", resultCode);
		result.put("resultInfo", resultInfo.toString());
		return result;
	}
}
