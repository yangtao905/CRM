package yt.mapper;

import java.util.List;

import yt.pojo.Customer;
import yt.pojo.QueryVo;

public interface CustomerMapper {
	
	
	/**
	 * 查询客户信息
	 */
	public List<Customer> getCustomerList(QueryVo queryVo);
	
	/**
	 * 通过id获取用户信息
	 * @param cust_id
	 * @return
	 */
	public Customer getCustomerById(Integer cust_id);

	/**
	 * 修改客户信息
	 * @param customer
	 */
	public void updateCustomer(Customer customer);
	/**
	 * 删除客户信息用过id
	 * @param id 编号
	 */
	public void deleteCustomer(Integer id);
}
