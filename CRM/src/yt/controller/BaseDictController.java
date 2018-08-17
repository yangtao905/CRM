package yt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yt.pojo.BaseDict;
import yt.pojo.Customer;
import yt.pojo.QueryVo;
import yt.service.BaseDictService;
import yt.service.CustomerService;

@Controller
public class BaseDictController {
	
	@Value("${crm_fromType}")
	private String crm_fromType;
	@Value("${crm_industryType}")
	private String crm_industryType;
	@Value("${crm_levelType}")
	private String crm_levelType;
	

	@Autowired
	private BaseDictService baseDictService;
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("list")
	String getBaseDictByCode (String code,Model model,QueryVo queryVo){
//		客户来源
		List<BaseDict> baseDicts1 = baseDictService.getBaseDictByCode(crm_fromType);
		model.addAttribute("fromType", baseDicts1);
//		客户行业
		List<BaseDict> baseDicts2 = baseDictService.getBaseDictByCode(crm_industryType);
		model.addAttribute("industryType", baseDicts2);
//		客户级别
		List<BaseDict> baseDicts3 = baseDictService.getBaseDictByCode(crm_levelType);
		model.addAttribute("levelType", baseDicts3);
//		获取客户信息
		List<Customer> customers = customerService.getCustomerList(queryVo);
		model.addAttribute("customers", customers);
		return "customer";
	}
	
	@RequestMapping("edit")
	@ResponseBody
	public Customer getCustomerById(Integer id){
		Customer customer = customerService.getCustomerById(id);
		return customer;
	}
	

}
