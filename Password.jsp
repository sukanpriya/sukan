<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head><center><h1 >Chenge Password</h1>
<body style="background-color:rgba(255, 99, 71, 0.2);">
<form action ="PasswordController">
<h2 >
<table style="background-color:LightGray;","border: 4px solid green;">
<tr>
<td>Old Password</td>
<td><input type="password" name="opw" required/></td></tr>
<tr><td>New Password</td>
<td><input type="password" name="npw" required/></td></tr>
<tr><td>Confirm New Password</td>
<td><input type="password" name="cnpw" required/></td></tr>
<tr><td><input type="submit" value="Submit"/></td>
</tr>
</table>
</h2>
</form></center>
</body>
</html>