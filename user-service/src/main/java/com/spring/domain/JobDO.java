package com.spring.domain;

import java.util.Date;
import java.util.List;

public class JobDO {
    private Short jobId;

    private String jobName;

    private Short orderIndex;

    private Date createTime;

    private Date updateTime;

    private String status;
    
    //一个职业对应多个领域
    private List<ProfessionDO> professionList;

    public Short getJobId() {
        return jobId;
    }

    public void setJobId(Short jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
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

    public List<ProfessionDO> getProfessionList() {
        return professionList;
    }

    public void setProfessionList(List<ProfessionDO> professionList) {
        this.professionList = professionList;
    }
}