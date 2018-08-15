/**
 * 
 */
package com.spring.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.UserSercive;

/**
 * @author Administrator
 *
 */
@RestController
public class UserController {
	@Autowired
	UserSercive orderSercive;

	@RequestMapping("/getUserName")
	public String getUserName() {
		return orderSercive.getUserName();
	}
}
