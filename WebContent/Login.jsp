<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="NewFile1.css">
<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300' rel='stylesheet' type='text/css'>
<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Login Page</h1>
<form action="LoginServlet" method="post">
<center>
<h2>Email id &nbsp&nbsp&nbsp&nbsp
<input type="email" name="emailid" placeholder="Enter emailid" class="button"></h2>
<h2>Password:
<input type="password" name="password" placeholder="Enter password" class="button"></h2>
<h2><input type="submit" value="Login" class="button button5">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<input type="reset" value="refresh" class="button button5"></h2>
<a href="Forgot.jsp"><font color=#ee6600  size="4em"> Forgot Password?</font></a>

<h3>${msg}</h3>


</center>
</form>
</body>
</html>