package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	
	// http://localhost:8090/app/main
	
	@GetMapping("/loginForm")
	public String loginForm () {
		
		
		return "loginForm";
	}
	
	
	@GetMapping("/login")
	public String login (LoginDTO dto, HttpSession session) {
		
		//정상적인 정보라고 가정
		
		// 로그인 정보 저장
		
		session.setAttribute("loginInfo", dto);
		
		return "login";
	}
	
	@GetMapping("/mypage")
	public String mypage (HttpSession session) {
		LoginDTO dto = (LoginDTO)session.getAttribute("loginInfo");
		
		if(dto!=null) {
			return "mypage";
		}else {
			return "redirect:loginForm";
		}
	}
	
	@GetMapping("logout")
	public String logout (HttpSession session) {
		LoginDTO dto = (LoginDTO)session.getAttribute("loginInfo");
		
		if(dto!=null) {
			session.invalidate();
			return "loginForm";
		}else {
			return "redirect:loginForm";
		}
	}
}
 