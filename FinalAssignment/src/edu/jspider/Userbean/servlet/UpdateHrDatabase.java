package edu.jspider.Userbean.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jspider.UserDao.servlet.HrDAO;
import edu.jspider.UserDto.servlet.HrDTO;

@WebServlet("/UpdateHr")
public class UpdateHrDatabase extends HttpServlet{

	static String id;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		id = req.getParameter("id");
		HrDAO hrdao = new HrDAO();
		HrDTO hrdto = new HrDTO();
		HrDTO hrdto1 = hrdao.ViewHRDetails(id, hrdto);
		req.setAttribute("hrData", hrdto1);
		req.getRequestDispatcher("finalhrupdateform.jsp").forward(req, resp);
		
	}
	
}
