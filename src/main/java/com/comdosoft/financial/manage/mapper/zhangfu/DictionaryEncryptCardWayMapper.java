package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.DictionaryEncryptCardWay;

public interface DictionaryEncryptCardWayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_encrypt_card_ways
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_encrypt_card_ways
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insert(DictionaryEncryptCardWay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_encrypt_card_ways
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int insertSelective(DictionaryEncryptCardWay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_encrypt_card_ways
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    DictionaryEncryptCardWay selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_encrypt_card_ways
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKeySelective(DictionaryEncryptCardWay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dictionary_encrypt_card_ways
     *
     * @mbggenerated Thu Jan 29 14:34:31 CST 2015
     */
    int updateByPrimaryKey(DictionaryEncryptCardWay record);
}