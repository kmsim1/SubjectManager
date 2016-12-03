package kr.ac.hansung.web.gyumin.subjectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.web.gyumin.subjectmanager.dao.RegisterDAO;
import kr.ac.hansung.web.gyumin.subjectmanager.model.Course;
import kr.ac.hansung.web.gyumin.subjectmanager.model.Register;

@Service
public class RegisterService {
	@Autowired
	private RegisterDAO registerDAO;
 
	//수강신청 결과 조회
	public List<Register> getRegisterList() {
		return registerDAO.getRegisterList();
	}
	
	public void insert(Register register) {
		registerDAO.insert(register);
	}
}
