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
	<h1>WELCOME ${username}</h1> <br></center>
	<h2>To get the photos click 
	<a href="photos.jsp"> Get Photos </a>  <br><br><br>
	<br>
	To Know about us click here: <a href="aboutus.jsp"> Know Us </a><br><br><br> 
	<form action="logout">
		<input type="submit" value="LOGOUT">
	</h2></form>
	
</body>
</html>