package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.DictionaryTradeStandardRate;

public interface DictionaryTradeStandardRateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_trade_standard_rates
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_trade_standard_rates
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(DictionaryTradeStandardRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_trade_standard_rates
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(DictionaryTradeStandardRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_trade_standard_rates
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    DictionaryTradeStandardRate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_trade_standard_rates
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(DictionaryTradeStandardRate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_trade_standard_rates
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(DictionaryTradeStandardRate record);
}