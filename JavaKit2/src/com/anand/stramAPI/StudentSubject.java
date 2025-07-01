package com.anand.stramAPI;

import java.util.List;

public class StudentSubject {
  private String name;
  private List<Subject> subjets;
public StudentSubject(String name, List<Subject> subjets) {
	this.name = name;
	this.subjets = subjets;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Subject> getSubjets() {
	return subjets;
}
public void setSubjets(List<Subject> subjets) {
	this.subjets = subjets;
}
@Override
public String toString() {
	return "StudentSubject [name=" + name + ", subjets=" + subjets + "]";
}
  
	
}
