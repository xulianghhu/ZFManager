package com.comdosoft.financial.manage.domain.trades;

import java.util.Date;

public class TradeRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.trade_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private String tradeNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.batch_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private String batchNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.terminal_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private String terminalNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.order_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private String orderNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.agent_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer agentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.merchant_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer merchantNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.pay_channel_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer payChannelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.profit_price
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer profitPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.amount
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.poundage
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer poundage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.traded_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Date tradedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.sys_order_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer sysOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.account_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private String accountNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.account_name
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private String accountName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.actual_payment_price
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer actualPaymentPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.paid_result
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Byte paidResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.paid_code
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer paidCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.paid_error_description
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private String paidErrorDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Date createdAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.updated_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.trade_type_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer tradeTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.traded_status
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer tradedStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_records.attach_status
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    private Integer attachStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.id
     *
     * @return the value of trade_records.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.id
     *
     * @param id the value for trade_records.id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.trade_number
     *
     * @return the value of trade_records.trade_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public String getTradeNumber() {
        return tradeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.trade_number
     *
     * @param tradeNumber the value for trade_records.trade_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setTradeNumber(String tradeNumber) {
        this.tradeNumber = tradeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.batch_number
     *
     * @return the value of trade_records.batch_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.batch_number
     *
     * @param batchNumber the value for trade_records.batch_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.terminal_number
     *
     * @return the value of trade_records.terminal_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public String getTerminalNumber() {
        return terminalNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.terminal_number
     *
     * @param terminalNumber the value for trade_records.terminal_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setTerminalNumber(String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.order_number
     *
     * @return the value of trade_records.order_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.order_number
     *
     * @param orderNumber the value for trade_records.order_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.agent_id
     *
     * @return the value of trade_records.agent_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getAgentId() {
        return agentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.agent_id
     *
     * @param agentId the value for trade_records.agent_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.merchant_number
     *
     * @return the value of trade_records.merchant_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getMerchantNumber() {
        return merchantNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.merchant_number
     *
     * @param merchantNumber the value for trade_records.merchant_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setMerchantNumber(Integer merchantNumber) {
        this.merchantNumber = merchantNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.pay_channel_id
     *
     * @return the value of trade_records.pay_channel_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getPayChannelId() {
        return payChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.pay_channel_id
     *
     * @param payChannelId the value for trade_records.pay_channel_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setPayChannelId(Integer payChannelId) {
        this.payChannelId = payChannelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.profit_price
     *
     * @return the value of trade_records.profit_price
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getProfitPrice() {
        return profitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.profit_price
     *
     * @param profitPrice the value for trade_records.profit_price
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setProfitPrice(Integer profitPrice) {
        this.profitPrice = profitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.amount
     *
     * @return the value of trade_records.amount
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.amount
     *
     * @param amount the value for trade_records.amount
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.poundage
     *
     * @return the value of trade_records.poundage
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getPoundage() {
        return poundage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.poundage
     *
     * @param poundage the value for trade_records.poundage
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setPoundage(Integer poundage) {
        this.poundage = poundage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.traded_at
     *
     * @return the value of trade_records.traded_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Date getTradedAt() {
        return tradedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.traded_at
     *
     * @param tradedAt the value for trade_records.traded_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setTradedAt(Date tradedAt) {
        this.tradedAt = tradedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.sys_order_id
     *
     * @return the value of trade_records.sys_order_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getSysOrderId() {
        return sysOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.sys_order_id
     *
     * @param sysOrderId the value for trade_records.sys_order_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setSysOrderId(Integer sysOrderId) {
        this.sysOrderId = sysOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.account_number
     *
     * @return the value of trade_records.account_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.account_number
     *
     * @param accountNumber the value for trade_records.account_number
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.account_name
     *
     * @return the value of trade_records.account_name
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.account_name
     *
     * @param accountName the value for trade_records.account_name
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.actual_payment_price
     *
     * @return the value of trade_records.actual_payment_price
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getActualPaymentPrice() {
        return actualPaymentPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.actual_payment_price
     *
     * @param actualPaymentPrice the value for trade_records.actual_payment_price
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setActualPaymentPrice(Integer actualPaymentPrice) {
        this.actualPaymentPrice = actualPaymentPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.paid_result
     *
     * @return the value of trade_records.paid_result
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Byte getPaidResult() {
        return paidResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.paid_result
     *
     * @param paidResult the value for trade_records.paid_result
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setPaidResult(Byte paidResult) {
        this.paidResult = paidResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.paid_code
     *
     * @return the value of trade_records.paid_code
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getPaidCode() {
        return paidCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.paid_code
     *
     * @param paidCode the value for trade_records.paid_code
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setPaidCode(Integer paidCode) {
        this.paidCode = paidCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.paid_error_description
     *
     * @return the value of trade_records.paid_error_description
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public String getPaidErrorDescription() {
        return paidErrorDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.paid_error_description
     *
     * @param paidErrorDescription the value for trade_records.paid_error_description
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setPaidErrorDescription(String paidErrorDescription) {
        this.paidErrorDescription = paidErrorDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.created_at
     *
     * @return the value of trade_records.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.created_at
     *
     * @param createdAt the value for trade_records.created_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.updated_at
     *
     * @return the value of trade_records.updated_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.updated_at
     *
     * @param updatedAt the value for trade_records.updated_at
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.trade_type_id
     *
     * @return the value of trade_records.trade_type_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getTradeTypeId() {
        return tradeTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.trade_type_id
     *
     * @param tradeTypeId the value for trade_records.trade_type_id
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setTradeTypeId(Integer tradeTypeId) {
        this.tradeTypeId = tradeTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.traded_status
     *
     * @return the value of trade_records.traded_status
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getTradedStatus() {
        return tradedStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.traded_status
     *
     * @param tradedStatus the value for trade_records.traded_status
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setTradedStatus(Integer tradedStatus) {
        this.tradedStatus = tradedStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_records.attach_status
     *
     * @return the value of trade_records.attach_status
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public Integer getAttachStatus() {
        return attachStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_records.attach_status
     *
     * @param attachStatus the value for trade_records.attach_status
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    public void setAttachStatus(Integer attachStatus) {
        this.attachStatus = attachStatus;
    }
}