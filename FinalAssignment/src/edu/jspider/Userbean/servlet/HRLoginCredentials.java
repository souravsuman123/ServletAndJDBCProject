package edu.jspider.Userbean.servlet;

public class HRLoginCredentials {

	private String UserName;
	private String pwd;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public HRLoginCredentials(String userName, String pwd) {
		super();
		UserName = userName;
		this.pwd = pwd;
	}
	public HRLoginCredentials() {
		super();
	}
	
	
}
