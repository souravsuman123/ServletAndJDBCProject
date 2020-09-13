package edu.jspider.UserWeb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jspider.UserDao.servlet.AdminCredentialsVerification;
import edu.jspider.Userbean.servlet.AdminLoginCredentials;

@WebServlet("/loginfinding")
public class HomePageUserFinding extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String admin = req.getParameter("Admin");
		String hr = req.getParameter("HR");
		String stu = req.getParameter("Student");
		System.out.println(admin);
		if(admin.contentEquals(admin))
		{
			int username = Integer.parseInt(req.getParameter("username"));
			String password = req.getParameter("password");
			
			AdminLoginCredentials ad = new AdminLoginCredentials();
			
			ad.setUserName(username);
			ad.setUserPassword(password);
			
			AdminCredentialsVerification adv = new AdminCredentialsVerification();
			
			if(adv.verify(ad))
			{
				resp.sendRedirect("AdminDashboard.jsp");
			}
			else
			{
				resp.sendRedirect("Homepage.jsp");
			}
			
			
		}
	}
	
}
