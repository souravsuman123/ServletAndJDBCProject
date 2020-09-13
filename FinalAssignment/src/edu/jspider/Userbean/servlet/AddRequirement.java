package edu.jspider.Userbean.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jspider.UserDao.servlet.RequirementsDAO;
import edu.jspider.UserDto.servlet.RequirementsDTO;

@WebServlet("/AddRequirement")
public class AddRequirement extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		long id = Long.parseLong(req.getParameter("id"));
		String companyName = req.getParameter("companyName");
		String jobtype = req.getParameter("Etype");
		String jobtitle = req.getParameter("title");
		String desgn = req.getParameter("designation");
		String location = req.getParameter("location");
		String skills = req.getParameter("skills");
		double pacakage = Double.parseDouble(req.getParameter("package"));
		String period = req.getParameter("period");
		double tenthMarks = Double.parseDouble(req.getParameter("tenthMarks"));
		double twelthMarks = Double.parseDouble(req.getParameter("twelthMarks"));
		double degreeMarks = Double.parseDouble(req.getParameter("degreeMarks"));
		double mastersMarks = Double.parseDouble(req.getParameter("mastersMarks"));
		String branch = req.getParameter("branch");
		
		RequirementsDAO rdao = new RequirementsDAO();
		RequirementsDTO rdto = new RequirementsDTO();
		
		rdto.setRequirement_id(id);
		rdto.setCompany_name(companyName);
		rdto.setType(jobtype);
		rdto.setJob_title(jobtitle);
		rdto.setDesignation(desgn);
		rdto.setJob_location(location);
		rdto.setSkills_required(skills);
		rdto.setSalary_package(pacakage);
		rdto.setBond_period(period);
		rdto.setTenth_percent_req(tenthMarks);
		rdto.setTwelth_percent_req(twelthMarks);
		rdto.setDegree_percent_req(degreeMarks);
		rdto.setMasters_percent_req(mastersMarks);
		rdto.setBranch(branch);
		
		if(rdao.InsertRequirements(rdto))
		{
			out.println("<h1>One Requirement is added</h1>");
		}
		else
		{
			out.println("<h1>No requirement is added</h1>");
		}
	}
	
}
