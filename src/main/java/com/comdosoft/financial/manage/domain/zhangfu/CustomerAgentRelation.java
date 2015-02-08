package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class CustomerAgentRelation {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_agent_relations.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_agent_relations.customer_id
	 * @mbggenerated
	 */
	private Integer customerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_agent_relations.agent_id
	 * @mbggenerated
	 */
	private Integer agentId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_agent_relations.status
	 * @mbggenerated
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_agent_relations.created_at
	 * @mbggenerated
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_agent_relations.updated_at
	 * @mbggenerated
	 */
	private Date updatedAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column customer_agent_relations.types
	 * @mbggenerated
	 */
	private Integer types;
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_agent_relations.id
	 * @return  the value of customer_agent_relations.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_agent_relations.id
	 * @param id  the value for customer_agent_relations.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_agent_relations.customer_id
	 * @return  the value of customer_agent_relations.customer_id
	 * @mbggenerated
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_agent_relations.customer_id
	 * @param customerId  the value for customer_agent_relations.customer_id
	 * @mbggenerated
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_agent_relations.agent_id
	 * @return  the value of customer_agent_relations.agent_id
	 * @mbggenerated
	 */
	public Integer getAgentId() {
		return agentId;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_agent_relations.agent_id
	 * @param agentId  the value for customer_agent_relations.agent_id
	 * @mbggenerated
	 */
	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_agent_relations.status
	 * @return  the value of customer_agent_relations.status
	 * @mbggenerated
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_agent_relations.status
	 * @param status  the value for customer_agent_relations.status
	 * @mbggenerated
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_agent_relations.created_at
	 * @return  the value of customer_agent_relations.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_agent_relations.created_at
	 * @param createdAt  the value for customer_agent_relations.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_agent_relations.updated_at
	 * @return  the value of customer_agent_relations.updated_at
	 * @mbggenerated
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_agent_relations.updated_at
	 * @param updatedAt  the value for customer_agent_relations.updated_at
	 * @mbggenerated
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column customer_agent_relations.types
	 * @return  the value of customer_agent_relations.types
	 * @mbggenerated
	 */
	public Integer getTypes() {
		return types;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column customer_agent_relations.types
	 * @param types  the value for customer_agent_relations.types
	 * @mbggenerated
	 */
	public void setTypes(Integer types) {
		this.types = types;
	}
	public static final int TYPE_CUSTOMER = 0;
	public static final int TYPE_STAFF = 1;
}