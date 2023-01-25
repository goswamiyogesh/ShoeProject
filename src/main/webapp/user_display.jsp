<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.example.demo.model.*"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%User  u= (User)request.getAttribute("use");%>
<%="Welcome Back "+u.getUser_name() %>



<br><a  href="Shoeslistuser.jsp"><b>SHOES  DETAILS FOR PURCHASE </b></a><br>
</body>
</html>