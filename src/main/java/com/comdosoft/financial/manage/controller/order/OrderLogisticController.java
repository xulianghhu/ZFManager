/**	______	    		
   /__	__/__  ____     
 	 / / / _ \/ __) _ `/
 	/_/ ()___/_/  \_, /
 				 /___/			
 * 2015年3月22日 下午10:10:33
 */
package com.comdosoft.financial.manage.controller.order;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.comdosoft.financial.manage.domain.Response;
import com.comdosoft.financial.manage.domain.zhangfu.Customer;
import com.comdosoft.financial.manage.domain.zhangfu.Order;
import com.comdosoft.financial.manage.service.OrderLogisticService;
import com.comdosoft.financial.manage.service.OrderService;
import com.comdosoft.financial.manage.service.SessionService;

@Controller
@RequestMapping("/order/logistic")
public class OrderLogisticController extends BaseController {

	@Autowired
	private OrderLogisticService orderLogisticService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private SessionService sessionService;
	
	public Boolean deliver(HttpServletRequest request,Integer orderId,String terminalSerialNum,String logisticsName,String logisticsNumber,Model model) throws Exception{
		Customer customer = sessionService.getLoginInfo(request);
		orderLogisticService.deliver(customer,orderId, terminalSerialNum, logisticsName, logisticsNumber,null);
		Order order=orderService.findOrderInfo(orderId);
		model.addAttribute("order", order);
		return true;
	}
	
	public Boolean deliver(HttpServletRequest request,Integer orderId,String terminalSerialNum,String logisticsName,String logisticsNumber,Model model,String goodQuantity) throws Exception{
		Customer customer = sessionService.getLoginInfo(request);
		orderLogisticService.deliver(customer,orderId, terminalSerialNum, logisticsName, logisticsNumber,goodQuantity);
		Order order=orderService.findOrderInfo(orderId);
		model.addAttribute("order", order);
		return true;
	}
	
	@RequestMapping(value="create",method = RequestMethod.GET)
	public String createGet(HttpServletRequest request,Integer orderId,String terminalSerialNum,String logisticsName,String logisticsNumber,Model model){
		try {
			deliver(request, orderId, terminalSerialNum, logisticsName, logisticsNumber, model);
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("response", Response.getError(e.getMessage()));
			return "order/error";
		}
		saveOperateRecord(request,OperateType.orderUserType, OperatePage.orderUserList,OperateAction.deliver, orderId);
        return "order/user/pageRowOrder";
	}
	@RequestMapping(value="/info/create",method = RequestMethod.GET)
	public String createInfoGet(HttpServletRequest request,Integer orderId,String terminalSerialNum,String logisticsName,String logisticsNumber,Model model){
		try {
			deliver(request, orderId, terminalSerialNum, logisticsName, logisticsNumber, model);
		} catch (Exception e) {
			model.addAttribute("response", Response.getError(e.getMessage()));
			return "order/error";
		}
		saveOperateRecord(request,OperateType.orderUserType, OperatePage.orderUserInfo,OperateAction.deliver, orderId);
		return "order/user/infoUp";
	}
	
	@RequestMapping(value="/agent/create",method = RequestMethod.GET)
	public String createAgentGet(HttpServletRequest request,Integer orderId,String terminalSerialNum,String logisticsName,String logisticsNumber,Model model){
		try {
			deliver(request, orderId, terminalSerialNum, logisticsName, logisticsNumber, model);
		} catch (Exception e) {
			model.addAttribute("response", Response.getError(e.getMessage()));
			return "order/error";
		}
		saveOperateRecord(request,OperateType.orderAgentType, OperatePage.orderAgentList,OperateAction.deliver, orderId);
        return "order/agent/row";
	}
	@RequestMapping(value="/agent/info/create",method = RequestMethod.GET)
	public String createAgentInfoGet(HttpServletRequest request,Integer orderId,String terminalSerialNum,String logisticsName,String logisticsNumber,Model model){
		try {
			deliver(request, orderId, terminalSerialNum, logisticsName, logisticsNumber, model);
		} catch (Exception e) {
			model.addAttribute("response", Response.getError(e.getMessage()));
			return "order/error";
		}
		saveOperateRecord(request,OperateType.orderAgentType, OperatePage.orderAgentInfo,OperateAction.deliver, orderId);
		return "order/agent/infoUp";
	}
	
	@RequestMapping(value="/batch/create",method = RequestMethod.GET)
	public String createBatchGet(HttpServletRequest request,Integer orderId,String terminalSerialNum,String logisticsName,String logisticsNumber,Model model,String goodQuantity){
		try {
			deliver(request, orderId, terminalSerialNum, logisticsName, logisticsNumber, model,goodQuantity);
		} catch (Exception e) {
			model.addAttribute("response", Response.getError(e.getMessage()));
			return "order/error";
		}
		saveOperateRecord(request,OperateType.orderBatchType, OperatePage.orderBatchList,OperateAction.deliver, orderId);
		return "order/batch/row";
	}
	@RequestMapping(value="/batch/info/create",method = RequestMethod.GET)
	public String createBatchInfoGet(HttpServletRequest request,Integer orderId,String terminalSerialNum,String logisticsName,String logisticsNumber,Model model,String goodQuantity){
		try {
			deliver(request, orderId, terminalSerialNum, logisticsName, logisticsNumber, model,goodQuantity);
		} catch (Exception e) {
			model.addAttribute("response", Response.getError(e.getMessage()));
			return "order/error";
		}
		saveOperateRecord(request,OperateType.orderBatchType, OperatePage.orderBatchInfo,OperateAction.deliver, orderId);
		return "order/batch/infoUp";
	}
}
