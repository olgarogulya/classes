package by.epam.training.testsystem;

import java.util.ArrayList;
import java.util.List;

public class TestingSystem {
	
	private int dayOfMonth;
	private List< Student > students = new ArrayList< Student >();
	private List< Question > questions = new ArrayList< Question >();
	private List< Answer > answers = new ArrayList< Answer >();
	
	public int getDayOfMonth() {
		return dayOfMonth;
	}
	
	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	public List<Answer> getAnswers() {
		return answers;
	}
	
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
}
