package kr.or.dgit.mybatis_sample.dto;

import java.util.Date;

public class Course {
	private int courseId;
	private String name;
	private String descriptrion;
	private Date startDate;
	private Date endDate;
	private int tutorId;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int courseId, String name, String descriptrion, Date startDate, Date endDate, int tutorId) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.descriptrion = descriptrion;
		this.startDate = startDate;
		this.endDate = endDate;
		this.tutorId = tutorId;
	}

	@Override
	public String toString() {
		return String.format("Course [courseId=%s, name=%s, descriptrion=%s, startDate=%s, endDate=%s, tutorId=%s]",
				courseId, name, descriptrion, startDate, endDate, tutorId);
	}

}
