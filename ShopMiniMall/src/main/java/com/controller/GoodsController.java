package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.CartDTO;
import com.dto.GoodsDTO;
import com.dto.MemberDTO;
import com.service.GoodsService;


@Controller
public class GoodsController {

	@Autowired
	GoodsService gService;
	
	
	@GetMapping("/goodsRetrieve")
	@ModelAttribute("goodsRetrieve")
	public GoodsDTO goodsRetrieve(@RequestParam String gCode) {
		
		GoodsDTO dto = gService.goodsRetrieve(gCode);
		
		return dto;
	}
	
	// 장바구니 저장
	@GetMapping("/CartAddServlet")
	public String cartAdd(CartDTO cDTO, HttpSession session) {
		
		MemberDTO mDTO = (MemberDTO)session.getAttribute("login");
		cDTO.setUserid(mDTO.getUserid());
		
		int n = gService.cartAdd(cDTO);
		return "goods/cartAddSuccess";
	}
	
	// 장바구니 목록
	@GetMapping("/CartListServlet")
	public ModelAndView goodsRetrieve(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		MemberDTO mDTO = (MemberDTO)session.getAttribute("login");
		String userid = mDTO.getUserid();
		List<CartDTO> list = gService.cartList(userid);
		

		mav.addObject("cartList", list);
		mav.setViewName("cartList");
		
		return mav;
	}
	
	// 장바구니 수정
	@GetMapping("/CartUpdateServlet")
	@ResponseBody
	public void cartUpdate(@RequestParam HashMap<String, Integer> map) {
		
		int num = gService.cartUpdate(map);
	}
	
	// 장바구니 전체삭제
	@GetMapping("/CartDeleteAllServlet")
	public String cartDeleteAll (@RequestParam ArrayList<Integer> check) {
		System.out.println(check);
		
		return "redirect:main";
	}
}
