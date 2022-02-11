<%@page import="com.te.springmvc.bean.EmployeeLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
EmployeeLogin employeeLogin = (EmployeeLogin) request.getAttribute("logindata");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>
		Your username is :
		<%=employeeLogin.getUser()%></h1>
	<h1>
		Your password is :
		<%=employeeLogin.getPass()%></h1>

</body>
</html>