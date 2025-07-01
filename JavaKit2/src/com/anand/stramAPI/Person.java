package com.anand.stramAPI;

public class Person {

	private String name;
	private int phone;
	private int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public Person(String name, int phone,int age) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}



	
}
