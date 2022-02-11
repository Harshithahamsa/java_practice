<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="navbar.jsp"%>

<%
String string = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	if (string != null && !string.isEmpty()) {
	%>

	<h1><%=string%></h1>
	<%
	}
	%>
	<form action="./logout" method="post">
		<label>Enter Your ID :</label>
		<input type="number" name="id">
		<input type="submit" value="Delete">

	</form>
</body>
</html>