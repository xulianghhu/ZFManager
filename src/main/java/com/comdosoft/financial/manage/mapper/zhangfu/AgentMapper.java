package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.Agent;

public interface AgentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agents
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agents
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(Agent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agents
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(Agent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agents
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    Agent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agents
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(Agent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table agents
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(Agent record);
}