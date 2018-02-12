package kr.or.dgit.mybatis_sample.dto;

import java.util.Date;

import kr.or.dgit.mybatis_sample.dto.PhoneNumber;

public class Student {
	private int studId;
	private String name;
	private String email;
	private PhoneNumber phone;
	private Date dob;

	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studId) {
		this.studId = studId;
	}

	public Student(int studId, String name, String email, PhoneNumber phone, Date dob) {
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PhoneNumber getPhone() {
		return phone;
	}

	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return String.format("Student [%s, %s, %s, %s, %s]", studId, name, email, dob, phone);
	}

}
