package com.spring.domain;

import java.util.Date;

public class UserAttentionCompanyDO {
    private Long userCompanyId;

    private Long userId;

    private Integer companyId;

    private String userCompanyRemark;

    private Date createTime;

    private Date updateTime;

    private String status;

    public Long getUserCompanyId() {
        return userCompanyId;
    }

    public void setUserCompanyId(Long userCompanyId) {
        this.userCompanyId = userCompanyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getUserCompanyRemark() {
        return userCompanyRemark;
    }

    public void setUserCompanyRemark(String userCompanyRemark) {
        this.userCompanyRemark = userCompanyRemark == null ? null : userCompanyRemark.trim();
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