/**
 * 
 */
package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Administrator
 *
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class MtUserApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(MtUserApplication.class,args);
	}
}
