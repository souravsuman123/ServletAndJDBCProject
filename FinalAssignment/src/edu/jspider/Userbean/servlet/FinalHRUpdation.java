package edu.jspider.Userbean.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jspider.UserDao.servlet.HrDAO;

@WebServlet("/HRUpdation")
public class FinalHRUpdation extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		double experience = Double.parseDouble(req.getParameter("exp"));
		String id = UpdateHrDatabase.id;
		
		HrDAO hrdao = new HrDAO();
		
		if(hrdao.UpdateHrDetails(id,experience))
		{
			out.println("<h1> HR data is successfully updated</h1>");
		}
		else
		{
			out.println("<h1>HR data is not present in the database</h1>");
		}
	}
	
}
