<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>Updating the Shoe detail</i></h1>
<form action="updateshoe">
<input type="hidden" name="shid" value=<%=request.getParameter("shid")%>>
Name to be updated <input type="text" name="name">
Brand to be updated <input type="text" name="brand">
Price to be updated <input type="text" name="price">
<input type="submit" value="update">
</form>

</body>
</html>