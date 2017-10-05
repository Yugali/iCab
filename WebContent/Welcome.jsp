
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="NewFile.css">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>iCab</title>
	

   <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300' rel='stylesheet' type='text/css'>

   <script src="jquery.js"></script>
   <script src="Script.js"></script>
	<link rel="stylesheet" href="1140.css">
   <link rel="stylesheet" href="Style.css">
</head>
<body>
<div id="abovethefold">
	<h1>Welcome to iCab</h1>
	</div>
	
	<div class="container12" id="scroll">
		<img src="right1.png" id="phone"/>
		<img src="right2.png" id="phone1"/>
		<h2>Cab Anytime Anywhere</h2>
		<img src="left.png" id="tablet"/>
	</div>
	<div id="scroll1">
		<font color=#dd7600><center><h2>Welcome </font>to<font color=#dd7600> iCab</h2></center></font>
		<center><h2>Cab <font color=#dd7600>Anytime</font> Anywhere</h2></center>
		<br>
		<a href="Login.jsp"><button class="button button5">Login</button></a>
		<br>
		<br>
		Not a part of iCab??
		<br>
		<a href="Register.jsp">
		<button class="button button5">Register</button></a>
		<br>
		<img src="icab.png" class="specialImage">
	<%
    Integer hitsCount = 
      (Integer)application.getAttribute("hitCounter");
    if( hitsCount ==null || hitsCount == 0 ){
       
       hitsCount = 1;
    }else{
       hitsCount += 1;
    }
    application.setAttribute("hitCounter", hitsCount);
%>
<center>
<p>Total number of visits: <%= hitsCount%></p>
</center>
</div>
	</body>
</html>