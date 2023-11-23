package com.webmvcpractice.app3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataController {
	
	public DataController() {
		System.out.println("DataController::Constructor");
		
	}
	@GetMapping("/name")
	public ModelAndView getName() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome to our portal...!");
		
		mav.setViewName("index");
		
		return mav;
		
	}

}
