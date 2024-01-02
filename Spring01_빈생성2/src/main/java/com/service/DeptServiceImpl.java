package com.service;

public class DeptServiceImpl {

	public DeptServiceImpl(int n, String name) {
		System.out.println("DeptServiceImpl 생성자" + n + name);

	}
	
	
	
	public DeptServiceImpl(int n) {
		System.out.println("DeptServiceImpl 생성자" + n);

	}
	
	// 기능처리
	public String getMesg() {
		return "Hello World";
	}
	
}
