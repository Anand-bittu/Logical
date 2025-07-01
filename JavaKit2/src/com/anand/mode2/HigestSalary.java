package com.anand.mode2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class HigestSalary {

	private int sid;
	   private String sname;
	   private int age;
	   private double salary;
		
		public HigestSalary(int sid, String sname, int age, double salary) {
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.salary = salary;
	}
		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "HigestSalary [sid=" + sid + ", sname=" + sname + ", age=" + age + ", salary=" + salary + "]";
		}
		public static void main(String[] args) {
	     List<HigestSalary> result=new ArrayList();
	     result.add(new HigestSalary(101, "bittu",45,20000));
	     result.add(new HigestSalary(102,"rani",53,30000));
	     result.add(new HigestSalary(103,"utave",35,900000));
	     result.add(new HigestSalary(104, "bmuu",85,150000));
	    
		Optional<HigestSalary>  fi=result.stream().max(Comparator.comparingDouble(e->e.getSalary()));	
			System.out.println(fi);
			
		}

}
