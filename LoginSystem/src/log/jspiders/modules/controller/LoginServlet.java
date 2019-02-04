package log.jspiders.modules.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import log.jspiders.modules.dao.StudentDAO;
import log.jspiders.modules.dto.StudentDTO;



public class LoginServlet extends HttpServlet
{
	private String email;
	private String password;
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		email=req.getParameter("email");
		password=req.getParameter("password");
		StudentDAO dao=new StudentDAO();
		StudentDTO dtoFromDb=dao.getItemByEmail(email,password);
	/*	if(dtoFromDb!=null)
		{
			System.out.println("Menu item available");
			System.out.println("Item details\n"+dtoFromDb);
		}else {
			System.out.println("item not available");
		}*/
		
		PrintWriter out=res.getWriter();
	    out.println("<html><body><h1>Success</h1>"+ dtoFromDb+"</body></html>");
	}

}
