package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.WebMessage;

public interface WebMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_messages
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_messages
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(WebMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_messages
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(WebMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_messages
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    WebMessage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_messages
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(WebMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_messages
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(WebMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_messages
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(WebMessage record);
}