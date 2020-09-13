package edu.jspider.UserDto.servlet;

public class RequirementsDTO {
	private long requirement_id;
	private String company_name;
	private String type;
	private String job_title;
	private String designation;
	private String job_location;
	private String skills_required;
	private double salary_package;
	private String bond_period;
	private double tenth_percent_req;
	private double twelth_percent_req;
	private double degree_percent_req;
	private double masters_percent_req;
	private String Branch;
	
	public long getRequirement_id() {
		return requirement_id;
	}
	public void setRequirement_id(long requirement_id) {
		this.requirement_id = requirement_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getJob_location() {
		return job_location;
	}
	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}
	public String getSkills_required() {
		return skills_required;
	}
	public void setSkills_required(String skills_required) {
		this.skills_required = skills_required;
	}
	public double getSalary_package() {
		return salary_package;
	}
	public void setSalary_package(double salary_package) {
		this.salary_package = salary_package;
	}
	public String getBond_period() {
		return bond_period;
	}
	public void setBond_period(String bond_period) {
		this.bond_period = bond_period;
	}
	public double getTenth_percent_req() {
		return tenth_percent_req;
	}
	public void setTenth_percent_req(double tenth_percent_req) {
		this.tenth_percent_req = tenth_percent_req;
	}
	public double getTwelth_percent_req() {
		return twelth_percent_req;
	}
	public void setTwelth_percent_req(double twelth_percent_req) {
		this.twelth_percent_req = twelth_percent_req;
	}
	public double getDegree_percent_req() {
		return degree_percent_req;
	}
	public void setDegree_percent_req(double degree_percent_req) {
		this.degree_percent_req = degree_percent_req;
	}
	public double getMasters_percent_req() {
		return masters_percent_req;
	}
	public void setMasters_percent_req(double masters_percent_req) {
		this.masters_percent_req = masters_percent_req;
	}
	
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	
	public RequirementsDTO() {
		
	}
	public RequirementsDTO(long requirement_id, String company_name, String type, String job_title, String designation,
			String job_location, String skills_required, double salary_package, String bond_period,
			double tenth_percent_req, double twelth_percent_req, double degree_percent_req,
			double masters_percent_req) {
	
		this.requirement_id = requirement_id;
		this.company_name = company_name;
		this.type = type;
		this.job_title = job_title;
		this.designation = designation;
		this.job_location = job_location;
		this.skills_required = skills_required;
		this.salary_package = salary_package;
		this.bond_period = bond_period;
		this.tenth_percent_req = tenth_percent_req;
		this.twelth_percent_req = twelth_percent_req;
		this.degree_percent_req = degree_percent_req;
		this.masters_percent_req = masters_percent_req;
	}
	@Override
	public String toString() {
		return "RequirementsDTO [requirement_id=" + requirement_id + ", company_name=" + company_name + ", type=" + type
				+ ", job_title=" + job_title + ", designation=" + designation + ", job_location=" + job_location
				+ ", skills_required=" + skills_required + ", salary_package=" + salary_package + ", bond_period="
				+ bond_period + ", tenth_percent_req=" + tenth_percent_req + ", twelth_percent_req="
				+ twelth_percent_req + ", degree_percent_req=" + degree_percent_req + ", masters_percent_req="
				+ masters_percent_req + "]";
	}
	
	
	
	
}
