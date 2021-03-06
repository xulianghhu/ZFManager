package com.comdosoft.financial.manage.mapper.zhangfu;

import java.util.List;

import com.comdosoft.financial.manage.domain.zhangfu.CsChangeMark;

public interface CsChangeMarkMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_change_marks
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_change_marks
	 * @mbggenerated
	 */
	int insert(CsChangeMark record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_change_marks
	 * @mbggenerated
	 */
	CsChangeMark selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_change_marks
	 * @mbggenerated
	 */
	List<CsChangeMark> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_change_marks
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CsChangeMark record);

	/**
	 * select marks by cs_change_id
	 * 
	 * @param csChangeId
	 * @return
	 */
	List<CsChangeMark> selectByChangeId(Integer csChangeId);
}