<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style='background-color: blue;'>
<div align="center">
<h3>Login Page</h3>
<%-- ${s} --%>
<%-- ${m} --%>
<%-- 	<% String string = (String) request.getAttribute("s"); %> --%>
<%-- 	<% if(string!=null) { %> --%>
<%-- 	<% out.print(string); %> --%>
<%-- 	<% } %> --%>
	<form action="log"> <br> <br>
		UserName : <input type="text" name="uname"> <br> <br>
		PassWord : <input type="text" name="pass"> <br> <br>
				   <input type="submit" value="L O G I N">
	</form>
</div>
</body>
</html>