<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.io.StringWriter"%> 
<html>
<head>
<title>错误页面</title>
</head>
<body>
	<%
		out.println("您访问的页面出错了，请与放心保微信服务号联系！");
	%>
	<c:if test="${phoneError!=''}">${phoneError}</c:if>
</body>
</html>