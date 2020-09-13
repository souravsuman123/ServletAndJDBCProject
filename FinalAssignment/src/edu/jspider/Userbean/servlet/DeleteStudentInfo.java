package edu.jspider.Userbean.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jspider.UserDao.servlet.StudentDAO;


@WebServlet("/DeleteStudent")
public class DeleteStudentInfo extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		int id = Integer.parseInt(req.getParameter("id"));
		
		StudentDAO studao = new StudentDAO();
		
		if(studao.deleteStudentdetails(id))
		{
			out.println("<h1>Data with id :"+id+" is deleted from the database");
		}
		else
		{
			out.println("Data with id as "+id+" is not found in the database");
		}
	}
	
}
