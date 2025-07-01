package com.anand.stramAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class ExampleMain {
	public static void FilterProgram1() {
		//Sum of Even number that is Greating then 5
		List<Integer> values=Arrays.asList(1, 2, 6, 3, 8, 4, 9, 10);
        int  result=
		 values.stream().
		 filter(n->n%2==0).filter(n->n>=5)
		 .mapToInt(Integer::intValue).sum();
      System.out.println(result);
	}
	public static void FilterProgram2() {
		// Filter words starting with 'a' (case-sensitive)	
		List<String> words=Arrays.asList("apple", "banana", "apricot", "grape", "avocado");     
	List<String> result=	words.stream().filter(word->word.startsWith("a")).toList();
	   System.out.println(result);  
	}
	public static void FilterProgram3() {
		List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 20),
                new Person("David", 25)
        );
		 // Filter people older than 25
	List<Person> result=	people.stream()
		.filter(persons->persons.getAge()>25).toList();
	    System.out.println(result);
	}
	public static void  mapProgram4() {
		//Transforming Integers to Squares:Java
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> result=numbers.stream().map(n->n*n).collect(Collectors.toList());
			System.out.println(result);
	}
	public static void mapProgram5() {
		//Convert this into Integer
		List<String> values=Arrays.asList("1","2","3");
	List<Integer> result=
			values.stream().map(Integer::parseInt).collect(Collectors.toList());
	System.out.println(result);
	}
	public static void mapProgram6() {
		//Question: 
		//	Given a List<String> of names, 
		//	use the Streams API to create a new List<Integer> 
		//containing the length of each name.
		List<String> values=Arrays.asList("Anand","Raj","Venkatesh");
	List<Integer> result=values.stream().map(n->n.length()).collect(Collectors.toList());
		System.out.println(result);
	}
	public static void mapProgram7() {
		//print only name Of the Person
				List<Person> person=Arrays.asList(
						new Person("Anand",45),
						new Person("Raj",87),
						new Person("Vani",72));
		List<String> name=person.stream().map(n->n.getName()).collect(Collectors.toList());
				System.out.println(name);				
	}
	//convert the words into UpperCase
	public static void mapProgram8() {
		//Given a List<String> of words, 
				//use the Streams API to convert all 
				//words to uppercase and then collect them into a List<String>.
				 List<String> words = Arrays.asList("apple", "banana", "cherry");
			List<String> result=words.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		           System.out.println(result);
	}
	public static void mapProgram9() {
		 //Question: Given a List<Integer>,
		//use the Streams API to filter out the even numbers and then square the remaining odd numbers, 
		//collecting the results into a List<Integer>.
		  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	List<Integer> result=	numbers.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
	 System.out.println(result);
	}
	public static void mapProgram10() {
		//Question: Given a List<String> of numbers as strings,
				//use the Streams API to 
				//calculate the sum of these numbers.
				 List<String> numbers = Arrays.asList("10", "20", "30");
			int sumResult=numbers.stream().mapToInt(Integer::parseInt).sum();
				System.out.println(sumResult);
	}
	public static void mapProgram11() {
		List<Product12> products = Arrays.asList(
                new Product12("Laptop", 1200.00),
                new Product12("Mouse", 25.00),
                new Product12("Keyboard", 75.00)
        );
 double result=products.stream().mapToDouble(n->n.getPrice()).average().orElse(0.0);
		System.out.println(result);
	}
	public static void FlatMapProgram12() {
		List<List<String>> values=Arrays
				.asList(Arrays.asList("Anand","Upandra")
						,Arrays.asList("Rani","Murali")
						,Arrays.asList("Vani","Kumari"));
		
	List<String> resuList=	values.stream().flatMap(List::stream).toList();
	    System.out.println(resuList);	
	}
	public static void FlatMapProgram13() {
//		Question: Given a List<List<Integer>>, 
		//	write Java 8 code to flatten it into a single List<Integer>.
			 List<List<Integer>> listOfLists = Arrays.asList(
		                Arrays.asList(1, 2, 3),
		                Arrays.asList(4, 5),
		                Arrays.asList(6)
		        );
			 
	List<Integer> result=listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
			System.out.println(result);
	}
	public static void FlatMapProgram14() {
		//4. Splitting Strings and Flattening:
		//	Question: Given a List<String> where 
		//	each string contains comma-separated values,
		//	write Java 8 code to split each string by the comma and collect all the  
		//	individual values into 
		//	a single List<String>.
		  List<String> commaSeparated = Arrays
				  .asList("apple,banana", "orange", "grape,kiwi,melon");
	List<String> result=   commaSeparated
	   .stream()
	   .flatMap(s->Stream.of(s.split(","))).collect(Collectors.toList());
	   System.out.println(result);
	}
	public static void FlatMapProgram15() {
//		Question: You have a List<User> where 
		//	each User object has a List<String> of roles. 
		//	Write Java 8 code to extract all unique roles
		//	from all users into a Set<String>.
			 List<User> users = Arrays.asList(
		                new User("Alice", Arrays.asList("admin", "editor")),
		                new User("Bob", Arrays.asList("reader", "editor")),
		                new User("Charlie", Arrays.asList("admin"))
		        );	 
		Set<String> result=	 users.stream()
			 .map(s->s.getRoles())
			 .flatMap(List::stream)
			 .collect(Collectors.toSet());
		System.out.println(result);
	}
	public static void mixFilterMapFlatMap1() {
		// Example 1: Filtering even numbers, 
				// squaring them, and then flattening 
				// a list of these results
				 List<List<Integer>> numbersList1 = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
		        List<Integer> endResult=numbersList1.stream()
		                               .flatMap(List::stream)
		                               .filter(n->n%2==0)
		                               .map(n->n*n)
		                               .toList();		       
			System.out.println(endResult);
	}
	public static void mixFilterMapFlatMap2() {
		 // Example 2: Filtering strings with length > 3,
		//converting to uppercase, 
		//and then flattening into a stream of characters
		 List<String> words2 = Arrays.asList("apple", "banana", "kiwi", "orange","cat");
	List<Character> endResult=words2.stream()
		   .filter(n->n.length()>3)
		   .map(n->n.toUpperCase())
		   .flatMap(words->words.chars().mapToObj(c->(char)c))
		   .collect(Collectors.toList());
		System.out.println(endResult);   
	}
	public static void mixFilterMapFlatMap3() {
		 // Example 5: Filtering words starting with 'b', 
		//mapping to their lengths, 
		//and then flattening to a stream of lengths
		List<List<String>> wordLists5 = Arrays.asList(Arrays.asList("apple", "ball", "cat"), 
				Arrays.asList("bear", "dog"));
	List<Integer> endResult=	wordLists5.stream().flatMap(List::stream)
		        .filter(words->words.startsWith("b"))
		        .map(n->n.length()).toList();
	System.out.println(endResult);
	}
	public static void mixFilterMapFlatMap4() {
		// Example 8: Filtering words containing 'a', 
				//mapping them to a list containing the word and its length, 
				//and then flattening
				//Example 8 Result: [apple, 5, grape, 5, banana, 6]
				List<String> words8 = Arrays.asList("apple", "grape", "kiwi", "banana","rose");
		  List<Object> endResult=words8.stream()
				  .filter(n->n.contains("a"))
				  .map(words->Arrays.asList(words,words.length()))
				  .flatMap(List::stream).collect(Collectors.toList());
				System.out.println(endResult);  
	}
	
	public void sortedProgram1() {
		  List<String> values=Arrays.asList("zebra", "apple", "banana");
		   List<String> naturalOrder=values.stream().sorted().toList();
		        System.out.println(naturalOrder);
		        System.out.println("customize Order");
		  	  List<String> values2=Arrays.asList("zebra", "apple", "banana");
		  	List<String> endResult=values2.stream().sorted(Comparator.reverseOrder()).toList();
		  		System.out.println(endResult);	  		
	}
	public static void sortedProgram2() {
		 List<Person> list=Arrays.asList(new Person("Bob", 30),
	             new Person("Alice", 25),
	             new Person("Charlie", 35)
	     );
		 //sort the Person By Age	
			  List<Person> endResult=list.stream()
			  .sorted(Comparator.comparingInt(Person::getAge).reversed())
			  .collect(Collectors.toList());	  
			  System.out.println(endResult);	 
	}
	public static void sortedProgram3(){
		//Sorting a Stream of Streams (Flattening and then Sorting)
		 List<List<Integer>> listOfLists = Arrays.asList(
	                Arrays.asList(3, 1, 2),
	                Arrays.asList(6, 4, 5)
	        );
  List<Integer> endResult=listOfLists.stream().flatMap(List::stream).sorted().collect(Collectors.toList());
		  System.out.println(endResult);
	}
	public static void sortedProgram4() {
		//Sorting based on Multiple Criteria (Then Comparing)
		List<Person> people = Arrays.asList(
                new Person("Bob", 30),
                new Person("Alice", 25),
                new Person("Charlie", 30),
                new Person("David", 25)
        );
  List<Person> personEndResult=people.stream()
		.sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName))
		.toList();
		System.out.println(personEndResult);	
	}
	public static void sortedMapPrograming5() {
		//map Based problems 
				Map<String, Integer> mp=new HashMap<>();
				mp.put("Charlie", 35);
				mp.put("Alice", 25);
				mp.put("Bob", 30);
				mp.put("David", 28);
			//	Sorting a Map by Keys (Natural Order)
		Map<String,Integer> endResult=mp.entrySet()
			   .stream()
			   .sorted(Map.Entry.comparingByKey())
			   .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,TreeMap::new));
				System.out.println(endResult);
	}
	public static void sortedMapPrograming6() {
		Map<String, Integer> mp=new HashMap<>();
		mp.put("Charlie", 35);
		mp.put("Alice", 25);
		mp.put("Bob", 30);
		mp.put("David", 28);
	Map<String,Integer> endResult=	mp.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,TreeMap::new));
		System.out.println(endResult);
	}
	public static void findingAvgOfEmployee() {
		//finding Avg salary of Employee using stream API
				List<Employee> li=Arrays.asList(new Employee(1,"Anand",15000),
						new Employee(2,"Bittu",25000),new Employee(3,"Rani",85000),
						new Employee(4,"Vani",32000));
			   double result=li.stream()
					   .map(n->n.getSalary())
					   .mapToDouble(Double::doubleValue)
					   .average()
					   .getAsDouble();
			      System.out.println(result);
	}
	public static void groupingProgram1() {
		//find no of Males and Females in the List
				List<Employee> li=Arrays.asList(new Employee("A", "A@gmail.com","Male")
						,new Employee("B", "B@gmail.com","Female"),
						new Employee("C","C@gmail.com","Male"));
		Map<String,List<Employee>> endResult=li.stream().collect(Collectors.groupingBy(Employee::getGender));
				System.out.println(endResult);
				System.out.println("--------------------------");
		Map<String,Long> endResult2=li.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
			System.out.println(endResult2);
	}
	public static void groupingProgram2() {
		// Group students by grade
				 List<Student> students = Arrays.asList(
				            new Student("Alice", "A", 85),
				            new Student("Bob", "B", 78),
				            new Student("Charlie", "A", 92),
				            new Student("David", "B", 70),
				            new Student("Eve", "A", 88)
				        );
				Map<String,List<Student>> endResult= students.stream()
				 .collect(Collectors.groupingBy(Student::getGrade));
			System.out.println(endResult);
	}
	public static void groupingProgram3() {
		// Group by grade and then calculate average score for each grade
				 List<Student> students = Arrays.asList(
				            new Student("Alice", "A", 85),
				            new Student("Bob", "B", 78),
				            new Student("Charlie", "A", 92),
				            new Student("David", "B", 70),
				            new Student("Eve", "A", 88)
				        );
			Map<String,Double> endResult=	 students.stream()
				 .collect(Collectors.groupingBy(Student::getGrade,Collectors.averagingInt(Student::getScore)));
				System.out.println(endResult);
	}
	public static void groupingProgram4() {
		  // Group by grade and count the number of students in each grade
				List<Student> students = Arrays.asList(
			            new Student("Alice", "A", 85),
			            new Student("Bob", "B", 78),
			            new Student("Charlie", "A", 92),
			            new Student("David", "B", 70),
			            new Student("Eve", "A", 88)
			        );
			Map<String,Long> endResult=	students.stream()
				.collect(Collectors.groupingBy(Student::getGrade,Collectors.counting()));
				System.out.println(endResult);
	}
	public static void groupingProgram5() {
		// How to find duplicate elements in a given integers
				// list in java using Stream functions?
				List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
			Map<Integer,Long> endResult=	   myList.stream()
				   .collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
				System.out.println(endResult);
	}
	public static void FindingVowelsandConstent() {
		//In given statement like "Anand kumar" find total number of vowels existed and there individual count?
		String name ="artificial intelligence is future";
		String lowerCase=name.toLowerCase();
		System.out.println(lowerCase);
		int acount=0;int ecount=0;int icount=0;int ocount=0;int ucount=0;
		int totalVowels=0;
		for(int i=0;i<lowerCase.length();i++) {
			char ch=lowerCase.charAt(i);
			if(ch!=' ') {
				switch (ch) {
				case 'a':
					  totalVowels++;
					  acount++;
					  break;
				case 'e' :
					 totalVowels++;
					  ecount++;
					  break;
				case 'i' :
					 totalVowels++;
					  icount++;
					  break;
				case 'o' :
					 totalVowels++;
					  ocount++;
					  break;
				case 'u' :
					 totalVowels++;
					  ucount++;
					  break;
				}
			}	
		}
		System.out.println("totalVowels::"+totalVowels);
		System.out.println("total-A-Vowels::"+acount);
		System.out.println("total-E-Vowels::"+ecount);
		System.out.println("total-I-Vowels::"+icount);
		System.out.println("total-O-Vowels::"+ocount);
		System.out.println("total-U-Vowels::"+ucount);
	}
	public static void maxValueFinding() {
		List<Integer> values=Arrays.asList(1,2,3,4,5,100,8,5,2);
        Optional<Integer> result=   values.stream().max(Integer::compare);
		System.out.println(result);
	}
	public static void findigMaxGrade() {
		//finding max  mark from the given group of students
		List<Student> values=Arrays.asList(
				new Student("Anand","B", 92),
				new Student("Bittu", "B",93),
				new Student("Vani", "A", 98),
				new Student("Yash", "E", 8));
Optional<Integer> endResult=values.stream().map(st->st.getScore()).max(Integer::compare);
		System.out.println(endResult);
	}
	
	public static void findingMaxSalary() {

		//Student with max  marks in math Subject
List<Subject> stsub1=Arrays.asList(new Subject("Maths", 92)
		,new Subject("English",52));
List<Subject> stsub2=Arrays.asList(new Subject("Maths",100),
		new Subject("English", 55));
List<Subject> stsub3=Arrays.asList(new Subject("Maths",88),
		new Subject("English",92));
List<StudentSubject> studentsList=Arrays.asList(new StudentSubject("Rani", stsub1)
		,new StudentSubject("Anand", stsub2),
		new StudentSubject("Yash", stsub3));
  
   Optional<StudentSubject> endResult=studentsList.stream()
       .max(Comparator.comparingInt(st->st.getSubjets().stream()
    		   .filter(sub->sub.getSubjectName().equals("Maths"))
    		   .findFirst().get().getSubjectMarks()));
   if(endResult.isPresent()) {
	   System.out.println(endResult.get().getName());
   }
   else {
	   System.out.println("no student is Found");
   }
	}
	public static void countRepeatingwords() {
		 //finding number of Repating  of word in  Java
		String name="java is very super java is very good what you say";
		String names[]=name.split(" ");
		List<String> listwords=new ArrayList<>();
		for(String w:names) {
			listwords.add(w);
		}
		System.out.println(listwords);
		//now apply stream 
	Map<String,Long> values=	listwords.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		values.entrySet().stream().forEach(x->{
			if(x.getValue()>1) {
				System.out.println(x);
			}		
		});
	}
	public static void logical1() {
	//finding duplicate Elements in a given Stream API
		List<Integer> list=Arrays.asList(10,28,87,30,20,10,87,28,28,28);
		Set<Integer> set=new HashSet<>();
	Set<Integer> endResult=	list.stream().filter(x->!set.add(x)).collect(Collectors.toSet());
	 System.out.println(endResult);
	}
	
	public static  void findingEvenNumber(int value) {
		IntStream.of(value)
		.filter(n->n%2==0)
		.forEach(x->System.out.println(x));
	}
	public static void findingHighestLength() {
		 //Finding the word that is having highest Length
		String s1="I am learning streams API in java";
        String endResult=	Arrays.stream(s1.split(" ")).max(Comparator.comparing(String::length)).get();
	       System.out.println(endResult);
	}
	public static void main(String[] args) {
		System.out.println("-------------------------------------------");
      
		}
	}

