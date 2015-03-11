package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.Customer;
import com.comdosoft.financial.manage.utils.page.PageRequest;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customers
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customers
	 * @mbggenerated
	 */
	int insert(Customer record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customers
	 * @mbggenerated
	 */
	Customer selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customers
	 * @mbggenerated
	 */
	List<Customer> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table customers
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Customer record);

	Customer selectByLogin(String passport,String password);

	List<Customer> selectCustomerPageList(@Param("request") PageRequest request,
			@Param("query") String query, @Param("type") Byte type, @Param("status") Byte status);

	long countTotalCustomer(@Param("query") String query,
			@Param("type") Byte type,@Param("status") Byte status);

    Customer selectByUsername(String username);

    Customer selectCustomerInfo(Integer id);


}