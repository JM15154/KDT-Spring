package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	//forward
	@GetMapping("/forward")
	public String forward (Model model) {
		System.out.println("TestController.redirect");
		model.addAttribute("userid","홍길동");
		return "forward:main";
	}
	
	
	//redirect
	@GetMapping("/redirect")
	public String redirect (Model model) {
		System.out.println("TestController.redirect");
		model.addAttribute("userid","홍길동");
		return "redirect:main";
	}
	
	
	@GetMapping("/main")
	public String home () {
		System.out.println("TestController.home");
		return "home";
	}
}
 