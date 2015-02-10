package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.GoodsPicture;
import java.util.List;

public interface GoodsPictureMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_pictures
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_pictures
	 * @mbggenerated
	 */
	int insert(GoodsPicture record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_pictures
	 * @mbggenerated
	 */
	GoodsPicture selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_pictures
	 * @mbggenerated
	 */
	List<GoodsPicture> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table goods_pictures
	 * @mbggenerated
	 */
	int updateByPrimaryKey(GoodsPicture record);

	void deleteByGoodId(Integer goodId);

    List<GoodsPicture> selectPictures(Integer goodId);

}