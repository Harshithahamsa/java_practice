<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="navbar.jsp" %>
    <%String string=(String)request.getAttribute("msg");%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">

</head>
<body>
<%if(string!=null && !string.isEmpty()) {%>
<h1><%= string %></h1>
<%} %>
<!-- <form action="./update" method="post"> -->

<!-- 		<label>Update Your Name</label> <br>  -->
<!-- 		<input type="text" name="empName" required="required">  -->
<!-- 		<label>Update Your UserName:</label> <br>  -->
<!-- 		<input type="text" name="userName" required="required">  -->
<!-- 		<label>Update Your Password:</label> -->
<!-- 		<input type="password" name="password" required="required">  -->
<!-- 		<label>Enter The Role</label> -->
<!-- 		<select name="empRole" required="required"> -->
<!-- 			<option>Choose Authorization</option> -->
<!-- 			<option value="ROLE_USER">USER</option> -->
<!-- 			<option value="ROLE_ADMIN">ADMIN</option> -->
<!-- 		</select> -->
<!-- 		<input type="submit" value="Update Employee"> -->
<!-- 	</form> -->

<form>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Update Your Name</label>
      <input type="text" class="form-control" id="inputEmail4" >
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Update Your Password</label>
      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Update Your UserName</label>
    <input type="text" class="form-control" id="inputAddress" >
  </div>
<!--   <div class="form-group"> -->
<!--     <label for="inputAddress">UpdateYour Role</label> -->
<!--     <input type="text" class="form-control" id="inputAddress" > -->
<!--   </div> -->
  
    <div class="form-group col-md-4">
      <label for="inputState">Choose Authorization</label>
      <select id="inputState" class="form-control">
        <option selected>USER</option>
        <option>ADMIN</option>
      </select>
    </div>
    
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</body>
</html>