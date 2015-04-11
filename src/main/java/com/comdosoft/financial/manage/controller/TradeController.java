package com.comdosoft.financial.manage.controller;

import com.comdosoft.financial.manage.domain.Response;
import com.comdosoft.financial.manage.domain.trades.Profit;
import com.comdosoft.financial.manage.domain.trades.TradeRecord;
import com.comdosoft.financial.manage.domain.zhangfu.DictionaryTradeType;
import com.comdosoft.financial.manage.service.TradeService;
import com.comdosoft.financial.manage.utils.page.Page;
import com.google.common.base.Joiner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by gookin on 15/3/7.
 */
@Controller
@RequestMapping("/trade")
public class TradeController {
	
	private static final Logger LOG = LoggerFactory.getLogger(TradeController.class);

    @Autowired
    private TradeService tradeService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        List<DictionaryTradeType> tradeTypes = tradeService.allTradeTypes();
        model.addAttribute("tradeTypes",tradeTypes);
        type(tradeTypes.get(0).getId(),model);
        return "trade/trade_index";
    }

    @RequestMapping(value = "/type/{id}/list",method = RequestMethod.GET)
    public String type(@PathVariable Integer id,Model model){
        DictionaryTradeType tradeType = tradeService.tradeType(id);
        model.addAttribute("type",tradeType);
        return "trade/trade_list";
    }

    @RequestMapping(value = "/type/{id}/page/{page}",method = RequestMethod.POST)
    public String tradePage(@PathVariable Integer id,
                            @PathVariable Integer page,
                            Integer status,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date start,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date end,
                            Model model){
        Page<TradeRecord> recordPage = tradeService.tradeRecordPage(page, id, status, start, end);
        model.addAttribute("recordPage",recordPage);
        Map<String,Long> profits = tradeService.pageProfit(id,status,start,end);
        model.addAttribute("profits",profits);
        return "trade/trade_list_page";
    }

    @RequestMapping(value = "/{id}/info",method = RequestMethod.GET)
    public String tradeInfo(@PathVariable Integer id,Model model){
    	TradeRecord tradeRecord = tradeService.tradeRecord(id);
    	model.addAttribute(tradeRecord);
    	DictionaryTradeType tradeType = tradeService.tradeType(tradeRecord.getTradeTypeId());
    	model.addAttribute("tradeType",tradeType);
    	Profit profit = tradeService.tradeRecordProfit(id);
    	if(profit!=null) {
    		model.addAttribute(profit);
    	}
        return "trade/trade_info";
    }
    
    @RequestMapping(value = "/{id}/statistics",method = RequestMethod.GET)
    public String statistics(@PathVariable Integer id,Model model){
        DictionaryTradeType tradeType = tradeService.tradeType(id);
        model.addAttribute("tradeType",tradeType);
        List<Map<String,Object>> statistics = tradeService.profitStatistics();
        model.addAttribute("statistics",statistics);
        return "trade/trade_statistics";
    }
    
    @RequestMapping(value = "/import",method = RequestMethod.POST)
    @ResponseBody
    public Response importTrades(MultipartFile file){
    	try {
			List<Integer> errorRowNum = tradeService.importTrades(file.getInputStream());
			if(errorRowNum.size() == 0) {
				return Response.getSuccess(null);
			}else{
				String errMsg = Joiner.on(',').join(errorRowNum);
				return Response.getError("第["+errMsg+"]行导入出错，其余已导入成功。");
			}
		} catch (InvalidFormatException | IOException e) {
			LOG.error("",e);
		}
    	return Response.getError("程序异常。");
    }
}
