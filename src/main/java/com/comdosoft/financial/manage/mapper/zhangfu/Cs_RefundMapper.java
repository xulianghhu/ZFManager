package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.Cs_Refund;

public interface Cs_RefundMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_refunds
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_refunds
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insert(Cs_Refund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_refunds
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insertSelective(Cs_Refund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_refunds
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    Cs_Refund selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_refunds
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKeySelective(Cs_Refund record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_refunds
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKey(Cs_Refund record);
}