package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Model 
{
private Connection con;
private PreparedStatement pstmt;
private ResultSet res;
private String customername;
private int accnum;
private String cusid;
private String cuspwd;
private int tpaccnum;
private int transamt;
private int balance;
private String opw;
private String npw;
private String cnpw;
private int nb;


public void setNb(int nb) {
	this.nb = nb;
}

public int getNb() {
	return nb;
}

public String getOpw() {
	return opw;
}
public String getNpw() {
	return npw;
}
public String getCnpw() {
	return cnpw;
}
public void setOpw(String opw) {
	this.opw = opw;
}
public void setNpw(String npw) {
	this.npw = npw;
}
public void setCnpw(String cnpw) {
	this.cnpw = cnpw;
}
public int getTpaccnum() {
	return tpaccnum;
}
public int getTransamt() {
	return transamt;
}
public int getBalance() {
	return balance;
}
public void setTpaccnum(int tpaccnum) {
	this.tpaccnum = tpaccnum;
}
public void setTransamt(int transamt) {
	this.transamt = transamt;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public void setCon(Connection con)
{
	this.con = con;
}
public void setPstmt(PreparedStatement pstmt) {
	this.pstmt = pstmt;
}
public void setRes(ResultSet res) {
	this.res = res;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public void setAccnum(int accnum) {
	this.accnum = accnum;
}
public void setCusid(String cusid) {
	this.cusid = cusid;
}
public void setCuspwd(String cuspwd) {
	this.cuspwd = cuspwd;
}
public Connection getCon() {
	return con;
}
public PreparedStatement getPstmt() {
	return pstmt;
}
public ResultSet getRes() {
	return res;
}
public String getCustomername() {
	return customername;
}
public int getAccnum() {
	return accnum;
}
public String getCusid() {
	return cusid;
}
public String getCuspwd() {
	return cuspwd;
}
Model()
{
	DBConnector db=new DBConnector();
	con=db.getConnection();
}
boolean validate()
{
try
{
	pstmt=con.prepareStatement("select * from BANK where CUSTOMERID=? and PASSWORD=?");
	pstmt.setString(1,cusid);
	pstmt.setString(2,cuspwd);
	res=pstmt.executeQuery();
	while(res.next()==true)
	{
		 customername=res.getString(5);
		 accnum=res.getInt(1);
		 return true;
	}
}
catch(SQLException e)
{
	e.printStackTrace();
}
return false;
}
boolean transfer()
{
try	
{
	pstmt=con.prepareStatement("update BANK set BALANCE=BALANCE-? where ACCNo=? ");
	pstmt.setInt(1, transamt);
	pstmt.setInt(2, accnum);
	pstmt.executeUpdate();
	pstmt=con.prepareStatement("update BANK set BALANCE=BALANCE+? where ACCNo=? ");
	pstmt.setInt(1, transamt);
	pstmt.setInt(2, tpaccnum);
	pstmt.executeUpdate();
	return true;
}
catch (SQLException e)
{
	e.printStackTrace();
}
return false;
}
boolean changePassword()
{
	try
	{
		pstmt=con.prepareStatement("update BANK set PASSWORD=? where ACCNO=?" );
		pstmt.setString(1, npw);
		pstmt.setInt(2, accnum);
		pstmt.executeUpdate();
		return true;
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
}
	return false;
}
boolean CheckBalance()
{
	try
	{
		pstmt=con.prepareStatement("update BANK set BALANCE=BALANCE-? where ACCNO=?");
		pstmt.setInt(1,nb);
		return true;
	}
	catch(Exception e)
	{
	e.printStackTrace();	
	}
	return false;
}
}