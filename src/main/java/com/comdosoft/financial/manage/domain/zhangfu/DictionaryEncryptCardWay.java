package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class DictionaryEncryptCardWay {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary_encrypt_card_ways.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary_encrypt_card_ways.encrypt_card_way
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private String encryptCardWay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary_encrypt_card_ways.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Date createdAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary_encrypt_card_ways.id
     *
     * @return the value of dictionary_encrypt_card_ways.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary_encrypt_card_ways.id
     *
     * @param id the value for dictionary_encrypt_card_ways.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary_encrypt_card_ways.encrypt_card_way
     *
     * @return the value of dictionary_encrypt_card_ways.encrypt_card_way
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public String getEncryptCardWay() {
        return encryptCardWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary_encrypt_card_ways.encrypt_card_way
     *
     * @param encryptCardWay the value for dictionary_encrypt_card_ways.encrypt_card_way
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setEncryptCardWay(String encryptCardWay) {
        this.encryptCardWay = encryptCardWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary_encrypt_card_ways.created_at
     *
     * @return the value of dictionary_encrypt_card_ways.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary_encrypt_card_ways.created_at
     *
     * @param createdAt the value for dictionary_encrypt_card_ways.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}