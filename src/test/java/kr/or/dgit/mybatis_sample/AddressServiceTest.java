package kr.or.dgit.mybatis_sample;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import kr.or.dgit.mybatis_sample.dto.Address;
import kr.or.dgit.mybatis_sample.service.AddressService;

public class AddressServiceTest {
	private static AddressService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = new AddressService();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		service = null;
	}

	@Test
	public void test1selectAddressByAll() {
		RowBounds rowBounds = new RowBounds(0,3);
		List<Address> lists = service.selectAddressByAll(rowBounds);
		Assert.assertNotNull(lists);
	}

	@Test
	public void test2selectAddressByAllWithAPI() {
		RowBounds rowBounds = new RowBounds(0,3);
		List<Address> lists = service.selectAddressByAllWithAPI(rowBounds);
		Assert.assertNotNull(lists);
	}
}
