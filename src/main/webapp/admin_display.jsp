

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
<%Admin  a= (Admin)request.getAttribute("adm");%>
<%="Welcome Back "+a.getUsername() %>

<br><a  href="insert.jsp"><b>INSERT SHOES</b></a><br>
<br><a  href="Shoeslist.jsp"><b>SHOES LIST</b></a><br>

</body>
</html>