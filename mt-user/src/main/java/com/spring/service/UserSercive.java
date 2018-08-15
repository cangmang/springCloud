/**
 * 
 */
package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UserSercive {
	@Autowired
	RestTemplate restTemplate;
	
	public String getUserName(){
		return restTemplate.getForObject("http://user-service/getUserName", String.class);
		
	}
}
