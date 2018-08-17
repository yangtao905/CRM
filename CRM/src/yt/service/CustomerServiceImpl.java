package yt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yt.mapper.CustomerMapper;
import yt.pojo.Customer;
import yt.pojo.QueryVo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper custmerMapper;

	@Override
	public List<Customer> getCustomerList(QueryVo queryVo) {
		return custmerMapper.getCustomerList(queryVo);
	}

	@Override
	public Customer getCustomerById(Integer cust_id) {
		return custmerMapper.getCustomerById(cust_id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		custmerMapper.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Integer id) {
		custmerMapper.deleteCustomer(id);
	}

}
