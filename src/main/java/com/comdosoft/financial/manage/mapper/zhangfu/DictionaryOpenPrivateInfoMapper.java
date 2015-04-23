package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.DictionaryOpenPrivateInfo;
import java.util.List;

public interface DictionaryOpenPrivateInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dictionary_open_private_infos
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dictionary_open_private_infos
	 * @mbggenerated
	 */
	int insert(DictionaryOpenPrivateInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dictionary_open_private_infos
	 * @mbggenerated
	 */
	DictionaryOpenPrivateInfo selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dictionary_open_private_infos
	 * @mbggenerated
	 */
	List<DictionaryOpenPrivateInfo> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table dictionary_open_private_infos
	 * @mbggenerated
	 */
	int updateByPrimaryKey(DictionaryOpenPrivateInfo record);
}