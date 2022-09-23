<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<link type="text/css" rel="stylesheet" href="css/style.css"> 
</head>
<body>
<div class='container'>
<form action="login" method=post>
<h2>Login Page</h2><br>
Enter Employee ID:
<input type="text" name="empId" ><br>
Enter Your Name:
<input type="text" name="empName"><br>
Date:
<input type="date" name="date" placeholder="Enter date"><br>

<input style="background-color: red ;color:white;" type="submit" value="Login">


</form>
</div>
</body>
</html>