package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.Factory;

public interface FactoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factories
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factories
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(Factory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factories
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(Factory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factories
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    Factory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factories
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(Factory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factories
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(Factory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table factories
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(Factory record);
}