<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%
String scheme=request.getScheme();
String servername=request.getServerName();
int serverPort=request.getServerPort();
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
if(serverPort==0 || serverPort==80){
	basePath = request.getScheme()+"://"+request.getServerName()+path+"/";
}
System.out.println(basePath);
%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录页</title>
<script type="text/javascript" src="<%=basePath%>js/jquery/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	function loginMethod(){
		var userName=document.getElementById("userName").value;
		var password=document.getElementById("password").value;
		$.ajax( {
			type : "POST",
			url : "/index/dologin",//
			async : true,
			data : 'userName='+userName+'&password='+password,
			success : function(data) {
				alert(data);
				//var temp=eval(data);
				//alert(temp);
				if(data!=''){
					$("#submitForm").attr("action", "/index/userCenters").submit();
					return;
				}else{
					alert("用户名或密码错误，请重新输入");
					return ;
				} 
			}
		});
	}
</script>
</head>
<body>
<h1>这是服务器1中的登录页面</h1>
<form id="submitForm" action="">
<img src="<%=basePath%>img/banner.jpg" alt="图片" />
	<table>
		<tr>
			<td><span>用户名：</span></td>
			<td><input type="text" id="userName" name="userName"/></td>
		</tr>
		<tr>
			<td><span>用户名：</span></td>
			<td><input type="password" id="password" name="password"/></td>
		</tr>
		<tr>
			<td><input type="button" onclick="loginMethod()" value="登录"/></td>
		</tr>
	</table>
</form>
</body>
</html>