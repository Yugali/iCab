<%@ page language="java" contentType="text/html; 

charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 

Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300' rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="NewFile1.css">
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>iCab</title>
</head>
<body>
<h1>Welcome to Register Page</h1>
	<div>
<form action="RegisterServlet" method="post">
<center>
<table>
<tr>
<td>FirstName:</td>
<td><input type="text" name="fname" placeholder="Enter First Name" class="button"></td>
</tr>
<tr>
<td>Last Name:</td>
<td><input type="text" name="lname" placeholder="Enter Last Name" class="button"></td>
</tr>
<tr>
<td>Emailid:</td>
<td><input type="text" name="emailid" placeholder="Enter Emailid" class="button" ></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password" placeholder="Enter password" class="button"></td>
</tr>
<tr>
<td>Confirm Password</td>
<td><input type="password" name="password1" placeholder="Enter Confirm Password" class="button"></td>
</tr>
<tr>
<td>Address</td>
<td><textarea rows="5" cols="19" name="add" placeholder="Enter Address" class="button"></textarea>
</td>
</tr>
<tr>
<td>Contact</td>
<td><input type="number" name="contact" placeholder="Enter Contact Password" class="button"></td>
</tr>
<tr>
<td>DOB</td>
<td><input type="date" name="dob" class="button"></td>
</tr>


<tr>
<td><input type="submit" value="Register" class="button button5"></td>
<td><input type="reset" value="Reset" class="button button5"></td>
</tr>

</table>
<h3>${msg}</h3>

</center>



</form>
</div>
</body>
</html>