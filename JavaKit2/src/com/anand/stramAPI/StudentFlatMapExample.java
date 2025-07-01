package com.anand.stramAPI;

import java.util.List;

public class StudentFlatMapExample {

	 private String name;
	 private List<String> coureses;
	public StudentFlatMapExample(String name, List<String> coureses) {
		this.name = name;
		this.coureses = coureses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCoureses() {
		return coureses;
	}
	public void setCoureses(List<String> coureses) {
		this.coureses = coureses;
	}
	@Override
	public String toString() {
		return "StudentFlatMapExample [name=" + name + ", coureses=" + coureses + "]";
	}
	 
	 
	
}
