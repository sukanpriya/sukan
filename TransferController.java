package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class TransferController extends HttpServlet
{
	HttpSession hs;
	public void service(HttpServletRequest x,HttpServletResponse y)
	{
		int tpaccnum=Integer.parseInt(x.getParameter("tpaccnum"));
		int transamt=Integer.parseInt(x.getParameter("transamt"));
		hs=x.getSession();
		int accnum=(int) hs.getAttribute("accnum");
		Model m=new Model();
		m.setTpaccnum(tpaccnum);
		m.setTransamt(transamt);
		m.setAccnum(accnum);
		boolean b=m.transfer();
		if(b==true)
		{
			 try {
				y.sendRedirect("/BankApp/TransferSuccess.jsp");
			}
			 catch (IOException e)
			 {
				e.printStackTrace();
			}
			}
		else
		{
			try {
				y.sendRedirect("/BankApp/TransferFailure.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
		}