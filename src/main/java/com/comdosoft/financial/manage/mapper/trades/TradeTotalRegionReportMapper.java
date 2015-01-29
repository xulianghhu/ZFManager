package com.comdosoft.financial.manage.mapper.trades;

import com.comdosoft.financial.manage.domain.trades.TradeTotalRegionReport;

public interface TradeTotalRegionReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_total_region_reports
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_total_region_reports
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insert(TradeTotalRegionReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_total_region_reports
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insertSelective(TradeTotalRegionReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_total_region_reports
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    TradeTotalRegionReport selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_total_region_reports
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKeySelective(TradeTotalRegionReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_total_region_reports
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKey(TradeTotalRegionReport record);
}