package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class CsChangelMark {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_changel_marks.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_changel_marks.cs_changel_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer csChangelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_changel_marks.custom_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer customId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_changel_marks.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cs_changel_marks.content
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_changel_marks.id
     *
     * @return the value of cs_changel_marks.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_changel_marks.id
     *
     * @param id the value for cs_changel_marks.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_changel_marks.cs_changel_id
     *
     * @return the value of cs_changel_marks.cs_changel_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getCsChangelId() {
        return csChangelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_changel_marks.cs_changel_id
     *
     * @param csChangelId the value for cs_changel_marks.cs_changel_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setCsChangelId(Integer csChangelId) {
        this.csChangelId = csChangelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_changel_marks.custom_id
     *
     * @return the value of cs_changel_marks.custom_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getCustomId() {
        return customId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_changel_marks.custom_id
     *
     * @param customId the value for cs_changel_marks.custom_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_changel_marks.created_at
     *
     * @return the value of cs_changel_marks.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_changel_marks.created_at
     *
     * @param createdAt the value for cs_changel_marks.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cs_changel_marks.content
     *
     * @return the value of cs_changel_marks.content
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cs_changel_marks.content
     *
     * @param content the value for cs_changel_marks.content
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setContent(String content) {
        this.content = content;
    }
}