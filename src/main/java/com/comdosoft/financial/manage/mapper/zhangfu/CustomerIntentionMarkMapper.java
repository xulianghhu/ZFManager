package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CustomerIntentionMark;

public interface CustomerIntentionMarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(CustomerIntentionMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(CustomerIntentionMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    CustomerIntentionMark selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(CustomerIntentionMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(CustomerIntentionMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_intention_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(CustomerIntentionMark record);
}