package com.comdosoft.financial.manage.domain.zhangfu;

public class GoodRelation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_relations.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_relations.good_id
     *
     * @mbggenerated
     */
    private Integer goodId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column good_relations.relative_good_id
     *
     * @mbggenerated
     */
    private String relativeGoodId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_relations.id
     *
     * @return the value of good_relations.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_relations.id
     *
     * @param id the value for good_relations.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_relations.good_id
     *
     * @return the value of good_relations.good_id
     *
     * @mbggenerated
     */
    public Integer getGoodId() {
        return goodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_relations.good_id
     *
     * @param goodId the value for good_relations.good_id
     *
     * @mbggenerated
     */
    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column good_relations.relative_good_id
     *
     * @return the value of good_relations.relative_good_id
     *
     * @mbggenerated
     */
    public String getRelativeGoodId() {
        return relativeGoodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column good_relations.relative_good_id
     *
     * @param relativeGoodId the value for good_relations.relative_good_id
     *
     * @mbggenerated
     */
    public void setRelativeGoodId(String relativeGoodId) {
        this.relativeGoodId = relativeGoodId;
    }
}