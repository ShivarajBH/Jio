package ra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Ra1 extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
			
			    response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			    
			    System.out.println("HI");
			    
			    String n=request.getParameter("uname");
			    out.print("Hello" +n);
			      
//			    Cookie ck[]=request.getCookies();  
//			    out.print("Hello "+ck[0].getValue());  
		  
	    out.close();  
	  
	         }
	
			         
	         
	    }  
	      
	  
	
		
		
		
		
