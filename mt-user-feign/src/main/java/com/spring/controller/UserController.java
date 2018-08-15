/**
 * 
 */
package com.spring.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.UserControllerApi;

/**
 * @author Administrator
 *
 */
@Api(value="/UserController",description="与用户相关接口")
@RestController
public class UserController implements UserControllerApi{
	@Autowired
	UserControllerApi userControllerApi;
	
	@ApiOperation("获取用户名")
	@RequestMapping(path="/getUserNameByFeign",method = RequestMethod.GET)
	public String getUserNameByFeign() {
		return userControllerApi.getUserNameByFeign();
	}
}
