<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
		<form action="<%=request.getContextPath() %>/employee/check.do" method="post" class="col-xs-12 col-xs-offset-0 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3" >
			<div class="form-group">
				<label style="color: red">${errorMessage }</label>
			</div>
			<div class="form-group">
				<label for="empAccount">Account</label>
				<input type="text" class="form-control" id="empAccount" name="empAccount" />
			</div>
			<div class="form-group">
				<label for="empPassowrd">Password</label>
				<input type="password" class="form-control" id="empPassowrd" name="empPassword" />
			</div>
			<button class="btn btn-primary">submit</button>
		</form>