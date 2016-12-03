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
	
	//학기별 이수학점 조회
	public List<Course> getGroupBy_Year_Semester(){
		return courseDAO.getGroupBy_Year_Semester();
	}
	
	//이수구분별 이수학점 조회
	public List<Course> getGroupBy_Type() {
		return courseDAO.getGroupBy_Type();
	}
	
	//해당 년도,학기 별 이수과목명 조회
	public List<Course> getYearSemester_Detail(int course_year, String course_semester) {
		return courseDAO.getYearSemester_Detail(course_year, course_semester);
	}
}
