package com.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.LoginDTO;
import com.dto.MemberDTO;

@Controller
public class TestController {
	
	
	// 리턴타입
	
	
	// Model은 ("xxx", dto) 저장하고 View는 요청맵핑값은 main으로 유추함.
	@GetMapping("/main")
	public void home () {

	}
	
	
	// Model은 ("xxx", dto) 저장하고 View는 요청맵핑값은 main으로 유추함.
	@GetMapping("/list")
	public @ModelAttribute("xxx") List<LoginDTO> home4 () {
		
		List<LoginDTO> list = Arrays.asList(new LoginDTO("홍길동1", "122"),
				new LoginDTO("홍길동2", "122"));
		return list;
	}
	
	// Model은 ("xxx", dto) 저장하고 View는 요청맵핑값은 main으로 유추함.
	@GetMapping("/main3")
	public @ModelAttribute("xxx") LoginDTO home3 () {
		
		LoginDTO dto = new LoginDTO("홍길동","123");
		return dto;
	}
	
	
	
	//1. String : 무조건 View 정보
	@GetMapping("/main2")
	public String home2 () {
		
		return "home";
	}
}
 