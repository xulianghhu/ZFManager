package com.comdosoft.financial.manage.controller.task;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comdosoft.financial.manage.domain.Response;
import com.comdosoft.financial.manage.domain.zhangfu.Customer;
import com.comdosoft.financial.manage.service.SessionService;
import com.comdosoft.financial.manage.service.task.StockManageService;

/**
 * 运营中心  任务  售后库存管理
 * @author yyb
 *
 */
@Controller
@RequestMapping("/task/stockManage")
public class StockManageController {
	@Autowired
	private SessionService sessionService;
	
	@Autowired
	private StockManageService stockManageService;
	
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String index(){
		return "task/stockManage/stockManage";
	}
	
	
	@RequestMapping(value="showInfo",method=RequestMethod.POST)
	@ResponseBody
	public Response showInfo(String serialNum,HttpServletRequest request){
		Response response=new Response();
		Customer customer=sessionService.getLoginInfo(request);
		Map<String, Object> map= stockManageService.showInfo(serialNum, customer.getId());
		response.setCode(Integer.parseInt(map.get("resultCode").toString()));
		response.setMessage(map.get("resultInfo").toString());
		response.setResult(serialNum);
		return response;
	}
	
	/**
	 * 检测终端号是否存在
	 * @param serialNum
	 * @param request
	 * @return
	 */
	@RequestMapping(value="checkAccount",method=RequestMethod.POST)
	@ResponseBody
	public Response checkAccount(String serialNum,HttpServletRequest request){
		Response response=new Response();
		Customer customer=sessionService.getLoginInfo(request);
		Map<String, Object> map= stockManageService.checkAccount(serialNum, customer.getId(),customer.getName(),customer.getTypes());
		response.setCode(Integer.parseInt(map.get("resultCode").toString()));
		response.setMessage(map.get("resultInfo").toString());
		return response;
	}
	
	/**
	 * 将终端退回售后库
	 * @param serialNum
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="toAfterSaleStock",method=RequestMethod.POST)
	@ResponseBody
	public Response toAfterSaleStock(String serialNum,HttpServletRequest request) throws Exception{
		Response response=new Response();
		Customer customer=sessionService.getLoginInfo(request);
		Map<String, Object> map= stockManageService.toAfterSaleStock(serialNum, customer.getId(),customer.getName(),customer.getTypes());
		response.setCode(Integer.parseInt(map.get("resultCode").toString()));
		response.setMessage(map.get("resultInfo").toString());
		return response;
	}
	/**
	 * 将终端放入正常库
	 * @param serialNum
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="toNormalStock",method=RequestMethod.POST)
	@ResponseBody
	public Response toNormalStock(String serialNum,HttpServletRequest request) throws Exception{
		Response response=new Response();
		Customer customer=sessionService.getLoginInfo(request);
		Map<String, Object> map= stockManageService.toNormalStock(serialNum, customer.getId(),customer.getName(),customer.getTypes());
		response.setCode(Integer.parseInt(map.get("resultCode").toString()));
		response.setMessage(map.get("resultInfo").toString());
		return response;
	}
	
	/**
	 * 报废
	 * @param serialNum
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="breakDown",method=RequestMethod.POST)
	@ResponseBody
	public Response breakDown(String serialNum,HttpServletRequest request) throws Exception{
		Response response=new Response();
		Customer customer=sessionService.getLoginInfo(request);
		Map<String, Object> map= stockManageService.breakDown(serialNum, customer.getId(),customer.getName(),customer.getTypes());
		response.setCode(Integer.parseInt(map.get("resultCode").toString()));
		response.setMessage(map.get("resultInfo").toString());
		return response;
	}
}
