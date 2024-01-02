package com.service;

public class UserService {
	
	// 핵심 기능 메서드
	public String sayHello() {
		System.out.println("UserService.sayHello");
		return "hello";
	}
	
	public String callHello() {
		System.out.println("UserService.callHello");
		return "world";
	}
	
	public String echoHello() {
		System.out.println("UserService.echoHello");
		//예외발생
//		int num = 10/0;
		return "happy";
	}
}
