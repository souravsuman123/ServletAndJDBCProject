package edu.jspider.UserDao.servlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import edu.jspider.UserDto.servlet.RequirementsDTO;

public class RequirementsDAO {

	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	public boolean InsertRequirements(RequirementsDTO requirementsdto)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers installed");
			
			FileInputStream fin = new FileInputStream("F://Jspider-J@EE//JDBC//Files/db_info1.prop");
			
			Properties prop = new Properties();
			
			prop.load(fin);
			
			String dburl = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pass = prop.getProperty("password");
			
			con = DriverManager.getConnection(dburl, user, pass);
			System.out.println("Connection Made");
			
			String query = "insert into requirements_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setLong(1, requirementsdto.getRequirement_id());
			pstmt.setString(2, requirementsdto.getCompany_name());
			pstmt.setString(3, requirementsdto.getType());
			pstmt.setString(4, requirementsdto.getJob_title());
			pstmt.setString(5, requirementsdto.getDesignation());
			pstmt.setString(6, requirementsdto.getJob_location());
			pstmt.setString(7, requirementsdto.getSkills_required());
			pstmt.setDouble(8, requirementsdto.getSalary_package());
			pstmt.setString(9, requirementsdto.getBond_period());
			pstmt.setDouble(10, requirementsdto.getTenth_percent_req());
			pstmt.setDouble(11, requirementsdto.getTwelth_percent_req());
			pstmt.setDouble(12, requirementsdto.getDegree_percent_req());
			pstmt.setDouble(13, requirementsdto.getMasters_percent_req());
			pstmt.setString(14, requirementsdto.getBranch());
			
			int count = pstmt.executeUpdate();
			if(count != 0)
				return true;
			
		} 
		catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
}
