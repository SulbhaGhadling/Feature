<%@page import="com.example.demo.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
   function editData() { 
 	alert("You are about to edit this record."); 
 	document.mypage.action="edit"; 
 	document.mypage.submit(); 
 } 
  
   function deleteData() { 
 		alert("You are about to delete this record."); 
 		document.mypage.action="del"; 
 		document.mypage.submit(); 
 	} 
 </script> 
<body style='background-color: yellow;'>
<div align="center">
<form name="mypage">
<h3>Login Successfully</h3> <br><br>

<% List<Student> list = (List)request.getAttribute("list"); %>

<table border="5" style="background-color: pink;" >
    <thead style="color: red;">
       <tr>
          <th>Select</th>
          <th>Student ID</th>
          <th>Student Name</th>
          <th>Student uName</th>
          <th>Student Address</th>
          <th>Student Password</th>
          <th>EDIT</th>
          <th>DELETE</th>
       </tr>
    </thead>
    <tbody>
    <tr>
    <% for(Student s : list) {%>
       <td><input type="radio" name="id" value="<%=s.getSid()%>"></td>
       <td><%=s.getSid()%></td>
       <td><%=s.getName()%></td>
       <td><%=s.getUname()%></td>
       <td><%=s.getAddress()%></td>
       <td><%=s.getPass()%></td>
       <td><input type="button" value="Edit" onclick="editData()" ></td>
       <td><input type="button" value="Delete" onclick="deleteData()" ></td>
    </tr>
    <%}%>
    </tbody>
</table>
</form>
</div>
</body>
</html>