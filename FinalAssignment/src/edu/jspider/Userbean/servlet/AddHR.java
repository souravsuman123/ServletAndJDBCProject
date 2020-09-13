package edu.jspider.Userbean.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jspider.UserDao.servlet.HrDAO;
import edu.jspider.UserDto.servlet.HrDTO;


@WebServlet("/ADDHR")
public class AddHR extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
				
		String id = req.getParameter("id");
		String fname = req.getParameter("first_name");
		String lname = req.getParameter("last_name");
		String designation = req.getParameter("designation");
		double exp = Double.parseDouble(req.getParameter("exp"));
	
		HrDTO hrdto = new HrDTO();
		
		hrdto.setEmployee_id(id);
		hrdto.setFirst_Name(fname);
		hrdto.setLast_Name(lname);
		hrdto.setDesignation(designation);
		hrdto.setExperience(exp);
		
		HrDAO hrdao = new HrDAO();
		
		if(hrdao.InsertHrInfo(hrdto))
		{
			out.println("<h1>Data is added</h1>");
		}
		else
		{
			out.println("<h1>Data is not added</h1>");
		}
		
	}
	
}
