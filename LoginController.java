package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginController extends HttpServlet 
{
	
	public void service(HttpServletRequest x,HttpServletResponse y)
	{
		try
		{
			String cusid=x.getParameter("cusid");
			String cuspwd=x.getParameter("cuspwd");
			Model m=new Model();
			m.setCusid(cusid);
			m.setCuspwd(cuspwd);
			boolean b=m.validate();
			if(b==true)
			{
				HttpSession hs=x.getSession(true);
				hs.setAttribute("name",m.getCustomername());
				hs.setAttribute("accnum",m.getAccnum());
				y.sendRedirect("/BankApp/LoginSuccess.jsp");
			}
			else
			{
				y.sendRedirect("/BankApp/Loginfailure.jsp");
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}	
			
		}
	}


