package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsAgentMark;

public interface CsAgentMarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_agent_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_agent_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insert(CsAgentMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_agent_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insertSelective(CsAgentMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_agent_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    CsAgentMark selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_agent_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKeySelective(CsAgentMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_agent_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(CsAgentMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_agent_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKey(CsAgentMark record);
}