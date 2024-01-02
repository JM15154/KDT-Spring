package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dao.DeptDAO;

public class DeptServiceImpl {
	
	@Autowired(required = false)
	DeptDAO dao;
	
	// 고전방식 : 기능처리
	public String getMesg() {
		return dao.getMesg();
	}
	
}