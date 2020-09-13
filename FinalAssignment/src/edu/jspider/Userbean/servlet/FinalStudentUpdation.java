package edu.jspider.Userbean.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import edu.jspider.UserDao.servlet.StudentDAO;
@WebServlet("/StudentUpdation")

public class FinalStudentUpdation extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		int yop_degree = Integer.parseInt(req.getParameter("yopDegree"));
		
		int id = UpdateStudentInDatabase.id;
		
		StudentDAO studao = new StudentDAO();
		
		
		if(studao.UpdateStudentInfo(id,yop_degree))
			out.println("<h1>Data with id ="+id+" is updated successfully");
		else
			resp.sendRedirect("UpdateStudent.jsp");
	}
}
