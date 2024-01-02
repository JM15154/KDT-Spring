package com.service;

public class DeptServiceImpl {

	public DeptServiceImpl() {
		System.out.println("DeptServiceImpl 생성자");
	}
	
	// 기능처리
	public String getMesg() {
		return "Hello World";
	}
	
	
	//init-method="xxx" 
	public void xxx() {
		System.out.println("xxx 초기화");
	}
	// destroy-method="yyy"
	public void yyy () {
		System.out.println("yyy 자원반납");
	}
}
