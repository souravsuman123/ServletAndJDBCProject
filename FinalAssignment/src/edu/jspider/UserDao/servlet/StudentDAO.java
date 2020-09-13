package edu.jspider.UserDao.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import edu.jspider.UserDto.servlet.StudentDTO;


/**
 * The description of the class is to explain what all are the operations a student DAO class can perform
 * Methods included in this class are the operations we want to perform
 * 
 * @author Sourav
 *
 */
public class StudentDAO 
{
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	/**
	 * This method is used to Insert data into database('student_info')
	 * @param studentdto
	 * @return void
	 */
	public boolean InsertStudentInfo(StudentDTO studentdto)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			FileInputStream fin = new FileInputStream("F://Jspider-J@EE//JDBC//Files/db_info1.prop");
			
			Properties prop = new Properties();
			
			prop.load(fin);
			
			String dburl = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pass = prop.getProperty("password");
			
			con = DriverManager.getConnection(dburl, user, pass);
			
			String query = "insert into student_info value(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, studentdto.getStudent_id());
			pstmt.setString(2, studentdto.getFirst_name());
			pstmt.setString(3, studentdto.getMiddle_name());
			pstmt.setString(4, studentdto.getLast_name());
			pstmt.setLong(5,studentdto.getYop_degree());
			pstmt.setLong(6, studentdto.getYop_masters());
			pstmt.setDouble(7, studentdto.getMarks_tenth());
			pstmt.setDouble(8, studentdto.getMarks_twelth());
			pstmt.setDouble(9, studentdto.getYop_degree());
			pstmt.setDouble(10,studentdto.getYop_masters());
			
			
			int count = pstmt.executeUpdate();
			
			if(count > 0)
				return true;
			
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
	return false;
	}
	
	/**
	 * Fetching the record from the Table using student ID 
	 * @param student_id
	 * @return void
	 */
	
	public StudentDTO getStudentInfo(int id)
	{
		StudentDTO studentDTO = new StudentDTO();
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
			
			
			
			String query = "select * from student_info where student_id = ?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				System.out.println("=========================================");
				System.out.println("Student ID     : "+rs.getInt(1));
				System.out.println("first Name     : "+rs.getString(2));
				System.out.println("Middle Name    : "+rs.getString(3));
				System.out.println("Last Name      : "+rs.getString(4));
				System.out.println("YOP of degree  : "+rs.getInt(5));
				System.out.println("YOP of Masters : "+rs.getInt(6));
				System.out.println("marks in 10th  : "+rs.getDouble(7));
				System.out.println("marks in 12th  : "+rs.getDouble(8));
				System.out.println("marks in deg   : "+rs.getDouble(9));
				System.out.println("marks in mas   : "+rs.getDouble(10));
				System.out.println("=========================================");
			}
			else
			{
				System.out.println("************************************************************************");
			    System.out.println("Sorry :-( no Student with particular student ID is not found on database");
			    System.out.println("************************************************************************");
			}
				
			
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
	  return studentDTO;
	}
	
	/**
	 * Update the student status by Admin of JSPIDERS
	 * @param student_id
	 * @return void
	 */
	
	public boolean UpdateStudentInfo(int Student_id,int yop)
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
			
			
			
			String query = "update student_info set yop_degree = ? where student_id = ?";
			
			pstmt = con.prepareStatement(query);
			
			
			
			pstmt.setInt(1, yop);
			pstmt.setInt(2, Student_id);
			
			int count = pstmt.executeUpdate();
			
			if(count != 0)
				return true;
			
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
		return false;
	}
	
	/**
	 * delete a record from the table based on a Student ID no.
	 * @param student_id
	 * @return void
	 */
	
	public boolean deleteStudentdetails(int id)
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
			
			
			
			String query = "delete from student_info where student_id = ?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, id);
			
		   int count = pstmt.executeUpdate();
		   
		   if(count != 0)
			   return true;
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
		return false;
	}
	
	/**
	 * Tracking the number of interview attended by student based on student ID
	 * @param student_id
	 * @return number of interviews attended by student with id as parameter
	 */
	
	public int TrackInterviewAttended(long id)
	{
		int count = 0;
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
			
			
			
			String query = "select requirements_id,company_name,student_name from added_requirements_data where student_id = ? ";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setLong(1, id);
			
			rs = pstmt.executeQuery();
			
			//System.out.println("Student Name   :"+rs.getString(3));
			while(rs.next())
			{
				System.out.println("Requirement ID : "+rs.getLong(1));
				System.out.println("Company Name   : "+rs.getString(2));
				System.out.println("=========================================");
				count++;
			}
			
			
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
	
		return count;
		
	}
	
	/**
	 * view the student interview Schedule
	 * @param student_id
	 * @return void
	 */
	
	public StudentDTO ViewStudentDetail(int id, StudentDTO stu)
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
			
			
			
			String query = "select student_id,first_name,middle_name,last_name,yop_degree,yop_masters,marks_tenth,marks_twelth,marks_degree,marks_masters from student_info where student_id = ?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setLong(1, id);
			
			rs = pstmt.executeQuery();
			 if(rs.next() == true)
			 {
				 int sid = rs.getInt(1);
				 stu.setStudent_id(sid);
				 String fname = rs.getString(2);
				 stu.setFirst_name(fname);
				 String mname = rs.getString(3);
				 stu.setMiddle_name(mname);
				 String lname = rs.getString(4);
				 stu.setLast_name(lname);
				 long yopd = rs.getLong(5);
				 stu.setYop_degree(yopd);
				 long yopm = rs.getLong(6);
				 stu.setYop_masters(yopm);
				 double tenthmarks = rs.getDouble(7);
				 stu.setMarks_tenth(tenthmarks);
				 double twelthmarks = rs.getDouble(8);
				 stu.setMarks_twelth(twelthmarks);
				 double degreemarks = rs.getDouble(9);
				 stu.setMarks_degree(degreemarks);
				 double mastersmarks = rs.getDouble(10);
				 stu.setMarks_masters(mastersmarks);
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
		return stu;
	}
	
	}
