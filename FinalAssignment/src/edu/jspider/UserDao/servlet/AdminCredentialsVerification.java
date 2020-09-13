package edu.jspider.UserDao.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.jspider.Userbean.servlet.AdminLoginCredentials;

public class AdminCredentialsVerification {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	public boolean verify(AdminLoginCredentials ad)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String dburl = "jdbc:mysql://localhost:3306/jsp_std_db";
			String username = "root";
			String password ="root";
			
			con = DriverManager.getConnection(dburl, username, password);
			
			String query = "select * from adminlogin where Id = ?  and password = ?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, ad.getUserName());
			pstmt.setString(2, ad.getUserPassword());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()!=false)
				return true;
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
}
