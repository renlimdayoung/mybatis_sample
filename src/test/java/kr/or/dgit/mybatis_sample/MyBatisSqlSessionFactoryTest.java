package kr.or.dgit.mybatis_sample;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_sample.util.MybatisSqlSessionFactory;

public class MyBatisSqlSessionFactoryTest {
	private static SqlSessionFactory factory;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = MybatisSqlSessionFactory.getSqlSessionFactory();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		factory = null;
	}

	@Test
	public void test() {
		Assert.assertNotNull(factory);
	}

}
