package edu.jspider.UserDto.servlet;
 /**
  * 
  * This is HrDto class which includes all the variables and the 
  * @author Sourav
  *
  */
public class HrDTO {
	private String employee_id;
	private String first_Name;
	private String last_Name;
	private String designation;
	private double experience;
	
	/**
	 * Getters and Setters of all the private variables of HrDTO class
	 * @return
	 */
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	
	/**
	 * Default constructor and parameterized constructor
	 */
	
	public HrDTO() {
		//System.out.println(this.getClass().getName() + " Object Created");
	}
	public HrDTO(String employee_id, String first_Name, String last_Name, String designation, double experience) {
		
		this.employee_id = employee_id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.designation = designation;
		this.experience = experience;
	}
	
	
	/**
	 * toString method overrided
	 */
	
	@Override
	public String toString() {
		return "HrDTO [employee_id=" + employee_id + ", first_Name=" + first_Name + ", last_Name=" + last_Name
				+ ", designation=" + designation + ", experience=" + experience + "]";
	}
	
}
