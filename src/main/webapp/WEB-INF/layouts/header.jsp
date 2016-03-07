<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
		<nav class="navbar navbar-fixed-top " role="navigation">
			<div class="row col-xs-12">
				<div class="container">
					<div class="navbar-header ">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse" data-target="#navbar" aria-expanded="false"
							aria-controls="navbar">
							<span class="sr-only">Toggle navigation</span> 
							<span class="icon-bar"></span> 
							<span class="icon-bar"></span> 
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="<%=request.getContextPath()%>/hello.do">SpringMVC</a>
					</div>
					<div id="navbar" class="collapse navbar-collapse">
					<jsp:useBean id="empAuthService" class="com.tob.service.impl.EmpAuthServiceImpl" type="com.tob.service.EmpAuthService" />
						<ul class="nav navbar-nav">
						<c:forEach var="item" items="${empAuthService.getEmpAuth(userSession) }">
							<c:if test="${item.authNo eq 1 }">
							<li><a href="<%=request.getContextPath()%>/management/action1.do">功能1</a></li>
							</c:if>
							<c:if test="${item.authNo eq 2 }">
							<li><a href="<%=request.getContextPath()%>/management/action2.do">功能2</a></li>
							</c:if>
							<c:if test="${item.authNo eq 3 }">
							<li><a href="<%=request.getContextPath()%>/management/action3.do">功能3</a></li>
							</c:if>
						</c:forEach>
						</ul>
						<!-- end of menu -->
						<ul class="nav navbar-nav navbar-right">
							<li class="dropdown">
							<c:choose>
								<c:when test="${userSession ne null }">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
									我的選單 
									<span class="caret"></span>
								</a>
								<ul class="dropdown-menu" role="menu">
<!-- 									<li role="presentation" class="dropdown-header">參加活動</li> -->
<!-- 									<li role="presentation"><a href="#">我的個人頁面</a></li> -->
<!-- 									<li role="presentation"><a href="#">我的票卷</a></li> -->
<!-- 									<hr> -->
<!-- 									<li role="presentation" class="dropdown-header">主辦活動</li> -->
<!-- 									<li role="presentation"><a href="#">我舉辦的活動</a></li> -->
<!-- 									<li role="presentation"><a href="#">設定主辦單位</a></li> -->
<!-- 									<li role="presentation"><a href="#">通訊錄</a></li> -->
<!-- 									<hr> -->
<!-- 									<li role="presentation" class="dropdown-header">帳號設定</li> -->
<!-- 									<li role="presentation"><a href="#">修改個人資料</a></li> -->
<!-- 									<hr> -->
									<li role="presentation"><a href="#">登出</a></li>
								</ul>
								</c:when>
								<c:otherwise>
							<a href="<%=request.getContextPath()%>/employee/login.do">登入</a>
								</c:otherwise>
							</c:choose>
							</li>
						</ul>
					</div>
					<!-- navbar -->
				</div>
				<!--/.container-fluid -->
			</div>
		</nav>