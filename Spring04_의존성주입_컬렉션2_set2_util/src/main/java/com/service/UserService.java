package com.service;

import java.util.List;
import java.util.Set;

import com.dto.Cat;

public class UserService {
	
	Set<Cat> set;


	
	public Set<Cat> getSet() {
		return set;
	}



	public void setSet(Set<Cat> set) {
		this.set = set;
	}



	// 추가 메서드
	public String getMesg() {
		return "hello world";
	}
	
}
