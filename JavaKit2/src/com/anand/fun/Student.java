package com.anand.fun;

public class Student {

	private Integer sid;
	private String sname;
	private double salary;
	public Student(Integer sid, String sname,double salary) {
		this.sid = sid;
		this.sname = sname;
		this.salary=salary;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", salary=" + salary + "]";
	}
	
}
