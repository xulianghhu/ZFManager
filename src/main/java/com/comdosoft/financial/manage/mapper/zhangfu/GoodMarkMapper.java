package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.GoodMark;

public interface GoodMarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insert(GoodMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int insertSelective(GoodMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    GoodMark selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKeySelective(GoodMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(GoodMark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_marks
     *
     * @mbggenerated Thu Jan 29 14:22:32 CST 2015
     */
    int updateByPrimaryKey(GoodMark record);
}