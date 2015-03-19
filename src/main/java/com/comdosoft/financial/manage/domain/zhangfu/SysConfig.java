package com.comdosoft.financial.manage.domain.zhangfu;

public class SysConfig {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_config.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_config.param_name
	 * @mbggenerated
	 */
	private String paramName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_config.param_value
	 * @mbggenerated
	 */
	private String paramValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_config.remark
	 * @mbggenerated
	 */
	private String remark;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_config.id
	 * @return  the value of sys_config.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_config.id
	 * @param id  the value for sys_config.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_config.param_name
	 * @return  the value of sys_config.param_name
	 * @mbggenerated
	 */
	public String getParamName() {
		return paramName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_config.param_name
	 * @param paramName  the value for sys_config.param_name
	 * @mbggenerated
	 */
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_config.param_value
	 * @return  the value of sys_config.param_value
	 * @mbggenerated
	 */
	public String getParamValue() {
		return paramValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_config.param_value
	 * @param paramValue  the value for sys_config.param_value
	 * @mbggenerated
	 */
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_config.remark
	 * @return  the value of sys_config.remark
	 * @mbggenerated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_config.remark
	 * @param remark  the value for sys_config.remark
	 * @mbggenerated
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}


    public static final String INTEGRAL_CONVERT = "integralConvert";//积分兑换
    public static final String SHOP_COUNT = "shopcount";//同型pos购买
    public static final String TOTAL_MONEY = "totalmoney";//累计交易流水
    public static final String TRADE_RECORD_DEFAULT_PROFIT = "tradeRecordDefaultProfit";//交易流水默认分润比例
    public static final String HIRE_DEFAULT_PROFIT = "hireDefaultProfit";//租金默认分润比例
    public static final String DEFAULT_PROFIT = "defaultProfit";//默认分润比例
    public static final String RETURN_TIME = "returnTime";//允许退货时间
    public static final String CHANGE_TIME = "changeTime";//允许换货时间
    public static final String OPEN_POLLING_INTERVAL = "openPollingInterval";//业务开通状态轮询间隔
    public static final String CANCEL_POLLING_INTERVAL = "cancelPollingInterval";//注销轮询时间间隔
    public static final String ORDER_EXPIRED_TIME = "orderExpiredTime";//订单过期时间
    public static final String BUSINESS_EXPIRED_TIME = "businessExpiredTime";//业务记录过期时间
    public static final String INTEGRAL_BUY_POS = "integralBuyPos";//积分获取购买POS机
    public static final String INTEGRAL_TRADE = "integralTrade";//积分获取交易流水


}