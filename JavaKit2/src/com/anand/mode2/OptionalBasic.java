package com.anand.mode2;

import java.util.Optional;

public class OptionalBasic {

	public static void main(String[] args) {
       //Optional creation
	//	Optional op=new Optional();
		Optional<String> op=Optional.empty();
	     System.out.println(op);
	     Optional<String> op2=Optional.empty();
	     System.out.println(op2);
	     System.out.println(op.hashCode());
         System.out.println(op2.hashCode());	
         System.out.println("*********\n");
	     Optional<String> op3=Optional.empty();
	     System.out.println(op3);
	     System.out.println(op3.orElse("JTCA"));
	     System.out.println(op3);
	   //  System.out.println(op3.get());
	     System.out.println(op3.isPresent());
	      System.out.println("*****\n");
	      String s1="JTC";
	      
	      Optional<String> op4=Optional.of(s1);
	      System.out.println(op4);
	      System.out.println(op4.orElse("Rani"));
	      System.out.println(op4);
	      System.out.println(op4.get());
	      System.out.println(op4.isPresent());
	       
	      System.out.println("--------\n");
	    Optional<String> op5=Optional.of(null);
	     System.out.println(op5);
	     
	      
	      
	}

}
