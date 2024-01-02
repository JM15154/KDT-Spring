package com.service;

import org.springframework.stereotype.Component;
@Component
public class UserService {

	public UserService() {
		System.out.println("UserService 생성자");
	}
	
	public String getMesg() {
		return "hello";
	}
}
