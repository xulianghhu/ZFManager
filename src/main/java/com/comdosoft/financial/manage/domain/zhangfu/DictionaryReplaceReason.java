package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class DictionaryReplaceReason {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary_replace_reasons.id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary_replace_reasons.replace_reason
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private String replaceReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary_replace_reasons.created_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary_replace_reasons.id
     *
     * @return the value of dictionary_replace_reasons.id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary_replace_reasons.id
     *
     * @param id the value for dictionary_replace_reasons.id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary_replace_reasons.replace_reason
     *
     * @return the value of dictionary_replace_reasons.replace_reason
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public String getReplaceReason() {
        return replaceReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary_replace_reasons.replace_reason
     *
     * @param replaceReason the value for dictionary_replace_reasons.replace_reason
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setReplaceReason(String replaceReason) {
        this.replaceReason = replaceReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary_replace_reasons.created_at
     *
     * @return the value of dictionary_replace_reasons.created_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary_replace_reasons.created_at
     *
     * @param createdAt the value for dictionary_replace_reasons.created_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}