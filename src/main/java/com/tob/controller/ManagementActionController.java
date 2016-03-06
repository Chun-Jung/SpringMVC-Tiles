package com.tob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="managementActionDispatcher")
public class ManagementActionController {

	@RequestMapping(value = "/management/action**.do")
	public ModelAndView managementActionDispatcher(){
		ModelAndView model = new ModelAndView();
		return model;
	}
}
