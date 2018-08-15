/**
 * 
 */
package com.spring.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *
 */
@FeignClient(value = "user-service")  //user-service为eureka上注册的服务
public interface UserControllerApi {
	@RequestMapping("/getUserName")  //getUserName为服务端的接口名字
	public String getUserNameByFeign();
}
