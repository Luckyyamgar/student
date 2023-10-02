package com.student.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "school")
public class Student implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stuId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNo;

	public Student() {
		super();
	}

	public Student(int stuId, String firstName, String lastName, String email, String mobileNo) {
		super();
		this.stuId = stuId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;

	}

	public int getstuId() {
		return stuId;
	}

	public void setstuId(int stuId) {
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
		return "Student [id=" + stuId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNo=" + mobileNo + "]";
	}

}
