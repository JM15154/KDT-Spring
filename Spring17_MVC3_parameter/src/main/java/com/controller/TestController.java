package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;
import com.dto.MemberDTO;

@Controller
public class TestController {
	
	
	// 로그인 화면보기
	@GetMapping("/loginForm")
	public String loginForm () {
		
		return "loginForm";
	}
	
	@GetMapping("/member")
	public String member (MemberDTO dto) {
		
		System.out.println(dto);
		return "loginForm";
	}
	
	
	@GetMapping("/login")
	public String login (@RequestParam Map<String, String> map) {
		
		System.out.println(map);
		return "loginForm";
	}
	
	@GetMapping("/login6")
	public String login6 (LoginDTO dto) {
		
		System.out.println(dto);
		return "loginForm";
	}
	
	@GetMapping("/login5")
	public String login5 (String userid
	, String passwd) {
		
		System.out.println(userid + passwd);
		return "loginForm";
	}
	
	@GetMapping("/login4")
	public String login4 (@RequestParam String userid
	,@RequestParam String passwd) {
		
		System.out.println(userid + passwd);
		return "loginForm";
	}
	

	@GetMapping("/login3")
	public String login3 (@RequestParam("userid") String id
	,@RequestParam("passwd") String pw) {
		
		System.out.println(id + pw);
		return "loginForm";
	}
	
	@GetMapping("/login2")
	public String login2 (HttpServletRequest request) {
		
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println(userid + "\t" +  passwd);
		
		return "loginForm";
	}
	
	
	@PostMapping("/login")
	public String loginPost (HttpServletRequest request) {
		
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println(userid + "\t" +  passwd);
		
		return "loginForm";
	}
}
 