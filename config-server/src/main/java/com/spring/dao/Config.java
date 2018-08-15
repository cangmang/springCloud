/**
 * 
 */
package com.spring.dao;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Administrator
 *
 */
public class Config {
	@Value("${myww}")
	private String myww;

	/**
	 * @return the myww
	 */
	public String getMyww() {
		return myww;
	}

	/**
	 * @param myww the myww to set
	 */
	public void setMyww(String myww) {
		this.myww = myww;
	}
}
