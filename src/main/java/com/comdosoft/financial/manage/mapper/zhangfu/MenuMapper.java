package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.Menu;

import java.util.List;

public interface MenuMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table menus
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table menus
	 * @mbggenerated
	 */
	int insert(Menu record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table menus
	 * @mbggenerated
	 */
	Menu selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table menus
	 * @mbggenerated
	 */
	List<Menu> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table menus
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Menu record);

	List<Menu> selectOrderedAll();
	
    List<String> customerMenuKeys(Integer customerId);
}