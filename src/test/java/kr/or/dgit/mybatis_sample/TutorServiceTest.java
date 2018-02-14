package kr.or.dgit.mybatis_sample;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_sample.dto.Tutor;
import kr.or.dgit.mybatis_sample.service.TutorService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TutorServiceTest {
	private static TutorService tutorService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tutorService = new TutorService();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		tutorService = null;
	}

	@Test
	public void test1FindTutor() {
		
		Tutor findTutor = new Tutor();
		findTutor.setTutorId(1);
		Tutor tutor2 = tutorService.selectTutorByTutorId(findTutor);
		Assert.assertEquals(findTutor.getTutorId(), tutor2.getTutorId());
	}

}
