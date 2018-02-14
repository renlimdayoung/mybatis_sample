package kr.or.dgit.mybatis_sample.dao;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_sample.dto.Student;

public interface StudentDao {
	//select
	Student selectStudentByNo(Student student);
	List<Student> selectStudentByAll();
	
	List<Student> selectStudentByAllForResultMap();
	List<Map<String, Object>> selectStudentByAllForHashMap();
	
	Student selectStudentByNoForResultMapExtends(Student student);
	
	Student selectStudentByNoAssociation(Student student);
	
	//insert
	int insertStudent(Student student);
	//update
	int updateStudent(Student studeent);
	//delete
	int deleteStudent(int studId);
	
	//enum 타입 다루기
	int insertEnumStudent(Student student);
	int insertEnumStudentWithAPI(Student student);
	
	//여러개의 입력 파라미터 전달
	Student selectAllStudentByParam(String name, String email);
	Student selectAllStudentByStudent(Student student);
	Student selectAllStudentByMap(Map<String, String> map);
}
