package com.comdosoft.financial.manage.domain.zhangfu;

public class OtherRequirement {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column other_requirements.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column other_requirements.title
	 * @mbggenerated
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column other_requirements.templet_file_path
	 * @mbggenerated
	 */
	private String templetFilePath;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column other_requirements.pay_channel_id
	 * @mbggenerated
	 */
	private Integer payChannelId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column other_requirements.types
	 * @mbggenerated
	 */
	private Byte types;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column other_requirements.description
	 * @mbggenerated
	 */
	private String description;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column other_requirements.id
	 * @return  the value of other_requirements.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column other_requirements.id
	 * @param id  the value for other_requirements.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column other_requirements.title
	 * @return  the value of other_requirements.title
	 * @mbggenerated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column other_requirements.title
	 * @param title  the value for other_requirements.title
	 * @mbggenerated
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column other_requirements.templet_file_path
	 * @return  the value of other_requirements.templet_file_path
	 * @mbggenerated
	 */
	public String getTempletFilePath() {
		return templetFilePath;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column other_requirements.templet_file_path
	 * @param templetFilePath  the value for other_requirements.templet_file_path
	 * @mbggenerated
	 */
	public void setTempletFilePath(String templetFilePath) {
		this.templetFilePath = templetFilePath;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column other_requirements.pay_channel_id
	 * @return  the value of other_requirements.pay_channel_id
	 * @mbggenerated
	 */
	public Integer getPayChannelId() {
		return payChannelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column other_requirements.pay_channel_id
	 * @param payChannelId  the value for other_requirements.pay_channel_id
	 * @mbggenerated
	 */
	public void setPayChannelId(Integer payChannelId) {
		this.payChannelId = payChannelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column other_requirements.types
	 * @return  the value of other_requirements.types
	 * @mbggenerated
	 */
	public Byte getTypes() {
		return types;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column other_requirements.types
	 * @param types  the value for other_requirements.types
	 * @mbggenerated
	 */
	public void setTypes(Byte types) {
		this.types = types;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column other_requirements.description
	 * @return  the value of other_requirements.description
	 * @mbggenerated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column other_requirements.description
	 * @param description  the value for other_requirements.description
	 * @mbggenerated
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public static final Byte TYPE_CANCEL = 1;	// 取消
	public static final Byte TYPE_UPDATE = 2;	// 更新
}