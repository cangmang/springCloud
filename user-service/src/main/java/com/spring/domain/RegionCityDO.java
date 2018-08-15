package com.spring.domain;

import java.util.Date;
import java.util.List;

public class RegionCityDO {
    private Integer id;

    private Integer provinceId;

    private Long cityId;

    private String cityName;

    private Date createTime;

    private Date updateTime;

    private String status;
    
    private List<RegionCountyDO> regionCountyDOList;

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

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
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

    public List<RegionCountyDO> getRegionCountyDOList() {
        return regionCountyDOList;
    }

    public void setRegionCountyDOList(List<RegionCountyDO> regionCountyDOList) {
        this.regionCountyDOList = regionCountyDOList;
    }
}