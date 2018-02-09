package kr.or.dgit.mybatis_sample.dto;

import java.util.Date;

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
		super();
		this.studId = studId;
	}

	public Student(int studId, String name, String email, PhoneNumber phone, Date dob) {
		super();
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return String.format("Student [%s, %s, %s, %s, %s]", studId, name, email, phone, dob);
	}

}
