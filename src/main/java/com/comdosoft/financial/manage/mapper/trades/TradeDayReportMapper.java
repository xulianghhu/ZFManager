package com.comdosoft.financial.manage.mapper.trades;

import com.comdosoft.financial.manage.domain.trades.TradeDayReport;

public interface TradeDayReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_day_reports
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_day_reports
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(TradeDayReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_day_reports
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(TradeDayReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_day_reports
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    TradeDayReport selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_day_reports
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(TradeDayReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_day_reports
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(TradeDayReport record);
}