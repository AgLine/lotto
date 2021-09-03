package com.example.myapp.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestCtrl {
	
	
	@GetMapping("/test/TestFile")
	public ModelAndView testFile() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
}

//https://velog.io/@wonthechan/Spring-STS%EC%97%90%EC%84%9C-%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%83%9D%EC%84%B1%ED%95%98%EA%B8%B0

