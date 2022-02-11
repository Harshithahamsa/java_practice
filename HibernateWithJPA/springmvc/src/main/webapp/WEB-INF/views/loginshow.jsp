<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String string = (String) request.getAttribute("username");
String string2 = (String) request.getAttribute("password");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		your username is
		<%=string%></h1>
	<h2>
		your password is
		<%=string2%></h2>

</body>
</html>