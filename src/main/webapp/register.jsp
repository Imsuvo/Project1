<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
<link type="text/css" rel="stylesheet" href="css/style.css"> 
</head>
<body>
<div class='container'>
<form action="register" method=post>
<h2>Register User</h2><br>
Enter Employee ID:
<input type="text" name="empId" ><br>
Enter Your Name:
<input type="text" name="empName"><br>
Enter Email Id:
<input type="text" name="email" ><br>

<input style="background-color: red ;color:white;" type="submit" value="save">
</form>
</div>
</body>
</html>