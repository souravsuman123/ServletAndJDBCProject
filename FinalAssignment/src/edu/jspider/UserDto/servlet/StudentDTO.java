package edu.jspider.UserDto.servlet;

/**
 * this is the student dto class containing the all the varible 
 * required by this class
 * @author Sourav
 *
 */


public class StudentDTO {
	private int student_id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private long yop_degree;
	private long yop_masters;
	private double marks_tenth;
	private double marks_twelth;
	private double marks_degree;
	private double marks_masters;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getYop_degree() {
		return yop_degree;
	}
	public void setYop_degree(long yop_degree) {
		this.yop_degree = yop_degree;
	}
	public long getYop_masters() {
		return yop_masters;
	}
	public void setYop_masters(long yop_masters) {
		this.yop_masters = yop_masters;
	}
	public double getMarks_tenth() {
		return marks_tenth;
	}
	public void setMarks_tenth(double marks_tenth) {
		this.marks_tenth = marks_tenth;
	}
	public double getMarks_twelth() {
		return marks_twelth;
	}
	public void setMarks_twelth(double marks_twelth) {
		this.marks_twelth = marks_twelth;
	}
	public double getMarks_degree() {
		return marks_degree;
	}
	public void setMarks_degree(double marks_degree) {
		this.marks_degree = marks_degree;
	}
	public double getMarks_masters() {
		return marks_masters;
	}
	public void setMarks_masters(double marks_masters) {
		this.marks_masters = marks_masters;
	}
	
	
	public StudentDTO() {
		//System.out.println(this.getClass().getName()+" object created");
	}
	public StudentDTO(int student_id, String first_name, String middle_name, String last_name, long yop_degree,
			long yop_masters, double marks_tenth, double marks_twelth, double marks_degree, double marks_masters) {
		
		this.student_id = student_id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.yop_degree = yop_degree;
		this.yop_masters = yop_masters;
		this.marks_tenth = marks_tenth;
		this.marks_twelth = marks_twelth;
		this.marks_degree = marks_degree;
		this.marks_masters = marks_masters;
	}
	@Override
	public String toString() {
		return "StudentDTO [student_id=" + student_id + ", first_name=" + first_name + ", middle_name=" + middle_name
				+ ", last_name=" + last_name + ", yop_degree=" + yop_degree + ", yop_masters=" + yop_masters
				+ ", marks_tenth=" + marks_tenth + ", marks_twelth=" + marks_twelth + ", marks_degree=" + marks_degree
				+ ", marks_masters=" + marks_masters + "]";
	}
	
	
}
