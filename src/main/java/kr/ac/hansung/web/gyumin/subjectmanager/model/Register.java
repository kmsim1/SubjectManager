package kr.ac.hansung.web.gyumin.subjectmanager.model;

public class Register {
	private String course_code;
	private String course_name;
	private String course_type;
	private int course_point;

	public String getCourse_code() {
		return course_code;
	}

	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_type() {
		return course_type;
	}

	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}

	public int getCourse_point() {
		return course_point;
	}

	public void setCourse_point(int course_point) {
		this.course_point = course_point;
	}

	@Override
	public String toString() {
		return "CourseDTO [course_code=" + course_code + ", course_name=" + course_name + ", course_type=" + course_type
				+ ", course_point=" + course_point + "]";
	}

}
