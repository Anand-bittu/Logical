package com.anand.stramAPI;

public class Subject {

	private String subjectName;
	private Integer subjectMarks;
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public Subject(String subjectName, Integer subjectMarks) {
		this.subjectName = subjectName;
		this.subjectMarks = subjectMarks;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getSubjectMarks() {
		return subjectMarks;
	}

	public void setSubjectMarks(Integer subjectMarks) {
		this.subjectMarks = subjectMarks;
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", subjectMarks=" + subjectMarks + "]";
	}
	
	
}
