package com.tob.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tob.model.Emp;
import com.tob.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/employee/login")
	public ModelAndView login(){
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/employee/check", params = {"empAccount", "empPassword"}, method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView check(
			@RequestParam(value="redirectURL", required=false) String redirectURL, 
			@RequestParam("empAccount") String empAccount, 
			@RequestParam("empPassword") String empPassword,
			HttpServletRequest req){
		ModelAndView model = new ModelAndView();
		
		Emp emp = loginService.login(empAccount, empPassword);
		if(emp.getEmpNo() == null){
			model.addObject("empAccount", empAccount);
			model.addObject("errorMessage", "帳號或密碼錯誤!");
			model.addObject("redirectURL", redirectURL);
			model.setViewName("login");
			return model;
		}
		
		HttpSession session = req.getSession();
		session.setAttribute("userSession", emp);
		if(StringUtils.isBlank(redirectURL)){
			model.setViewName("welcome");
			model.addObject("message", "登入成功! " + emp.getAccount() + " 您好。");
		}else{
			model.setViewName("redirect:" + redirectURL);
		}
		
		return model;
	}
}
