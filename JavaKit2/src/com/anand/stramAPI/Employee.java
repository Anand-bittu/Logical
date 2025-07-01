package com.anand.stramAPI;

public class Employee {
	 private int eid;
     private String ename;
     private double salary;
     private String email;
     private String gender;
     
     public Employee(String ename,String email,String gender) {
    	System.out.println("inside Employee");
    	 this.ename=ename;
    	 this.email=email;
    	 this.gender=gender;
     }
     
	public Employee(int eid, String ename, double salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", email=" + email + ", gender=" + gender + "]";
	}

	
}
