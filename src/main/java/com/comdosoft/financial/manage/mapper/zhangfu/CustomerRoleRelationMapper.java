package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CustomerRoleRelation;

public interface CustomerRoleRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_role_relations
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_role_relations
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insert(CustomerRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_role_relations
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insertSelective(CustomerRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_role_relations
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    CustomerRoleRelation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_role_relations
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKeySelective(CustomerRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_role_relations
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKey(CustomerRoleRelation record);
}