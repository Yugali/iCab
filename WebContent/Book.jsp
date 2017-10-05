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
<h4>Welcome to Cab Booking</h4>

<form action="ViewServlet">
<h3>Name:		&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="name" value="${name}" class="button"><br></h3>
<h3>Emailid:	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="email" value="${email}" class="button"><br></h3>
<h3>Contact no: &nbsp&nbsp<input type="text" name="cont" value="${cont}" class="button"> <br></h3>
<center>

<h4>Select Vehicle Type According to Rate</h4>

<table >
<tr>
<th><font size="6px">Vehicle</th>
<th></th>
<th><font size="6px">Type</th>
<th></th>
<th><font size="6px">Price</th>
</tr>
<tr >

<td>Car</td>
<td></td>
<td>Non a/c</td>
<td></td>
<td>${carnac}Rs/km</td>
</tr>
<tr>
<td>Car</td>
<td></td>
<td>a/c</td>
<td></td>
<td>${carac}Rs/km</td>
</tr>
<tr>
<td>SUV</td>
<td></td>
<td>Non a/c</td>
<td></td>
<td>${suvnac}Rs/km</td>
</tr>
<tr>
<td>SUV</td>
<td></td>
<td>a/c</td>
<td></td>
<td>${suvac}Rs/km</td>
</tr>
</font>
</table>
</center>
<br>
<br>
<br>

<select required name="list1" class="button" >
  <option value="" class="button">Select Vehicle Type</option>
  <option value="Car" class="button">Car (a/c)</option>
  <option value="Car" class="button">Car (non a/c)</option>
  <option value="SUV" class="button">SUV (a/c)</option>
  <option value="SUV" class="button">SUV (non a/c)</option>
</select>
<select required name="list2" class="button" >
  <option value="" class="button">Select Origin</option>
  <option value="PCCOE" class="button">PCCOE</option>
  <option value="MIT" class="button">MIT</option>
  <option value="AISSMS" class="button">AISSMS</option>
  <option value="COEP" class="button">COEP</option>
  <option value="DY" class="button">DY</option>
</select>
<select required name="list3" class="button" >
  <option value="" class="button">Select Origin</option>
  <option value="PCCOE" class="button">PCCOE</option>
  <option value="MIT" class="button">MIT</option>
  <option value="AISSMS" class="button">AISSMS</option>
  <option value="COEP" class="button">COEP</option>
  <option value="DY" class="button">DY</option>
</select>
<br>
<br>
<br>
<input type="submit" value="Confirm" class="button button5">
</form>



</div>
</body>
</body>
</html>