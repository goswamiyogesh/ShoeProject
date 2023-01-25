<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.example.demo.model.Shoes" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Shoes> s=(List<Shoes>)request.getAttribute("list"); %>

<table border="1">
<tr><th>Id</th><th>Name</th><th>Brand</th><th>Price</th><th>Update Action</th><th>Delete Action</th></tr>

<%for(Shoes sh:s){%>
<tr><td><%=sh.getId() %></td><td><%=sh.getName() %></td><td><%=sh.getBrand()%></td><td><%=sh.getPrice() %></td><td><form action="updateshoe1.jsp">
<input type="hidden" name="shid" value=<%=sh.getId() %>>
<input type="submit" value="update">
</form></td>
<td><form action="deleteshoe">
<input type="hidden" name="shid" value=<%=sh.getId() %>>
<input type="submit" value="Delete"></form></td></tr>

<%}%>

</table>

</body>
</html>