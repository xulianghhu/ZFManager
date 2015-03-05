package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.PayChannel;

import java.util.List;

import com.comdosoft.financial.manage.utils.page.PageRequest;
import org.apache.ibatis.annotations.Param;

public interface PayChannelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_channels
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_channels
	 * @mbggenerated
	 */
	int insert(PayChannel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_channels
	 * @mbggenerated
	 */
	PayChannel selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_channels
	 * @mbggenerated
	 */
	List<PayChannel> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pay_channels
	 * @mbggenerated
	 */
	int updateByPrimaryKey(PayChannel record);

	List<PayChannel> selectByStatusAndName(@Param("status") byte status, @Param("keys") String name);

	List<PayChannel> selectChannels(Integer goodId);

	long countByKeys(@Param("status") Byte status, @Param("keys") String keys);

	List<PayChannel> findPageChannelsByKeys(@Param("pageRequest") PageRequest pageRequest,
											@Param("status") Byte status, @Param("keys") String keys);

	PayChannel findChannelLazyInfo(Integer id);
}