<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
List<String> list = (List<String>) request.getAttribute("friends");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		My friends are :
		<%
	for (String string : list) {
	%>
		<%=string%>
		<%
		}
		%>
	</h1>


</body>
</html>