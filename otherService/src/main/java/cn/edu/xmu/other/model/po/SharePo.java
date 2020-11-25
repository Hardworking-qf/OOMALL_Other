package cn.edu.xmu.other.model.po;

import java.time.LocalDateTime;

public class SharePo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column share.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column share.sharer_id
     *
     * @mbg.generated
     */
    private Long sharerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column share.goods_spu_id
     *
     * @mbg.generated
     */
    private Long goodsSpuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column share.quantity
     *
     * @mbg.generated
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column share.gmt_created
     *
     * @mbg.generated
     */
    private LocalDateTime gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column share.gmt_modified
     *
     * @mbg.generated
     */
    private LocalDateTime gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column share.id
     *
     * @return the value of share.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column share.id
     *
     * @param id the value for share.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column share.sharer_id
     *
     * @return the value of share.sharer_id
     *
     * @mbg.generated
     */
    public Long getSharerId() {
        return sharerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column share.sharer_id
     *
     * @param sharerId the value for share.sharer_id
     *
     * @mbg.generated
     */
    public void setSharerId(Long sharerId) {
        this.sharerId = sharerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column share.goods_spu_id
     *
     * @return the value of share.goods_spu_id
     *
     * @mbg.generated
     */
    public Long getGoodsSpuId() {
        return goodsSpuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column share.goods_spu_id
     *
     * @param goodsSpuId the value for share.goods_spu_id
     *
     * @mbg.generated
     */
    public void setGoodsSpuId(Long goodsSpuId) {
        this.goodsSpuId = goodsSpuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column share.quantity
     *
     * @return the value of share.quantity
     *
     * @mbg.generated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column share.quantity
     *
     * @param quantity the value for share.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column share.gmt_created
     *
     * @return the value of share.gmt_created
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column share.gmt_created
     *
     * @param gmtCreated the value for share.gmt_created
     *
     * @mbg.generated
     */
    public void setGmtCreated(LocalDateTime gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column share.gmt_modified
     *
     * @return the value of share.gmt_modified
     *
     * @mbg.generated
     */
    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column share.gmt_modified
     *
     * @param gmtModified the value for share.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}