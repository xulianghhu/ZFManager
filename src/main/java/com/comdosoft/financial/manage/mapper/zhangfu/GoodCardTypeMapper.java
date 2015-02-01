package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.GoodCardType;
import java.util.List;

public interface GoodCardTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_card_types
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_card_types
     *
     * @mbggenerated
     */
    int insert(GoodCardType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_card_types
     *
     * @mbggenerated
     */
    GoodCardType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_card_types
     *
     * @mbggenerated
     */
    List<GoodCardType> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_card_types
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GoodCardType record);
}