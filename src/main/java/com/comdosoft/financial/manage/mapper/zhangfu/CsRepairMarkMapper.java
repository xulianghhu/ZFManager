package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsRepairMark;

public interface CsRepairMarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(CsRepairMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(CsRepairMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    CsRepairMark selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(CsRepairMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(CsRepairMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_repair_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(CsRepairMark record);
}