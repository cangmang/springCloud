package com.spring.domain;

import java.util.Date;

public class UserBanDO {
    private Long userBanId;

    private Long userId;

    private String appId;

    private String banRemark;

    private Date createTime;

    private Date updateTime;

    private String status;

    private Integer banHours;
    
    private String acctStatus;

    public Long getUserBanId() {
        return userBanId;
    }

    public void setUserBanId(Long userBanId) {
        this.userBanId = userBanId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getBanRemark() {
        return banRemark;
    }

    public void setBanRemark(String banRemark) {
        this.banRemark = banRemark == null ? null : banRemark.trim();
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

    public Integer getBanHours() {
        return banHours;
    }

    public void setBanHours(Integer banHours) {
        this.banHours = banHours;
    }

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }
}