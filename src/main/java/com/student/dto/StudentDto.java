package com.student.dto;

public class StudentDto {
	private int stuId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNo;

	public StudentDto(int stuId, String firstName, String lastName, String email, String mobileNo) {
		super();
		this.stuId = stuId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
	}

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "StudentDto [stuId=" + stuId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNo=" + mobileNo + "]";
	}

}
