package kr.or.dgit.mybatis_sample.dao;

import kr.or.dgit.mybatis_sample.dto.Tutor;

public interface TutorDao {
	//Tutor selectTutorById(int tutorId);
	Tutor selectTutorByTutorId(Tutor tutor);
}
