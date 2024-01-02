package com.service;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

// 리소스 번들 접근 ==> MessageSource가 필요
public class UserService implements MessageSourceAware {
	
	MessageSource resources;

	@Override
	public void setMessageSource(MessageSource messageSource) {
		// TODO Auto-generated method stub
		this.resources = messageSource;
	}
	
	// 추가 메서드
	public void getMessage() {
	    String message = resources.getMessage("greet", new String[] {"홍길동","!!!"}, "Default", Locale.KOREA);
	    System.out.println(message);
	}

}
