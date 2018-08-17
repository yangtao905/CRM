package yt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yt.pojo.Customer;
import yt.service.CustomerService;

@Controller
public class CustomerController {

	
	@Autowired
	private CustomerService customerService;
	
	
	@RequestMapping("update")
	@ResponseBody
	public String updateCustomer(Model model,Customer customer) {
		System.out.println("customer:"+customer);
		customerService.updateCustomer(customer);
		return "success";
	}
	
	@RequestMapping("delete")
	@ResponseBody
	public String deleteCustomerById(Integer id) {
		customerService.deleteCustomer(id);
		return "success";
	}

	
}
