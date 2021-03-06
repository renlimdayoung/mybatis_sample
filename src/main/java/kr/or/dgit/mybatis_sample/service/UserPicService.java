package kr.or.dgit.mybatis_sample.service;

import java.util.concurrent.ExecutionException;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_sample.dao.UserPicDao;
import kr.or.dgit.mybatis_sample.dto.UserPic;
import kr.or.dgit.mybatis_sample.util.MybatisSqlSessionFactory;

public class UserPicService {
	private static final Log log = LogFactory.getLog(UserPicService.class);	
	private String namespace ="kr.or.dgit.mybatis_sample.dao.UserPicDao";

	public int insertUserPic(UserPic userPic) {
		log.debug("insertUserPic()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			UserPicDao userPicDao = sqlSession.getMapper(UserPicDao.class);
			int res = userPicDao.insertUserPic(userPic);
			sqlSession.commit();
			return res;
		}
	}
	
	public UserPic getUserPic(int id) {
		log.debug("getUserPic()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			UserPicDao userPicDao = sqlSession.getMapper(UserPicDao.class);
			UserPic res = userPicDao.getUserPic(id);
			sqlSession.commit();
			return res;
		}
	}
	
	
}
