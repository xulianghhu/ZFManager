package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class CustomerAgentRelation extends CustomerAgentRelationKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_agent_relations.customer_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_agent_relations.agent_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer agentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_agent_relations.status
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_agent_relations.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_agent_relations.updated_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_agent_relations.types
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer types;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_agent_relations.customer_id
     *
     * @return the value of customer_agent_relations.customer_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_agent_relations.customer_id
     *
     * @param customerId the value for customer_agent_relations.customer_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_agent_relations.agent_id
     *
     * @return the value of customer_agent_relations.agent_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getAgentId() {
        return agentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_agent_relations.agent_id
     *
     * @param agentId the value for customer_agent_relations.agent_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_agent_relations.status
     *
     * @return the value of customer_agent_relations.status
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_agent_relations.status
     *
     * @param status the value for customer_agent_relations.status
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_agent_relations.created_at
     *
     * @return the value of customer_agent_relations.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_agent_relations.created_at
     *
     * @param createdAt the value for customer_agent_relations.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_agent_relations.updated_at
     *
     * @return the value of customer_agent_relations.updated_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_agent_relations.updated_at
     *
     * @param updatedAt the value for customer_agent_relations.updated_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_agent_relations.types
     *
     * @return the value of customer_agent_relations.types
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getTypes() {
        return types;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_agent_relations.types
     *
     * @param types the value for customer_agent_relations.types
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setTypes(Integer types) {
        this.types = types;
    }
}