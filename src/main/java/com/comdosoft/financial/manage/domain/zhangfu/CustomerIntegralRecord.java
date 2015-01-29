package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class CustomerIntegralRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_integral_records.id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_integral_records.customer_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_integral_records.types
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Byte types;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_integral_records.quantity
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_integral_records.target_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer targetId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_integral_records.target_type
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Byte targetType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_integral_records.created_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_integral_records.updated_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_integral_records.description
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_integral_records.id
     *
     * @return the value of customer_integral_records.id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_integral_records.id
     *
     * @param id the value for customer_integral_records.id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_integral_records.customer_id
     *
     * @return the value of customer_integral_records.customer_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_integral_records.customer_id
     *
     * @param customerId the value for customer_integral_records.customer_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_integral_records.types
     *
     * @return the value of customer_integral_records.types
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Byte getTypes() {
        return types;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_integral_records.types
     *
     * @param types the value for customer_integral_records.types
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setTypes(Byte types) {
        this.types = types;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_integral_records.quantity
     *
     * @return the value of customer_integral_records.quantity
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_integral_records.quantity
     *
     * @param quantity the value for customer_integral_records.quantity
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_integral_records.target_id
     *
     * @return the value of customer_integral_records.target_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getTargetId() {
        return targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_integral_records.target_id
     *
     * @param targetId the value for customer_integral_records.target_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_integral_records.target_type
     *
     * @return the value of customer_integral_records.target_type
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Byte getTargetType() {
        return targetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_integral_records.target_type
     *
     * @param targetType the value for customer_integral_records.target_type
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setTargetType(Byte targetType) {
        this.targetType = targetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_integral_records.created_at
     *
     * @return the value of customer_integral_records.created_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_integral_records.created_at
     *
     * @param createdAt the value for customer_integral_records.created_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_integral_records.updated_at
     *
     * @return the value of customer_integral_records.updated_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_integral_records.updated_at
     *
     * @param updatedAt the value for customer_integral_records.updated_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_integral_records.description
     *
     * @return the value of customer_integral_records.description
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_integral_records.description
     *
     * @param description the value for customer_integral_records.description
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setDescription(String description) {
        this.description = description;
    }
}