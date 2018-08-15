/**
 * 
 */
package com.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaServer
public class ApplicaitonZuulController {
	public static void main(String[] args) {
		SpringApplication.run(ApplicaitonZuulController.class, args);
	}
}
