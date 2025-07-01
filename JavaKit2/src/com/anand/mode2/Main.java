package com.anand.mode2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
       List<Student> ls=new ArrayList<>();
       ls.add(new Student(2,"Rani",45));
       ls.add(new Student(1,"Main", 36));
       ls.add(new Student(8,"kaja",98));
       ls.add(new Student(7, "vani",92));
       //display  students age in decessding order
     List<Student> st=  ls.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
	       
	System.out.println(st);
	}

}
