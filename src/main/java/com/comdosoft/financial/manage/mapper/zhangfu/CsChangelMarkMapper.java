package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsChangelMark;

public interface CsChangelMarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(CsChangelMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(CsChangelMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    CsChangelMark selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(CsChangelMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(CsChangelMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changel_marks
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(CsChangelMark record);
}