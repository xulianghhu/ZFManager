package com.comdosoft.financial.manage.controller.order;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.comdosoft.financial.manage.domain.zhangfu.City;
import com.comdosoft.financial.manage.domain.zhangfu.Customer;
import com.comdosoft.financial.manage.domain.zhangfu.CustomerAddress;
import com.comdosoft.financial.manage.domain.zhangfu.Factory;
import com.comdosoft.financial.manage.domain.zhangfu.Good;
import com.comdosoft.financial.manage.domain.zhangfu.Order;
import com.comdosoft.financial.manage.domain.zhangfu.PayChannel;
import com.comdosoft.financial.manage.service.CityService;
import com.comdosoft.financial.manage.service.CustomerAddressService;
import com.comdosoft.financial.manage.service.FactoryService;
import com.comdosoft.financial.manage.service.GoodService;
import com.comdosoft.financial.manage.service.OrderService;
import com.comdosoft.financial.manage.service.PayChannelService;
import com.comdosoft.financial.manage.service.SessionService;
import com.comdosoft.financial.manage.utils.page.Page;

@Controller
@RequestMapping("/order")
public class OrderBatchController {

	@Autowired
	private OrderService orderService;
	@Autowired
	private FactoryService factoryService;
	@Autowired
	private SessionService sessionService;
	@Autowired
	private CustomerAddressService customerAddressService;
	@Autowired
	private CityService cityService;
	@Autowired
	private GoodService goodService;
	@Autowired
	private PayChannelService payChannelService;

	@RequestMapping(value = "/batch/list", method = RequestMethod.GET)
	public String listBatch(Integer page, Byte status, String keys,
			Integer factoryId, Model model) {
		List<Byte> types = new ArrayList<Byte>();
		types.add((byte) 5);
		findPage(page, status, keys, factoryId, model, types);
		return "order/batch/list";
	}

	@RequestMapping(value = "/batch/page", method = RequestMethod.GET)
	public String pageBatch(Integer page, Byte status, String keys,
			Integer factoryId, Model model) {
		List<Byte> types = new ArrayList<Byte>();
		types.add((byte) 5);
		findPage(page, status, keys, factoryId, model, types);
		return "order/batch/page";
	}

	private void findPage(Integer page, Byte status, String keys,
			Integer factoryId, Model model, List<Byte> types) {
		if (page == null) {
			page = 1;
		}
		if (status != null && status == 0) {
			status = null;
		}
		Page<Order> orders = orderService.findPages(page, status, keys,
				factoryId, types);
		List<Factory> findCheckedFactories = factoryService
				.findCheckedFactories();
		model.addAttribute("factories", findCheckedFactories);
		model.addAttribute("orders", orders);
	}

	@RequestMapping(value = "/batch/{id}/info", method = RequestMethod.GET)
	public String info(@PathVariable Integer id, Model model) {
		Order order = orderService.findOrderInfo(id);
		model.addAttribute("order", order);
		return "order/batch/info";
	}

	@RequestMapping(value = "/batch/create", method = RequestMethod.GET)
	public String createGet(HttpServletRequest request, Model model,
			Integer goodId, Integer quantity,Integer payChannelId) {
		Customer customer = sessionService.getLoginInfo(request);
		List<CustomerAddress> selectCustomerAddress = customerAddressService
				.selectCustomerAddress(customer.getId());
		List<City> cities = cityService.cities(0);
		Good good = goodService.findGoodInfo(goodId);
		PayChannel payChannel = payChannelService.findChannelInfo(payChannelId);
		
		model.addAttribute("customerAddresses", selectCustomerAddress);
		model.addAttribute("cities", cities);
		model.addAttribute("good", good);
		model.addAttribute("quantity", quantity);
		model.addAttribute("payChannel", payChannel);
		return "order/batch/create";
	}

	@RequestMapping(value = "/batch/createSure", method = RequestMethod.GET)
	public String createSureGet(HttpServletRequest request, Model model,
			Integer goodId, Integer quantity, String comment,
			String invoiceInfo, Integer customerAddressId, Integer invoiceType,
			Boolean needInvoice, int type, Integer payChannelId) {
		Customer customer = sessionService.getLoginInfo(request);
		orderService
				.save(customer, goodId, quantity, comment, invoiceInfo,
						customerAddressId, invoiceType, needInvoice, type,
						payChannelId);
		List<Byte> types = new ArrayList<Byte>();
		types.add((byte) 1);
		types.add((byte) 2);
		findPage(1, null, null, null, model, types);
		return "order/batch/list";

	}

	@RequestMapping(value = "/batch/{id}/save", method = RequestMethod.GET)
	public String save(@PathVariable Integer id, Byte status,
			Integer actualPrice, Model model) {
		orderService.save(id, status, actualPrice, null);
		Order order = orderService.findOrderInfo(id);
		model.addAttribute("order", order);
		return "order/batch/pageRowOrder";
	}

	@RequestMapping(value = "/batch/{id}/cancel", method = RequestMethod.GET)
	public String cancle(@PathVariable Integer id, Model model) {
		orderService.save(id, (byte) 5, null, null);
		Order order = orderService.findOrderInfo(id);
		model.addAttribute("order", order);
		return "order/batch/pageRowOrder";
	}
}
