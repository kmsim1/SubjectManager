package kr.ac.hansung.web.gyumin.subjectmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.web.gyumin.subjectmanager.dao.CourseDAO;
import kr.ac.hansung.web.gyumin.subjectmanager.model.Course;

@Service
public class CourseService {
	@Autowired
	private CourseDAO courseDAO;
	
	//�б⺰ �̼����� ��ȸ
	public List<Course> getGroupBy_Year_Semester(){
		return courseDAO.getGroupBy_Year_Semester();
	}
	
	//�̼����к� �̼����� ��ȸ
	public List<Course> getGroupBy_Type() {
		return courseDAO.getGroupBy_Type();
	}
	
	//�ش� �⵵,�б� �� �̼������ ��ȸ
	public List<Course> getYearSemester_Detail(int course_year, String course_semester) {
		return courseDAO.getYearSemester_Detail(course_year, course_semester);
	}
}
