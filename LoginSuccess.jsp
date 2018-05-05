<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head><h1><center>
<body style="background-color:lightpink">
<%
out.println("Hello " +session.getAttribute("name"));
%></h1><h2><center>
<table>
<tr>
<td><a href="Transfer.jsp">Third party Transfer</td>
</tr>
<tr>
<td><a href="Password.jsp"> Change Password</td>
</tr>
<tr>
<td><a href="Balance.jsp"> Check Balance</td>
</tr>
<tr>
<td><a href="Loan.jsp">Apply Loan</td>
</tr>
<tr>
<td><a href="Statement.jsp">Mini Statement</td>
</tr>
<tr>
<td><a href="Logout.jsp">Logout</td>
</tr>
</table></h2></center>
</body>
</html>