package com.comdosoft.financial.manage.domain.trades;

import java.util.Date;

public class Profit {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.trade_record_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer tradeRecordId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.terminal_number
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private String terminalNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.current_agent_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer currentAgentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.amount
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.profits_get
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer profitsGet;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.profits_pay
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer profitsPay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.status
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.factory_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer factoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.types
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Byte types;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.pay_channel_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer payChannelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.merchant_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer merchantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.traded_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Date tradedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.created_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.updated_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.account_number
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private String accountNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profits.top_agent_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    private Integer topAgentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.id
     *
     * @return the value of profits.id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.id
     *
     * @param id the value for profits.id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.trade_record_id
     *
     * @return the value of profits.trade_record_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getTradeRecordId() {
        return tradeRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.trade_record_id
     *
     * @param tradeRecordId the value for profits.trade_record_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setTradeRecordId(Integer tradeRecordId) {
        this.tradeRecordId = tradeRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.terminal_number
     *
     * @return the value of profits.terminal_number
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public String getTerminalNumber() {
        return terminalNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.terminal_number
     *
     * @param terminalNumber the value for profits.terminal_number
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.current_agent_id
     *
     * @return the value of profits.current_agent_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getCurrentAgentId() {
        return currentAgentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.current_agent_id
     *
     * @param currentAgentId the value for profits.current_agent_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setCurrentAgentId(Integer currentAgentId) {
        this.currentAgentId = currentAgentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.amount
     *
     * @return the value of profits.amount
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.amount
     *
     * @param amount the value for profits.amount
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.profits_get
     *
     * @return the value of profits.profits_get
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getProfitsGet() {
        return profitsGet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.profits_get
     *
     * @param profitsGet the value for profits.profits_get
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setProfitsGet(Integer profitsGet) {
        this.profitsGet = profitsGet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.profits_pay
     *
     * @return the value of profits.profits_pay
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getProfitsPay() {
        return profitsPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.profits_pay
     *
     * @param profitsPay the value for profits.profits_pay
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setProfitsPay(Integer profitsPay) {
        this.profitsPay = profitsPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.status
     *
     * @return the value of profits.status
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.status
     *
     * @param status the value for profits.status
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.factory_id
     *
     * @return the value of profits.factory_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getFactoryId() {
        return factoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.factory_id
     *
     * @param factoryId the value for profits.factory_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.types
     *
     * @return the value of profits.types
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Byte getTypes() {
        return types;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.types
     *
     * @param types the value for profits.types
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setTypes(Byte types) {
        this.types = types;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.pay_channel_id
     *
     * @return the value of profits.pay_channel_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getPayChannelId() {
        return payChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.pay_channel_id
     *
     * @param payChannelId the value for profits.pay_channel_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setPayChannelId(Integer payChannelId) {
        this.payChannelId = payChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.merchant_id
     *
     * @return the value of profits.merchant_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.merchant_id
     *
     * @param merchantId the value for profits.merchant_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.traded_at
     *
     * @return the value of profits.traded_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Date getTradedAt() {
        return tradedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.traded_at
     *
     * @param tradedAt the value for profits.traded_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setTradedAt(Date tradedAt) {
        this.tradedAt = tradedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.created_at
     *
     * @return the value of profits.created_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.created_at
     *
     * @param createdAt the value for profits.created_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.updated_at
     *
     * @return the value of profits.updated_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.updated_at
     *
     * @param updatedAt the value for profits.updated_at
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.account_number
     *
     * @return the value of profits.account_number
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.account_number
     *
     * @param accountNumber the value for profits.account_number
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profits.top_agent_id
     *
     * @return the value of profits.top_agent_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public Integer getTopAgentId() {
        return topAgentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profits.top_agent_id
     *
     * @param topAgentId the value for profits.top_agent_id
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    public void setTopAgentId(Integer topAgentId) {
        this.topAgentId = topAgentId;
    }
}