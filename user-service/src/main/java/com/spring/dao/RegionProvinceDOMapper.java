package com.spring.dao;

import java.util.List;

import com.spring.domain.*;


public interface RegionProvinceDOMapper {
    
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(RegionProvinceDO record);
//
//    int insertSelective(RegionProvinceDO record);
//
//    RegionProvinceDO selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(RegionProvinceDO record);
//
//    int updateByPrimaryKey(RegionProvinceDO record);
//    
//    List<RegionProvinceDO> getRegionProvinceDOList();
    
    RegionProvinceDO getRegionProvinceByProvinceId(Integer provinceId);
}