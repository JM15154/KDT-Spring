package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	// http://localhost:8090/app/main
	@GetMapping("/main")
	public String home () {
		System.out.println("TestController.home");
		return "home";
	}
	
	@GetMapping("/aaa/bbb")
	public String home2 () {
		System.out.println("TestController.home2");
		return "home";
	}
	
	@GetMapping("/ccc")
	public String home3 () {
		System.out.println("TestController.home3");
		return "home";
	}
	
	@GetMapping("/ddd/*/eee")
	public String home4 () {
		System.out.println("TestController.home4");
		return "home";
	}
	
	@GetMapping("/fff/**/ggg")
	public String home5 () {
		System.out.println("TestController.home5");
		return "home";
	}
//	
//	@GetMapping("/aaa/bbb")
//	public String home6 () {
//		System.out.println("TestController.main");
//		return "/WEB-INF/views/home.jsp";
//	}
	
}
 