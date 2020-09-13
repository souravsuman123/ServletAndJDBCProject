package edu.jspider.Userbean.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jspider.UserDao.servlet.HrDAO;

@WebServlet("/DeletionHR")
public class DeleteHR  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		
		HrDAO hrdao = new HrDAO();
		
		if(hrdao.deleteRecord(id))
		{
			out.println("<h1> The HR record with id = "+id+" had been deleted from the database </h1>");
		}
		else
		{
			out.println("<h1> there is no HR with the id ="+id+" present in the database");
		}
		
	}
	
}
