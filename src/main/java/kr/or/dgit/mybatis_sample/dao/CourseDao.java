package kr.or.dgit.mybatis_sample.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_sample.dto.Course;

public interface CourseDao {
	List<Course> selectCourseByCondition(Map<String, Object> map);
	List<Course> selectCaseCoureses(Map<String, Object> map);
	List<Course> selectWhereCourses(Map<String, Object> map);
	List<Course> selectTrimCourses(Map<String, Object> map);
}
