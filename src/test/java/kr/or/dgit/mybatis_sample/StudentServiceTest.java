package kr.or.dgit.mybatis_sample;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_sample.dao.Gender;
import kr.or.dgit.mybatis_sample.dto.PhoneNumber;
import kr.or.dgit.mybatis_sample.dto.Student;
import kr.or.dgit.mybatis_sample.service.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
private static StudentService service;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
	}

	@Test
	public void test1FindStudentByNo() {
		Student student = service.findStudentByNo(new Student(1));
		Assert.assertNotNull(student);
	}

	@Test
	public void test2FindStudentByAll() {
		List<Student> listStd = service.findStudentByAll();
		Assert.assertNotNull(listStd);
		for(Student std : listStd) {
			System.out.println(std);
		}
	}
	
	@Test
	public void test3CreateStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
        newDate.set(1990, 2, 28);

        Student student = new Student(3, "홍길동3", "lee@test.co.kr", new PhoneNumber("010-1234-1234"), newDate.getTime());
        int res = service.createStudent(student);
        Assert.assertEquals(1, res);
	}
	
	@Test
	public void test4UpdateStudent() {
		Student student = new Student();
        student.setStudId(1);
        student.setName("Timothy");
        student.setEmail("test@test.co.kr");
        student.setPhone(new PhoneNumber("987-654-3211"));
        student.setDob(new Date());
        
        int result = service.updateStudent(student);
        Assert.assertSame(1, result);
                
        student.setEmail("timothy@gmail.com");
        student.setPhone(new PhoneNumber("123-123-1234"));
        student.setDob(new GregorianCalendar(1988, 04, 25).getTime());
        result = service.updateStudent(student);
        Assert.assertSame(1, result);
	}
	
	@Test
	public void test5DeleteStudent() {
        int deleteStudent = service.deleteStudent(3);
        Assert.assertSame(1, deleteStudent);
	}
	
	@Test
	public void test6SelectStudentByAllForResultMap() {
		List<Student> lists = service.selectStudentByAllForResultMap();
		List<Student> lists2 = service.findStudentByAll();
		
		Assert.assertSame(lists.size(), lists2.size());
	}
	
	@Test
	public void test7SelectStudentByAllForHashMap() {
		List<Map<String, Object>> listMaps = service.selectStudentByAllForHashMap();
		List<Student> lists2 = service.findStudentByAll();
		
		Assert.assertSame(listMaps.size(), lists2.size());
		
		for(Map<String, Object> map : listMaps) {
			for(Entry<String, Object> e:  map.entrySet()) {
				System.out.printf("key %s => value %s %n", e.getKey(), e.getValue());
			}
		}
	}
	
	@Test
	public void test8SelectStudentByNoForResultMapExtends() {
		Student searchStd = new Student(1);
		Student student = service.selectStudentByNoForResultMapExtends(searchStd);
		Assert.assertNotNull(student);
		System.out.println(student);
	}
	
	@Test
	public void test9SelectStudentByNoAssociation() {
		Student searchStd = new Student(1);
		Student student = service.selectStudentByNoAssociation(searchStd);
		Assert.assertNotNull(student);
		System.out.println(student);
	}
	
	@Test
	public void testFinsertEnumStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
        newDate.set(1990, 2, 28);

        Student student = new Student(3, "홍길동3", "lee@test.co.kr", new PhoneNumber("010-1234-1234"), newDate.getTime());
        student.setGender(Gender.FEMALE);
        int res = service.insertEnumStudent(student);
        Assert.assertEquals(1, res);
        
        test5DeleteStudent();
	}
	
	@Test
	public void test10selectAllStudentByParam() {
		Student student = service.selectAllStudentByParam("Timothy", "timothy@gmail.com");
		Assert.assertNotNull(student);
	}

	@Test
	public void test11selectAllStudentByStudent() {
		Student std = new Student();
		std.setName("Timothy");
		std.setEmail("timothy@gmail.com");
		Student student = service.selectAllStudentByStudent(std);
		Assert.assertNotNull(student);
	}
	
	/*@Test
	public void test12selectAllStudentByMap() {
		Map<String,String> maps =  new HashMap<>();
		maps.put("name", "Timothy");
		maps.put("email", "timothy@gmail.com");
		Student student = service.selectAllStudentByMap(maps);
		Assert.assertNotNull(student);
	}*/
	
	
	
}
