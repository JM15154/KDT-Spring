package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	// http://localhost:8090/app/main
	@GetMapping("/main")
	public String home () {
		
		// 명시적으로 예외발생
		if(true) {
			throw new NullPointerException("error 발생");
		}
		
		return "home";
	}
	@GetMapping("/main2")
	public String home2 () {
		
		// 명시적으로 예외발생
		if(true) {
			throw new ArithmeticException("error 발생");
		}
		
		return "home";
	}
	// 예외처리
	@ExceptionHandler({NullPointerException.class,ArithmeticException.class})
	public String errorPage(Exception e,Model m) {
		System.out.println("Exception" + e);
		m.addAttribute("exception", e.getMessage());
		return "error";           // /WEB-INF/views/error.jsp
		
	}
	
	
}
 