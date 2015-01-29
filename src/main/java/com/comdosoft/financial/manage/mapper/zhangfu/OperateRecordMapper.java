package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.OperateRecord;

public interface OperateRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_records
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_records
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(OperateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_records
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(OperateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_records
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    OperateRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_records
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(OperateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_records
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(OperateRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operate_records
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(OperateRecord record);
}