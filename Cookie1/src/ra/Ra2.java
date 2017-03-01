package ra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Ra2 extends HttpServlet {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
			    response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			          
			    String n=request.getParameter("uname");  
			    out.print("Welcome "+n);  
			  
//			    Cookie ck=new Cookie("uname",n);  
//			    response.addCookie(ck);
		  
			     
			    out.print("<form action='t2' method='Post'>");  
			    out.print("<input type='hidden' name='uname' value='"+n+"'>");  
			    out.print("<input type='submit' value='go'>");  
			    out.print("</form>");  
			          
			    out.close();  
		

	}

		
		
	}
