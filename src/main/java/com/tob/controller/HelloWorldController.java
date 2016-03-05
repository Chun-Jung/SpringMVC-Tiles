package com.tob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome");
		
		String message = "Hello World, Spring MVC & Tiles";  
		model.addObject("message", message);
        return model;  
	}
}
