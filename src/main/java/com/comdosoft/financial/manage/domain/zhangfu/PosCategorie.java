package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class PosCategorie {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pos_categories.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pos_categories.name
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pos_categories.parent_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pos_categories.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pos_categories.id
     *
     * @return the value of pos_categories.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pos_categories.id
     *
     * @param id the value for pos_categories.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pos_categories.name
     *
     * @return the value of pos_categories.name
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pos_categories.name
     *
     * @param name the value for pos_categories.name
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pos_categories.parent_id
     *
     * @return the value of pos_categories.parent_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pos_categories.parent_id
     *
     * @param parentId the value for pos_categories.parent_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pos_categories.created_at
     *
     * @return the value of pos_categories.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pos_categories.created_at
     *
     * @param createdAt the value for pos_categories.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}