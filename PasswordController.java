package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class PasswordController extends HttpServlet 
{
	public void service(HttpServletRequest x,HttpServletResponse y)
	{
		try
		{
		String opw=x.getParameter("opw");
		String npw=x.getParameter("npw");
		String cnpw=x.getParameter("cnpw");
		HttpSession hs=x.getSession();
		int accnum=(int) hs.getAttribute("accnum");
		Model m=new Model();
		m.setOpw(opw);
		m.setNpw(cnpw);
		m.setCnpw(cnpw);
		m.setAccnum(accnum);
		boolean b=m.changePassword();
		if(b==true)
		{
			y.sendRedirect("/BankApp/PasswordChangeSuccess.jsp");
		}
		
		else
		{
			y.sendRedirect("/BankApp/PasswordChangeFailure.jsp");
		}
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}
}
}