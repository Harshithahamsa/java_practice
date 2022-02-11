<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%String string = (String) request.getAttribute("errMessage"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%if(string!= null){ %>
<h1> <%= string %> </h1>
<%} %>
	<fieldset>
		<legend>Employee LogIn Page</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td><label>Enter your ID :</label></td>
					<td><label> <input type="number" name="id"></label></td>
				</tr>
				<tr> 
					<td> <label>Enter your Password :</label> </td>
					<td> <label> <input type="password" name="password"> </label> </td>
				</tr>
			</table>
			<input type="submit" value="LogIn">
		</form>
	</fieldset>
</body>
</html>