package edu.jspider.UserDto.servlet;

public class Added_RequiremenstDTO {
	private long added_id;
	private long student_id;
	private String student_name;
	private long requiremnent_id;
	private String company_name;
	public long getAdded_id() {
		return added_id;
	}
	public void setAdded_id(long added_id) {
		this.added_id = added_id;
	}
	public long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public long getRequiremnent_id() {
		return requiremnent_id;
	}
	public void setRequiremnent_id(long requiremnent_id) {
		this.requiremnent_id = requiremnent_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public Added_RequiremenstDTO() {
		//System.out.println(this.getClass().getName()+" object is created");
	}
	public Added_RequiremenstDTO(long added_id, long student_id, String student_name, long requiremnent_id,
			String company_name) {
		super();
		this.added_id = added_id;
		this.student_id = student_id;
		this.student_name = student_name;
		this.requiremnent_id = requiremnent_id;
		this.company_name = company_name;
	}
	@Override
	public String toString() {
		return "Added_RequiremenstDTO [added_id=" + added_id + ", student_id=" + student_id + ", student_name="
				+ student_name + ", requiremnent_id=" + requiremnent_id + ", company_name=" + company_name + "]";
	}
	
	
	
	
}
