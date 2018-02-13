package kr.or.dgit.mybatis_sample.dto;

import java.util.List;

public class Tutor {
	private int tutorId;
	private String name;
	private String email;
	private Address address;
	private List<Course> courses;

	public Tutor() {
		// TODO Auto-generated constructor stub
	}

	public Tutor(int tutorId, String name, String email, Address address, List<Course> courses) {
		super();
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return String.format("Tutor [tutorId=%s, name=%s, email=%s, address=%s, courses=%s]", tutorId, name, email,
				address, courses);
	}

}
