<%@page import="com.example.demo.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<% Student s = (Student) request.getAttribute("us"); %>
<body style='background-color: brown;'>
<h1>This is Edit Page</h1>
<form action="up">
    <pre>
                  <input type="hidden" name="sid" value="<%=s.getSid()%>"><br><br>
      Name      : <input type="text" name="name" value="<%=s.getName()%>"><br><br>
      User Name : <input type="text" name="uname" value="<%=s.getUname()%>"><br><br>
      Password  : <input type="text" name="pass" value="<%=s.getPass()%>"><br><br>
      Address   : <input type="text" name="address" value="<%=s.getAddress()%>"><br><br>
      <input type="submit" value="Update"> 
 </pre> 
</form>
</body>
</html>