package com.comdosoft.financial.manage.mapper.trades;

import com.comdosoft.financial.manage.domain.trades.TradeTransferRepaymentRecord;
import java.util.List;

public interface TradeTransferRepaymentRecordMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_transfer_repayment_records
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_transfer_repayment_records
	 * @mbggenerated
	 */
	int insert(TradeTransferRepaymentRecord record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_transfer_repayment_records
	 * @mbggenerated
	 */
	TradeTransferRepaymentRecord selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_transfer_repayment_records
	 * @mbggenerated
	 */
	List<TradeTransferRepaymentRecord> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_transfer_repayment_records
	 * @mbggenerated
	 */
	int updateByPrimaryKey(TradeTransferRepaymentRecord record);
}