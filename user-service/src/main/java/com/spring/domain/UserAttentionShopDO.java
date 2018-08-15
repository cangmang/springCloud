package com.spring.domain;

import java.util.Date;

public class UserAttentionShopDO {
    private Long userShopId;

    private Long userId;

    private Long shopId;

    private String userShopRemark;

    private Date createTime;

    private Date updateTime;

    private String status;

    public Long getUserShopId() {
        return userShopId;
    }

    public void setUserShopId(Long userShopId) {
        this.userShopId = userShopId;
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

    public String getUserShopRemark() {
        return userShopRemark;
    }

    public void setUserShopRemark(String userShopRemark) {
        this.userShopRemark = userShopRemark == null ? null : userShopRemark.trim();
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