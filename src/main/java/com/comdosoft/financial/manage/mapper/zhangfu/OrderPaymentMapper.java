package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.OrderPayment;

public interface OrderPaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insert(OrderPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insertSelective(OrderPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    OrderPayment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKeySelective(OrderPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKey(OrderPayment record);
}