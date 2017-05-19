<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	
	<form action="processUser.jsp" method="post">
		<br>UserName: <input type="text" name="userName">
		<br>Address1: <input type="text" name="address1">
		<br>Address2: <input type="text" name="address2">
		<br>Address3: <input type="text" name="address3">
		<br>Pin: <input type="text" name="pin">
		<br>State: <input type="text" name="state">
		<br><input type="submit"> 	
	</form>
</body>
</html>