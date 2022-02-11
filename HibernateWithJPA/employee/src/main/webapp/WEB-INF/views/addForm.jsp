<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="navbar.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
%>
<%
String errmsg = (String) request.getAttribute("errmsg");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (msg != null && !msg.isEmpty()) {
	%>

	<h1 style="color: green"><%=msg%></h1>

	<%
	}
	%>

	<%
	if (errmsg != null && !errmsg.isEmpty()) {
	%>
	<h1 style="color: red"><%=errmsg%></h1>
	<%
	}
	%>
	<fieldset>
		<legend>Employee Add Form</legend>
		<form action="./add" method="post">
			<table>
				<tr>
					<td><label>Enter Your ID :</label></td>
					<td><input type="number" name="id"></td>
				</tr>
				<tr>
					<td><label>Enter Your UserName :</label></td>
					<td><input type="text" name="user"></td>
				</tr>
				<tr>
					<td><label>Enter Your Name :</label></td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td><label>Enter Your Address :</label></td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td><label>Enter Your Password :</label></td>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<input type="submit" value="Add">
		</form>
	</fieldset>

</body>
</html>