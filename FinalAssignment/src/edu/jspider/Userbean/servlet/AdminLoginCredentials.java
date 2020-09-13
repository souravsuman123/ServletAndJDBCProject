package edu.jspider.Userbean.servlet;

public class AdminLoginCredentials {

	private int UserName;
	private String UserPassword;
	
	public int getUserName() {
		return UserName;
	}
	public void setUserName(int userName) {
		UserName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	
	public AdminLoginCredentials(int userName, String userPassword) {
		super();
		UserName = userName;
		UserPassword = userPassword;
	}
	
	public AdminLoginCredentials() {
		super();
	}
	
	
	
}
