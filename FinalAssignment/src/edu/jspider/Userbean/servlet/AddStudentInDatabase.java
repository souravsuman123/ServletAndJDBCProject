package edu.jspider.Userbean.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jspider.UserDao.servlet.StudentDAO;
import edu.jspider.UserDto.servlet.StudentDTO;
@WebServlet("/InsertStudent")
public class AddStudentInDatabase extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int id = Integer.parseInt(req.getParameter("id"));
		String first_name = req.getParameter("fname");
		String middle_name = req.getParameter("mname");
		String last_name = req.getParameter("lname");
		long yopdegree = Long.parseLong(req.getParameter("yopDegree"));
		long yopmasters = Long.parseLong(req.getParameter("yopMasters"));
		double tenth_marks = Double.parseDouble(req.getParameter("tenthMarks"));
		double twelth_marks = Double.parseDouble(req.getParameter("twelthMarks"));
		double degree_marks = Double.parseDouble(req.getParameter("degreeMarks"));
		double masters_marks = Double.parseDouble(req.getParameter("mastersMarks"));
		
		StudentDTO studto = new StudentDTO();
		
		studto.setStudent_id(id);
		studto.setFirst_name(first_name);
		studto.setMiddle_name(middle_name);
		studto.setLast_name(last_name);
		studto.setYop_degree(yopdegree);
		studto.setYop_masters(yopmasters);
		studto.setMarks_tenth(tenth_marks);
		studto.setMarks_tenth(tenth_marks);
		studto.setMarks_twelth(twelth_marks);
		studto.setMarks_degree(degree_marks);
		studto.setMarks_masters(masters_marks);
		
		StudentDAO studao = new StudentDAO();
		
		if(studao.InsertStudentInfo(studto))
		{
			out.println("One Student data is added");
		}
		else
		{
			resp.sendRedirect("AddStudentPage.jsp");
		}
		
	}
	
	
}
