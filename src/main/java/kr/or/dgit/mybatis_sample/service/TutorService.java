package kr.or.dgit.mybatis_sample.service;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_sample.dao.TutorDao;
import kr.or.dgit.mybatis_sample.dto.Tutor;
import kr.or.dgit.mybatis_sample.util.MybatisSqlSessionFactory;

public class TutorService {
	private static final Log log = LogFactory.getLog(TutorService.class);
//	private String namespace ="kr.or.dgit.mybatis_sample.dao.TutorDao";
	
/*	public Tutor selectTutorById(int tutorId) {
		log.debug("selectTutorById()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			TutorDao tutortDao = sqlSession.getMapper(TutorDao.class);
			return tutortDao.selectTutorById(tutorId);
		}
	}*/
	
	public Tutor selectTutorByTutorId(Tutor tutor) {
		log.debug("selectTutorByTutorId()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession();) {
			TutorDao tutortDao = sqlSession.getMapper(TutorDao.class);
			return tutortDao.selectTutorByTutorId(tutor);
		}
	}
}
