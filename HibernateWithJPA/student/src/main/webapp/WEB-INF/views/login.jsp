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
		<legend>Student Login</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<th><label>Roll No. : </label></th>
					<td><input type="text" name="rollno"></td>
				</tr>
				<tr>
					<th><label>Password</label></th>
					<td><input type="password" name="password"></td>
				</tr>
			</table>
			<input type="submit" value="LogIn">


		</form>
	</fieldset>

</body>
</html>