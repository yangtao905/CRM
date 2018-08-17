package yt.service;

import java.util.List;

import yt.pojo.Customer;
import yt.pojo.QueryVo;

public interface CustomerService {

	public List<Customer> getCustomerList(QueryVo queryVo);
	
	public Customer getCustomerById(Integer cust_id);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(Integer id);
}
