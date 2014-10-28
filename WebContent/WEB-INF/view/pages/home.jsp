<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
 			<td>登录名</td>
			<td>密码</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
			<td>QQ</td>
			<td>手机号</td>
			<td>Email</td>
		</tr>
		<c:forEach items="${list}" var="user" >
			<tr>
 				<td>${user.loginid}</td>
				<td>${user.password}</td>
				<td>${user.username}</td>
				<td>${user.age}</td>
				<td>
					<c:if test="${user.sex==true}">男</c:if>
					<c:if test="${user.sex==false}">女</c:if>
				</td>
				<td>${user.qq}</td>
				<td>${user.mobilephone}</td>
				<td>${user.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>