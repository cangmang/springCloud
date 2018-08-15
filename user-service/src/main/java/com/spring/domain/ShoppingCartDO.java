package com.spring.domain;

import java.util.Date;

public class ShoppingCartDO {
    private Long shoppingCartId;

    private Long userId;

    private Long shopId;

    private Long goodsId;

    private Long goodsSkuId;

    private Integer skuPriceOnline;

    private Short goodsQty;

    private Date createTime;

    private Date updateTime;

    private String status;

    public Long getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(Long shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsSkuId() {
        return goodsSkuId;
    }

    public void setGoodsSkuId(Long goodsSkuId) {
        this.goodsSkuId = goodsSkuId;
    }

    public Integer getSkuPriceOnline() {
        return skuPriceOnline;
    }

    public void setSkuPriceOnline(Integer skuPriceOnline) {
        this.skuPriceOnline = skuPriceOnline;
    }

    public Short getGoodsQty() {
        return goodsQty;
    }

    public void setGoodsQty(Short goodsQty) {
        this.goodsQty = goodsQty;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}