package log.jspiders.modules.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import log.jspiders.modules.dao.StudentDAO;
import log.jspiders.modules.dto.StudentDTO;



public class SignUpServlet extends HttpServlet
{
	private String name;
	private String email;
	private String phone;
    private String password;
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		name=req.getParameter("name");
	    email=req.getParameter("email");
	    phone=req.getParameter("phone");
	    password=req.getParameter("password");
	    
	    StudentDTO dto=new StudentDTO();
	    dto.setName(name);
	    dto.setEmail(email);
	    dto.setPhone(phone);
	    dto.setPassword(password);
	    
	    StudentDAO dao=new StudentDAO();
	    dao.insertValues(dto);
	    
	    PrintWriter out=res.getWriter();
	    out.println("<html><body><h1>Success</h1></body></html>");
	}
}
