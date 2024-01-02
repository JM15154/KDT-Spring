package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {
	

	//redirect
	@GetMapping("/redirect")
	public String redirect (Model model) {
		System.out.println("TestController.redirect");
		model.addAttribute("userid","홍길동");
		return "redirect:main";
	}
	
	
	//redirect flash-scope
	@GetMapping("/flash")
	public String flash (RedirectAttributes model) {
		System.out.println("TestController.redirect");
		model.addFlashAttribute("userid","홍길동");
		return "redirect:main";
	}
	
	@GetMapping("/main")
	public String home () {
		System.out.println("TestController.home");
		return "home";
	}
}







// A 이외의 서블릿을 접근한 경우 A를 거치게 해야함
/*
 	HttpSession session = request.getSession();
 	XXX data = (XXX)session.getAttribute("x")
 	// A를 거쳤는지의 여부 확인
 	if (data != null ) {
 		// 작업
 	}else {
 		// A로 요청
 		response.sendRedirect("A");
 	}
 */
 