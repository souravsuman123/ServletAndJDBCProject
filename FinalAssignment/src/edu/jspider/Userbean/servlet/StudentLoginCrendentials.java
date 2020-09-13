package edu.jspider.Userbean.servlet;

public class StudentLoginCrendentials {

	private String username;
	private String pwd;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public StudentLoginCrendentials(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	public StudentLoginCrendentials() {
		super();
	}
	
	
	
}
