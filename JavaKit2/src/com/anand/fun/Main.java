package com.anand.fun;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		System.out.println("inside Main method:::");
		Function<Integer,Integer> value= a->a/2;
		int result=    value.apply(10);
		System.out.println(result);
		
		//req : Given String should be converted into UpperCase
		Function<String,String> value1=i->i.toUpperCase();
	  String result2=value1.apply("bittu");
	     System.out.println(result2);
		List<Student> ls=Arrays.asList(new Student(101, "Anand", 5000)
				,new Student(102,"Bittu", 9000)
				,new Student(103, "Rani", 7000));
		List<Student> endResult=ls.stream().filter(n->n.getSalary()>5000).toList();
		System.out.println(endResult);
		System.out.println();
		System.out.println("--------------");
		Predicate<Integer> predicate=age->age>25;
		  System.out.println(predicate.test(10));
		
		List<String> names=List.of("abc","xyz","mno");
		Consumer<String> endResult3=n->n.toUpperCase();
	//	endResult3.accept(names);
		
	}
}
