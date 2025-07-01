package com.anand.stramAPI;

import java.util.*;
import java.util.stream.Collectors;
public class Basic {

	
	public static void main(String[] args) {
		//filter
		List<Integer> values=Arrays.asList(1,2,3,4,5);
		List<Integer> result=values.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(result);
		//Basic of Map()
	    List<Integer>  mapResult=   values.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(mapResult);
		List<String> words=Arrays.asList("apple","banana","grapes");
	List<String> wordsResult=	words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(wordsResult);
		List<Person> person=Arrays.asList(new Person("anand",101),new Person("Rani",103),
				new Person("Latha",108));
		//print person name
		person.stream().map(Person::getName).collect(Collectors.toList()).forEach(System.out::print);
	  
		System.out.println("-------------------");
		
		//FlatMap Stream API
		  // 1
		List<List<String>> flat=Arrays.asList(Arrays.asList("apple","banana","Grapes")
				,Arrays.asList("HYD","MUMBAI","NODIA"),Arrays.asList("TAA","Rani"));
		
		   List<String> faltResult=flat.stream().flatMap(m->m.stream()).
				   collect(Collectors.toList());
		   System.out.println(faltResult);
		//2
		List<List<Integer>> falt2=Arrays.asList(Arrays.asList(1,2,3)
				,Arrays.asList(4,5,6),Arrays.asList(7,8,9));
		List<Integer> faltResult2=falt2.stream().flatMap(n->n.stream()).
				collect(Collectors.toList());
		System.out.println(faltResult2);
		System.out.println("-----------------------------");
		//3
		List<String> falt3=Arrays.asList("hello this is anand","how are you","hope you are doing greate");
		List<String> faltResult3=falt3.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(faltResult3);
		//4
		List<String> falt4=Arrays.asList("hello this is anand","how are you","hope you are doing greate");
		List<String> faltResult4=falt4.stream().flatMap(n->Arrays.stream(n.split("\\s+"))).collect(Collectors.toList());
		 System.out.println(faltResult4);
		 
		 //5 student Map printing only skills
		 
			/*
			 * List<StudentFlatMapExample> st=Arrays.asList(new
			 * StudentFlatMapExample("Anand", Arrays.asList("Java","Python","spring") ,new
			 * StudentFlatMapExample("Rani",Arrays.asList("Core Java","Advance Java"), new
			 * StudentFlatMapExample("Lath",Arrays.asList("Core Spring","SpringBoot")))));
			 * 
			 * 
			 */
		 System.out.println("----------------------");
		 
		 List<String> c1=new ArrayList<>();
		 c1.add("Java");c1.add("Python");c1.add("spring");
		 List<String> c2=new ArrayList<>();
		 c2.add("Core Java");c2.add("Advance Java");
		 List<String> c3=new ArrayList<>();
		 c3.add("Core Spring");c3.add("SpringBoot");
		 List<String> c4=new ArrayList<>();
		 c4.add("Core Spring");c4.add("Spring Boot");
		 List<StudentFlatMapExample> st=Arrays.asList(new StudentFlatMapExample("Anand", c1),new StudentFlatMapExample("Latha", c2)
				 ,new StudentFlatMapExample("Rani", c3));
		List<String> faltResult5= st.stream().flatMap(n->n.getCoureses().stream()).collect(Collectors.toList());
		 System.out.println(faltResult5);
		 
		 System.out.println("---------------------6----------");
		 
		 //changeing colour by Map
		 List<BoxFaltMapExample> falt6=Arrays.asList(new BoxFaltMapExample("Red", "A",Arrays.asList("apple","banan")),
				 new BoxFaltMapExample("Voilate","B",Arrays.asList("Vani","Rani")));
		List<BoxFaltMapExample> faltResult6=falt6.stream().map(box->box.ChageBoxColour("Yello")).collect(Collectors.toList());
		 System.out.println(faltResult6);
		 //printing all Iteams in the Stream
	List<String> faltResult7=falt6.stream().flatMap(box->box.getIteams().stream()).collect(Collectors.toList());
	System.out.println(faltResult7);
		 
	}
}
