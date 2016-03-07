package com.tob.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tob.model.Auth;
import com.tob.model.Emp;
import com.tob.service.EmpAuthService;

@Controller(value="managementActionDispatcher")
public class ManagementActionController {
	@Autowired
	EmpAuthService empAuthService;

	@RequestMapping(value = "/management/action1")
	public ModelAndView managementAction1(HttpServletRequest req){
		HttpSession session = req.getSession();
		Emp emp = (Emp) session.getAttribute("userSession");
		boolean hasAuth = empAuthService.checkEmpAuth(emp, new Auth(1));
		if(!hasAuth){
			return noAuthRedirect();
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("action");
		model.addObject("actionTitle", "Management Title1");
		model.addObject("actionMessage", "This is action1");
		return model;
	}
	
	@RequestMapping(value = "/management/action2")
	public ModelAndView managementAction2(HttpServletRequest req){
		HttpSession session = req.getSession();
		Emp emp = (Emp) session.getAttribute("userSession");
		boolean hasAuth = empAuthService.checkEmpAuth(emp, new Auth(2));
		if(!hasAuth){
			return noAuthRedirect();
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("action");
		model.addObject("actionTitle", "Management Title2");
		model.addObject("actionMessage", "This is action2");
		return model;
	}
	
	@RequestMapping(value = "/management/action3")
	public ModelAndView managementAction3(HttpServletRequest req){
		HttpSession session = req.getSession();
		Emp emp = (Emp) session.getAttribute("userSession");
		boolean hasAuth = empAuthService.checkEmpAuth(emp, new Auth(3));
		if(!hasAuth){
			return noAuthRedirect();
		}
		ModelAndView model = new ModelAndView();
		model.setViewName("action");
		model.addObject("actionTitle", "Management Title3");
		model.addObject("actionMessage", "This is action3");
		return model;
	}
	
	private ModelAndView noAuthRedirect(){
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome");
		model.addObject("message", "您無此權限，若有問題請洽管理員");
		return model;
	}
}
