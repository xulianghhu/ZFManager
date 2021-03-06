package com.comdosoft.financial.manage.controller.system;

import com.comdosoft.financial.manage.domain.Response;
import com.comdosoft.financial.manage.domain.zhangfu.City;
import com.comdosoft.financial.manage.domain.zhangfu.CustomerAddress;
import com.comdosoft.financial.manage.domain.zhangfu.Factory;
import com.comdosoft.financial.manage.service.CityService;
import com.comdosoft.financial.manage.service.CustomerAddressService;
import com.comdosoft.financial.manage.service.FactoryService;
import com.comdosoft.financial.manage.utils.FreeMarkerUtils;
import com.comdosoft.financial.manage.utils.HttpFile;
import com.comdosoft.financial.manage.utils.page.Page;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by quqiang on 15/3/24.
 */
@Controller
@RequestMapping("/system/factory")
public class FactoryController {

    private Logger LOG = LoggerFactory.getLogger(FactoryController.class);

    @Value("${path.root}")
    private String rootPath;
    @Value("${path.prefix.factory}")
    private String factoryPath;
    @Value("${sysFactoryPath}")
    private String newFactoryPath;
    @Value("${filePath}")
    private String filePath;
    
    @Autowired
    private FactoryService factoryService;
    @Autowired
    private CustomerAddressService customerAddressService;
    @Autowired
    private CityService cityService;

    @RequestMapping(value="list",method= RequestMethod.GET)
    public String list(Integer page, Byte status, String keys, Model model){
        findPage(page, status, keys, model);
        return "system/factory_list";
    }

    @RequestMapping(value="page",method=RequestMethod.GET)
    public String page(Integer page, Byte status, String keys, Model model){
        findPage(page, status, keys, model);
        return "system/factory_list_page";
    }


    @RequestMapping(value="{id}/firstUnCheck",method=RequestMethod.GET)
    public String firstUnCheck(@PathVariable Integer id, Model model){
        Factory factory = factoryService.statusFirstUnCheck(id);
        model.addAttribute("factory", factory);
        return "system/factory_list_page_row";
    }

    @RequestMapping(value="{id}/firstCheck",method=RequestMethod.GET)
    public String firstCheck(@PathVariable Integer id, Model model){
        Factory factory = factoryService.statusFirstCheck(id);
        model.addAttribute("factory", factory);
        return "system/factory_list_page_row";
    }

    @RequestMapping(value="{id}/unCheck",method=RequestMethod.GET)
    public String unCheck(@PathVariable Integer id, Model model){
        Factory factory = factoryService.statusUnCheck(id);
        model.addAttribute("factory", factory);
        return "system/factory_list_page_row";
    }

    @RequestMapping(value="{id}/check",method=RequestMethod.GET)
    public String check(@PathVariable Integer id, Model model){
        Factory factory = factoryService.statusCheck(id);
        model.addAttribute("factory", factory);
        return "system/factory_list_page_row";
    }

    @RequestMapping(value="{id}/stop",method=RequestMethod.GET)
    public String stop(@PathVariable Integer id, Model model){
        Factory factory = factoryService.statusStop(id);
        model.addAttribute("factory", factory);
        return "system/factory_list_page_row";
    }

    @RequestMapping(value="{id}/start",method=RequestMethod.GET)
    public String start(@PathVariable Integer id, Model model){
        Factory factory = factoryService.statusWaitingFirstCheck(id);
        model.addAttribute("factory", factory);
        return "system/factory_list_page_row";
    }

    @RequestMapping(value="{id}/resetpwd",method=RequestMethod.GET)
    public String resetPassword(@PathVariable Integer id, Model model){
        Factory factory = factoryService.findFactoryInfo(id);
        model.addAttribute("customer", factory.getCustomer());
        return "system/factory_reset_pwd";
    }

    @RequestMapping(value="{id}/info",method=RequestMethod.GET)
    public String info(@PathVariable Integer id, Model model) throws Exception{
        Factory factory = factoryService.findFactoryInfo(id);
        List<CustomerAddress> addresses = customerAddressService.selectCustomerAddress(factory.getCustomerId());
        String imgPath = filePath + factory.getLogoFilePath();
        factory.setLogoFilePath(imgPath);
        model.addAttribute("factory", factory);
        model.addAttribute("addresses", addresses);
        model.addAttribute("Factory", FreeMarkerUtils.useClass(Factory.class.getName()));
        return "system/factory_info";
    }

    @RequestMapping(value="create",method=RequestMethod.GET)
    public String create(Model model) throws Exception{
        List<City> provinces = cityService.provinces();
        model.addAttribute("provinces", provinces);
        return "system/factory_create";
    }

    @RequestMapping(value="{id}/edit",method=RequestMethod.GET)
    public String edit(@PathVariable Integer id, Model model) {
        Factory factory = factoryService.findFactoryInfo(id);
        List<CustomerAddress> addresses = customerAddressService.selectCustomerAddress(factory.getCustomerId());
        if(addresses != null && addresses.size() > 0){
            model.addAttribute("address", addresses.get(0));
        }
        List<City> provinces = cityService.provinces();
        model.addAttribute("provinces", provinces);
        model.addAttribute("factory", factory);
        return "system/factory_create";
    }

    @RequestMapping(value="uploadImg",method=RequestMethod.POST)
    @ResponseBody
    public Response uploadImg(MultipartFile file,HttpServletRequest request){
        String path = newFactoryPath ;
    	String[] suffixes = {"BMP","JPG","JPEG","PNG","GIF"};
    	String name = file.getOriginalFilename();
    	int length = name.length();
    	boolean flg = false;
    	for(String suffix : suffixes){
    		if(name.substring(name.indexOf(".")+1,length).equalsIgnoreCase(suffix)){
    			flg = true;
    			break;
    		}
    	}
    	if(!flg){
			return Response.getError("上传文件类型不正确，只能是图片格式，请重新上传");
		}

        if(file.getSize() > 2 * 1024 * 1024){
            return Response.getError("上传文件超过2MB，请重新上传");
        }

    	String result = HttpFile.upload(file, path);
    	if(result.indexOf("失败")>0){
    		LOG.info("文件上传失败");
    		return Response.getError("上传失败");
    	}
    	List<String> list = new ArrayList<String>();
    	list.add(filePath);
    	list.add(result);
        return Response.getSuccess(list);
    }

    @RequestMapping(value="{id}/edit",method=RequestMethod.POST)
    @ResponseBody
    public Response edit(@PathVariable Integer id, Byte types, String name, String username, String password,
                         Byte accountType, String logoFilePath, String websiteUrl, String description,
                         Integer cityId, String address, String cellphone, Model model){
        factoryService.update(id, types, name, username, password, accountType,
                logoFilePath, websiteUrl, description, cityId, address, cellphone);
        return Response.getSuccess(null);
    }

    @RequestMapping(value="create",method=RequestMethod.POST)
    @ResponseBody
    public Response create(Byte types, String name, String username, String password,
            Byte accountType, String logoFilePath, String websiteUrl, String description,
            Integer cityId, String address, String cellphone, Model model){
        factoryService.create(types, name, username, password, accountType,
                logoFilePath, websiteUrl, description, cityId, address, cellphone);
        return Response.getSuccess(null);
    }

    private void findPage(Integer page, Byte status, String keys, Model model){
        if (page == null) {
            page = 1;
        }
        if (status != null && status == 0) {
            status = null;
        }
        Page<Factory> factories = factoryService.findPages(page, status, keys);
        model.addAttribute("page", factories);
    }

}
