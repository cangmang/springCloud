package com.spring.domain;

import java.util.Date;
import java.util.List;

public class RegionProvinceDO {
    private Integer id;

    private Integer provinceId;

    private String provinceName;

    private Date createTime;

    private Date updateTime;

    private String status;
    
    private List<RegionCityDO> regionCityDOList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
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

    public List<RegionCityDO> getRegionCityDOList() {
        return regionCityDOList;
    }

    public void setRegionCityDOList(List<RegionCityDO> regionCityDOList) {
        this.regionCityDOList = regionCityDOList;
    }
}