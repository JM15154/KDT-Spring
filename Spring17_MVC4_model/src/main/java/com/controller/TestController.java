package com.controller;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {
	
	
	// http://localhost:8090/app/main
	
	   @GetMapping("/main")
	   public ModelAndView home() {

		   ModelAndView mav = new ModelAndView();
		   // 모델 지정
		   mav.addObject("email", "asdasdas@asdasd ");
		   mav.addObject("phone", "123123131231231 ");
		   // 뷰 지정
		   mav.setViewName("home5"); // InternalResourceViewResolver 이용
	       return mav;
	   }

	   @GetMapping("/main7")
	   public String home7(@ModelAttribute("yyy")ArrayList<LoginDTO> list) {

	       list.add(new LoginDTO("이순신1", "1234"));
	       list.add(new LoginDTO("이순신2", "8888"));

	       return "home4";
	   }
	
	
	@GetMapping("/main6")
	public String home6 (@ModelAttribute("xxx") LoginDTO dto) {
		dto.setUserid("홍길동123123");
		dto.setPasswd("14214124");
		
		//LoginDTO는 Model로 처리됨
		// 내부적으로 (key, value) 로 저장됨.   CoC 적용됨
		// 실제로 ("loginDTO", dto ); 
		
		return "home3";
	}
	
	
	
	@GetMapping("/main5")
	public String home5 (LoginDTO dto) {
		dto.setUserid("홍길동123123");
		dto.setPasswd("14214124");
		
		//LoginDTO는 Model로 처리됨
		// 내부적으로 (key, value) 로 저장됨.   CoC 적용됨
		// 실제로 ("loginDTO", dto ); 
		
		return "home2";
	}
	

	@GetMapping("/main4")
	public String home4 (Map<String, String> map) {
		map.put("userid", "홍길동111111");
		map.put("passwd", "1234");
		
		return "home";
	}
	
	@GetMapping("/main3")
	public String home3 (Model model) {
		model.addAttribute("userid", "홍길동123");
		model.addAttribute("passwd", "1234");
		
		return "home";
	}
	
	
	@GetMapping("/main2")
	public String home2 (HttpServletRequest request) {
		request.setAttribute("userid", "홍길동");
		request.setAttribute("passwd", "1234");
		
		return "home";
	}
	
}
 