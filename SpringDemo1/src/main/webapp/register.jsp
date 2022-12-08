<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Input from User</title>
</head>
<body style='background-color: yellow;'>
<div align="center">
	<form action="reg" method="post">
		<pre>
		<input type="hidden" name="sid" value="0"> <br>
		Student Name      : <input type="text" name="name"> <br>
		Student User Name : <input type="text" name="uname"> <br>
		Student Address   : <input type="text" name="address"> <br>		
		Student Password  : <input type="text" name="pass"> <br>
							<input type="submit" value="R E G I S T E R">
</pre>
	</form>
	</div>
</body>
</html>