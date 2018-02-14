package kr.or.dgit.mybatis_sample.service;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_sample.dao.AddressDao;
import kr.or.dgit.mybatis_sample.dto.Address;
import kr.or.dgit.mybatis_sample.util.MybatisSqlSessionFactory;

public class AddressService {
	private static final Log log = LogFactory.getLog(AddressService.class);
	
	public List<Address> selectAddressByAll(RowBounds rowBounds){
		log.debug("selectAddressByAll()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			AddressDao addressDao = sqlSession.getMapper(AddressDao.class);
			return addressDao.selectAddressByAll(rowBounds);
		}
	}
	
	public List<Address> selectAddressByAllWithAPI(RowBounds rowBounds){
		log.debug("selectAddressByAllWithAPI()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			AddressDao addressDao = sqlSession.getMapper(AddressDao.class);
			return addressDao.selectAddressByAllWithAPI(rowBounds);
		}
	}

}
