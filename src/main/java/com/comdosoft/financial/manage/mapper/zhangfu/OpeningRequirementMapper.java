package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.OpeningRequirement;

public interface OpeningRequirementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table opening_requirements
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table opening_requirements
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(OpeningRequirement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table opening_requirements
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(OpeningRequirement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table opening_requirements
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    OpeningRequirement selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table opening_requirements
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(OpeningRequirement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table opening_requirements
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(OpeningRequirement record);
}