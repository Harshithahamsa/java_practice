<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>LogIn Form</legend>
		<form action="./loginshow4" method="post">
			<table>
				<tr>
					<th> <label>UserName</label></th>
					<td> <label> <input type="text" name="user" placeholder="Enter your username"> </label> </td>
				</tr>
				<tr>
					<th> <label>Password</label></th>
					<td> <label> <input type="password" name="pass" placeholder="Enter your password"> </label> </td>
				</tr>
			</table>
			<input type="submit" value="Submit">
		</form>
	</fieldset>
</body>
</html>