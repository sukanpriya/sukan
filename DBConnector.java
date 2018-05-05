package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class DBConnector
{
private Connection con;
private String url="jdbc:oracle:thin:@//localhost:1521/XE";
private String un="system";
private String pwd="system";
public void setCon(Connection con) {
	this.con = con;
}
public void setUn(String un) {
	this.un = un;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public Connection getCon() {
	return con;
}
public String getUn() {
	return un;
}
public String getPwd() {
	return pwd;
}
Connection getConnection()
{
	try
	{
	DriverManager.registerDriver(new OracleDriver());
	con=DriverManager.getConnection(url,un,pwd);
	return con;
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
return null;
}
}
