package kr.or.dgit.mybatis_sample;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_sample.dto.Course;
import kr.or.dgit.mybatis_sample.service.CourseService;

public class CourseServiceTest {
	private static CourseService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new CourseService();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		service = null;
	}

	@Test
	public void test1selectCourseByCondition() {
		GregorianCalendar cal = new GregorianCalendar(2013,1,1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("tutorId", 1);
		map.put("name", "%java%");
		map.put("startDate", cal.getTime());
		
		List<Course> courses = service.selectCourseByCondition(map);
		Assert.assertNotNull(courses);
	}
	
	@Test
	public void test2selectCaseCoureses() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchBy", "Tutor");
		map.put("tutorId", 1);
		
		List<Course> courses = service.selectCaseCoureses(map);
		Assert.assertNotNull(courses);
		
		map.replace("searchBy", "CourseName");
		map.remove("tutorId");
		map.put("name", "%java%");
		courses = service.selectCaseCoureses(map);
		Assert.assertNotNull(courses);
	}
	
	@Test
	public void test3selectWhereCourses() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<Course> courses = service.selectWhereCourses(map);
		Assert.assertNotNull(courses);
		map.put("tutorId", 1);
		courses = service.selectWhereCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("name", "%java%");
		courses = service.selectWhereCourses(map);
		
		map.clear();
		map.put("endDate", new Date());
		courses = service.selectWhereCourses(map);
	}
	
	@Test
	public void test4selectTrimCourses() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<Course> courses = service.selectTrimCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		courses = service.selectTrimCourses(map);
		Assert.assertNotNull(courses);
		
		map.put("tutorId", 1);
		map.put("name", "%java%");
		courses = service.selectTrimCourses(map);
		
		map.clear();
		map.put("endDate", new Date());
		courses = service.selectTrimCourses(map);
	}

}
