package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsChange;
import com.comdosoft.financial.manage.domain.zhangfu.CsChangeWithBLOBs;

public interface CsChangeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changes
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changes
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(CsChangeWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changes
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(CsChangeWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changes
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    CsChangeWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changes
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(CsChangeWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changes
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(CsChangeWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_changes
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(CsChange record);
}