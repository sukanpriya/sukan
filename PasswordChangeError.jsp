<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Please Enter the new password and confirm password correctly</h1>
<form action ="PasswordController">
<table>
<tr>
<td>Old Password</td>
<td><input type="password" name="opw" required/></td></tr>
<tr><td>New Password</td>
<td><input type="password" name="npw" required/></td></tr>
<tr><td>Confirm New Password</td>
<td><input type="password" name="cnpw" required/></td>
</tr>
<tr><td><input type ="submit" value="submit"/> </td></tr>
</table>




</form>
</body>
</html>