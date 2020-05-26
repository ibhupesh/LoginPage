<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control","no-cache,no-store,must-revealidate"); //HTTP 1.1
	response.setHeader("Pragma","no-chache"); //HTTP 1.0
	response.setHeader("Expires","0"); //Proxies
		if(session.getAttribute("username")==null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
	<img src="C:\Users\ibhup\Pictures\sent\IMG_20181017_160146_HDR.jpg" alt="Punjabi University Patiala Logo">
</body>
</html>