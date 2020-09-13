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
import java.util.Scanner;

import edu.jspider.UserDto.servlet.HrDTO;



public class HrDAO 
{
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs= null;
	public boolean InsertHrInfo(HrDTO hrdto)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Drivers installed");
			FileInputStream fin = new FileInputStream("F://Jspider-J@EE//JDBC//Files/db_info1.prop");
			
			Properties prop = new Properties();
			
			prop.load(fin);
			
			String dburl = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pass = prop.getProperty("password");
			
			con = DriverManager.getConnection(dburl, user, pass);
			
			String query = "insert into hr_info values(?, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, hrdto.getEmployee_id());
			pstmt.setString(2, hrdto.getFirst_Name());
			pstmt.setString(3, hrdto.getLast_Name());
			pstmt.setString(4 , hrdto.getDesignation());
			pstmt.setDouble(5, hrdto.getExperience());
			
			int count = pstmt.executeUpdate();
			if(count != 0)
				return true;
			
		} 
		catch (ClassNotFoundException   | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * Method to check whether any record with the passed argument ID exists ir not 
	 */
	
	public void ReadHRDetails(String id)
	{
		try
		{
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
			
			String query = "select * from hr_info where employee_id = ?";
			
			pstmt=con.prepareStatement(query);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			System.out.println("==========================");
			if(rs.next())
			{
				System.out.println("Employee ID : "+rs.getString(1));
				System.out.println("First Name : "+rs.getString(2));
				System.out.println("Last Name : "+rs.getString(3));
				System.out.println("Designation : "+rs.getString(4));
				System.out.println("Work Experince : "+rs.getDouble(5));
			}
			else
				System.out.println("No data with employee_id :"+id+" is present");
			System.out.println("==========================");
		
		}
		catch(ClassNotFoundException  | IOException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Update the HR details
	 */
	
	public boolean UpdateHrDetails(String id,double exp)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers installed");
			
			FileInputStream fin = new FileInputStream("F://Jspider-J@EE//JDBC//Files/db_info1.prop");
			
			Properties prop = new Properties();
			
			prop.load(fin);
			
			String dburl = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pass = prop.getProperty("password");
			
			con = DriverManager.getConnection(dburl, user, pass);
			
			String query = "update hr_info set experience = ? where employee_id = ?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setDouble(1, exp);
			pstmt.setString(2, id);
		
			int count = pstmt.executeUpdate();
			if(count != 0)
				return true;
		}
		
		catch(ClassNotFoundException  | IOException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * Delete a HR record from the table
	 */
	
	public boolean deleteRecord(String sid)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers installed");
			
			FileInputStream fin = new FileInputStream("F://Jspider-J@EE//JDBC//Files/db_info1.prop");
			
			Properties prop = new Properties();
			
			prop.load(fin);
			
			String dburl = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pass = prop.getProperty("password");
			
			con = DriverManager.getConnection(dburl, user, pass);
			
			String query = "delete from hr_info where employee_id = ?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, sid);
			
			int count = pstmt.executeUpdate();
			
			if(count != 0)
				return true;
		}
		catch(ClassNotFoundException  | IOException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public HrDTO ViewHRDetails(String id, HrDTO hrdto)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			
			FileInputStream fin = new FileInputStream("F://Jspider-J@EE//JDBC//Files/db_info1.prop");
			
			Properties prop = new Properties();
			
			prop.load(fin);
			
			String dburl = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pass = prop.getProperty("password");
			
			con = DriverManager.getConnection(dburl, user, pass);
			
			
			
			String query = "select employee_id,first_name,last_name,designation,experience from hr_info where employee_id = ?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			 if(rs.next() == true)
			 {
				 String sid = rs.getString(1);
				 hrdto.setEmployee_id(sid);
				 String fname = rs.getString(2);
				 hrdto.setFirst_Name(fname);
				 
				 String lname = rs.getString(3);
				 hrdto.setLast_Name(lname);
				 String designation = rs.getString(4);
				 hrdto.setDesignation(designation);
				 double exp = rs.getDouble(5);
				 hrdto.setExperience(exp);
			 }
			 else
				 return null;
		}
		catch (ClassNotFoundException  | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			if(rs != null)
			{
				try
				{
					rs.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(pstmt != null)
			{
				try
				{
					pstmt.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}if(con != null)
			{
				try
				{
					con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
		return hrdto;
	}
}
