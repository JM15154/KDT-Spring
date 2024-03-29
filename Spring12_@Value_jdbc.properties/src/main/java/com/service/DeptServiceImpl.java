package com.service;

import org.springframework.beans.factory.annotation.Value;

public class DeptServiceImpl {

	
	@Value("${jdbc.driver}")
	String driver;
	@Value("${jdbc.url}")
	String url;
	@Value("${jdbc.userid}")
	String userid;
	@Value("${jdbc.passwd}")
	String passwd;
	
	
	
	public DeptServiceImpl() {
		System.out.println("DeptServiceImpl 생성자");
	}
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	// 기능처리
	public String getMesg() {
		return "Hello World";
	}

	@Override
	public String toString() {
		return "DeptServiceImpl [driver=" + driver + ", url=" + url + ", userid=" + userid + ", passwd=" + passwd + "]";
	}
	
}
