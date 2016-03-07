package com.tob.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tob.model.Emp;

@WebFilter(urlPatterns="/management/*")
public class ManagementActionFilter implements Filter {
	
	private final String LOGIN_URL = "/employee/login.do";

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest) req;
		HttpSession session = httpReq.getSession();
		Emp emp = (Emp) session.getAttribute("userSession");
		if(emp == null || emp.getEmpNo() == null){
			HttpServletResponse httpRes = (HttpServletResponse) res;
			String sourceURL = httpReq.getServletPath();
			httpRes.sendRedirect(httpReq.getContextPath() + LOGIN_URL + "?sourceURL=" + sourceURL);
			return;
		}
		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
