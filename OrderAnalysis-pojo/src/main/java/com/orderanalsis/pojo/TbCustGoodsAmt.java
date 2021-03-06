package com.orderanalsis.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class TbCustGoodsAmt implements Serializable{
    private Integer id;

    private Integer custId;

    private Integer goodsId;

    private String goodsName;

    private String categoryName;

    private String parentName;

    private BigDecimal goodsSellAmt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    public BigDecimal getGoodsSellAmt() {
        return goodsSellAmt;
    }

    public void setGoodsSellAmt(BigDecimal goodsSellAmt) {
        this.goodsSellAmt = goodsSellAmt;
    }
}