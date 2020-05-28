<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Photos</title>
</head>
<body bgcolor="pink">
	<%
	response.setHeader("Cache-Control","no-cache,no-store,must-revealidate"); //HTTP 1.1
	response.setHeader("Pragma","no-chache"); //HTTP 1.0
	response.setHeader("Expires","0"); //Proxies
		if(session.getAttribute("username")==null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
	<img src="https://upload.wikimedia.org/wikipedia/commons/1/1d/Punjabi_university%2C_patiala.jpg" width="560" height="315" >
	<iframe width="560" height="315" src="https://www.youtube.com/embed/mOLlhfxGhVk" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>