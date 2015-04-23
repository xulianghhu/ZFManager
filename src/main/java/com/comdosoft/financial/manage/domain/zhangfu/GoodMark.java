package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class GoodMark {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column good_marks.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column good_marks.good_id
	 * @mbggenerated
	 */
	private Integer goodId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column good_marks.customer_id
	 * @mbggenerated
	 */
	private Integer customerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column good_marks.created_at
	 * @mbggenerated
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column good_marks.content
	 * @mbggenerated
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column good_marks.id
	 * @return  the value of good_marks.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column good_marks.id
	 * @param id  the value for good_marks.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column good_marks.good_id
	 * @return  the value of good_marks.good_id
	 * @mbggenerated
	 */
	public Integer getGoodId() {
		return goodId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column good_marks.good_id
	 * @param goodId  the value for good_marks.good_id
	 * @mbggenerated
	 */
	public void setGoodId(Integer goodId) {
		this.goodId = goodId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column good_marks.customer_id
	 * @return  the value of good_marks.customer_id
	 * @mbggenerated
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column good_marks.customer_id
	 * @param customerId  the value for good_marks.customer_id
	 * @mbggenerated
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column good_marks.created_at
	 * @return  the value of good_marks.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column good_marks.created_at
	 * @param createdAt  the value for good_marks.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column good_marks.content
	 * @return  the value of good_marks.content
	 * @mbggenerated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column good_marks.content
	 * @param content  the value for good_marks.content
	 * @mbggenerated
	 */
	public void setContent(String content) {
		this.content = content;
	}
}