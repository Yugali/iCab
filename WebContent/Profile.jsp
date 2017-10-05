<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300' rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="NewFile1.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>iCab</title>

</head>
<body>
<center>
<%String email1=request.getParameter("email");
%>
<h1>Welcome ${email1}</h1>


</center>
<br>
<br>
<form method="Post" action="BookServlet">
        <input type="hidden" name="email" value="${email1}" />
        <input type='submit' value="Book A Cab" class="button  button5"/>
</form>
<br>
<br>
<form method="Post" action="ShowServlet">
        <input type="hidden" name="email" value="${email1}" />
        <input type='submit' value="View Travels" class="button  button5"/>
</form>
</body>
</html>