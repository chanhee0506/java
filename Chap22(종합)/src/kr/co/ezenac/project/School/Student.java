package kr.co.ezenac.project.School;

import java.util.ArrayList;

public class Student {
	
	private String studentName;								//이름
	private int studentId;									//학번
	private Subject majorSubject;							//전공
	private ArrayList<Score> scores	= new ArrayList<>();	//성적		
	
	public Student(String studentName, int studentId, Subject majorSubject) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.majorSubject = majorSubject;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public void addSubjectScore(Score score) {
		scores.add(score);
	}
	
	public ArrayList<Score> getScores(){
		return scores;
	}
}
