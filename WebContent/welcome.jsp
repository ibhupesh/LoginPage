<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body text="Black" bgcolor="Orange">
	<%
		if(session.getAttribute("username")==null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
	<center>
	<h1>WELCOME,  ${username} To servlet and JSPs implementation web Application</h1> <br>
	<h2>To get the photos click 
	<a href="photos.jsp"> Get Photos </a>  <br><br><br>
	<br>
	To Know about us click here: <a href="aboutus.jsp"> Know Us </a><br><br><br> 
	<form action="logout">
		<input type="submit" value="LOGOUT">
	</form> <br><br>
	<form action="Show">
		<input type="submit" value="Show Registered Users">
	</h2></form></center>
</body>
</html>