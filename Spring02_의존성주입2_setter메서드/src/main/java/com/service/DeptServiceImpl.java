package com.service;

import com.dao.DeptDAO;

public class DeptServiceImpl {
	DeptDAO dao;
	
	public DeptServiceImpl() {
		System.out.println("DeptServiceImpl 생성자");
	}
	
	// setter 메서드 이용한 주입
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	
	
	public DeptDAO getDao() {
		return dao;
	}

	// 고전방식 : 기능처리
	public String getMesg() {
		 
		return dao.getMesg();
	}
	
}
