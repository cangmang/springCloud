/**
 * 
 */
package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dao.RegionProvinceDOMapper;
import com.spring.domain.RegionProvinceDO;

/**
 * @author Administrator
 *
 */
@RestController
@RefreshScope
public class UserController {
	@Autowired
	RegionProvinceDOMapper regionprovince;

	@Value("${myww}")
	private String myww;

	@Value("${server.port}")
	private String port;

	@RequestMapping("/getMyww")
	public String getMyww() {
		return myww;
	}

	@Value("${userName}")
	private String userName;

	@RequestMapping(path = "/getUserName", method = RequestMethod.GET)
	public RegionProvinceDO getUserName(@RequestParam(required=true) Integer provinceId) {
		return regionprovince.getRegionProvinceByProvinceId(provinceId);
	}
}
