package kr.or.dgit.mybatis_sample;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_sample.dto.UserPic;
import kr.or.dgit.mybatis_sample.service.UserPicService;

public class UserPicServiceTest {
	private static UserPicService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new UserPicService();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		service = null;
	}

/*	@Test
	public void test1insertUserPic() {
		UserPic userPic = new UserPic("hanjimin", "put some lengthy bio here", getPicFile());
		
		int result = UserPicService.insertUserPic(userPic);
	}*/

}
