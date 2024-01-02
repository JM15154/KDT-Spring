package com.service;

import java.util.Properties;

public class UserService {
	
	Properties props; // key/value 저장, 일반적으로 String/String 인 경우에 주로 사용




	public Properties getProps() {
		return props;
	}




	public void setProps(Properties props) {
		this.props = props;
	}




	// 추가 메서드
	public String getMesg() {
		return "hello world";
	}
	
}
