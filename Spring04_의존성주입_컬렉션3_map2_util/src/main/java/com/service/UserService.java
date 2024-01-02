package com.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dto.Cat;

public class UserService {
	
	Map<String, Cat> map;




	public Map<String, Cat> getMap() {
		return map;
	}




	public void setMap(Map<String, Cat> map) {
		this.map = map;
	}




	// 추가 메서드
	public String getMesg() {
		return "hello world";
	}
	
}
