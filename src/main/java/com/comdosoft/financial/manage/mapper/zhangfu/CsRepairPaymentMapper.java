package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsRepairPayment;

public interface CsRepairPaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insert(CsRepairPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insertSelective(CsRepairPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    CsRepairPayment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKeySelective(CsRepairPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_payments
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKey(CsRepairPayment record);
}