package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.OrderLogistic;

public interface OrderLogisticMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_logistics
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_logistics
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insert(OrderLogistic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_logistics
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insertSelective(OrderLogistic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_logistics
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    OrderLogistic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_logistics
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKeySelective(OrderLogistic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_logistics
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKey(OrderLogistic record);
}