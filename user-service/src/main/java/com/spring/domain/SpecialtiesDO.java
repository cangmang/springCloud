package com.spring.domain;

import java.util.Date;

public class SpecialtiesDO {
    private Short specialtiesId;

    private String specialtiesName;

    private Short orderIndex;

    private Date createTime;

    private Date updateTime;

    private String status;

    public Short getSpecialtiesId() {
        return specialtiesId;
    }

    public void setSpecialtiesId(Short specialtiesId) {
        this.specialtiesId = specialtiesId;
    }

    public String getSpecialtiesName() {
        return specialtiesName;
    }

    public void setSpecialtiesName(String specialtiesName) {
        this.specialtiesName = specialtiesName == null ? null : specialtiesName.trim();
    }

    public Short getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Short orderIndex) {
        this.orderIndex = orderIndex;
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