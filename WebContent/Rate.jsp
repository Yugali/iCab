<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300' rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="NewFile1.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Please Make sure of the below given information</h2>
<form action="Maps.html" >
Name        :<input type="text" value="${name}"class="button">
<br>
Emailid     :<input type="text" value="${email}"class="button">
<br>
Contact no  :<input type="text" value="${cont}"class="button">
<br>
Car type    :<input type="text" value="${type}"class="button">
<br>
Origin      :<input type="text" value="${origin}"class="button">
<br>
Destination :<input type="text" value="${dest}"class="button">
<br>
<br>
<br>
<input type="submit" value="Confirm"class="button button5">


</form>
</body>
</html>