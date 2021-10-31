package by.epam.training.languagecourses;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {

	private int dayOfMonth;
	private String homeTask;
	private int examMark;
	private List< Student > students = new ArrayList< Student >();
	private List< Teacher > teachers = new ArrayList< Teacher >();
	private List< Language > languages = new ArrayList< Language >();
	
	public int getDayOfMonth() {
		return dayOfMonth;
	}
	
	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	
	public String getHomeTask() {
		return homeTask;
	}
	
	public void setHomeTask(String homeTask) {
		this.homeTask = homeTask;
	}
	
	public int getExamMark() {
		return examMark;
	}
	
	public void setExamMark(int examMark) {
		this.examMark = examMark;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	public List<Language> getLanguages() {
		return languages;
	}
	
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

}
