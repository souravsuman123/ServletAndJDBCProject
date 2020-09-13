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

@WebServlet("/UpdateStudent")
public class UpdateStudentInDatabase extends HttpServlet{
	static int id ;
	@Override
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		id = Integer.parseInt(req.getParameter("id"));
		StudentDAO studao = new StudentDAO();
		StudentDTO studto = new StudentDTO();
		StudentDTO studto1 = studao.ViewStudentDetail(id, studto);
		//System.out.println(studto.getFirst_name());
		req.setAttribute("studentData", studto1);
		req.getRequestDispatcher("UpdateStudentForm.jsp").forward(req, resp);
		
	}
}
