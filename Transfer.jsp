<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:lightblue">
<form action="TransferController">
<table>
<tr>
<td> Third Party Accnum </td>
<td><input type="text" name="tpaccnum" required/></td> 
</tr>
<tr>
<td> Transfer Amount </td>
<td><input type="text" name="transamt" required/> </td>
</tr>
<tr>
<td><input type="submit" value="TRANSFER"/> </td>
</tr>
</table>
</form>
</body>
</html>