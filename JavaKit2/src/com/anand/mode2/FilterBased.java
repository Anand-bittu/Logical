package com.anand.mode2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterBased {

	public static void main(String[] args) {

		   //finding even number
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		List<Integer> list2=Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
		//finding the max value in list of intergers
		System.out.println("max Values");
	  // Optional<Integer> op=list2.stream().max((x1,x2)->x1.compareTo(x2));
		Optional<Integer> op=list2.stream().max(Integer::compareTo);
	   System.out.println(op);
	   //finding the longest words
	   List<String> w=Arrays.asList("apple","banana", "kiwi", "orange");
	Optional<String> maxW=w.stream().max(Comparator.comparingInt(String::length));
	   System.out.println(maxW);
	   //list of name in upperCase
	   List<String> name=Arrays.asList("Alice","Bob","Chariles");
	   System.out.println("UpperCase");
	   name.stream().map(n->n.toUpperCase()).forEach(System.out::println);
	   //Sort Method
	  List<Integer> sort= list2.stream().sorted().collect(Collectors.toList());
	  System.out.println("natural Oder-->"+sort);
	  System.out.println("decesding Order\n");
	  List<Integer> sortD=list2.stream().sorted((x1,x2)->x2.compareTo(x1)).toList();
	  System.out.println(sortD);
	  
	
	
	   
	}

}
