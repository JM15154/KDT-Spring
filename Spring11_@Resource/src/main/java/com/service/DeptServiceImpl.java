package com.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dao.DeptDAO;

public class DeptServiceImpl {
	
	@Resource
	DeptDAO dao;
	
	// 고전방식 : 기능처리
	public String getMesg() {
		return dao.getMesg();
	}
	
}