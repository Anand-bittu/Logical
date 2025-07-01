package com.anand.opt;

import java.util.Optional;

public class OptionalExample {

	
	public static void main(String[] args) {
	String value=	OptionalExample.getName();
	if(value!=null) {
		value=value.toUpperCase();
		System.out.println(value);
	}else {
	      System.out.println("value is having null");
	}
	System.out.println();
	System.out.println("--------------------------");
	Optional<String> result=Optional.of(value);
	if(result.isPresent()) {
		System.out.println(result.get());
	}else {
		System.out.println("String is Null");
	}		
	}
	public static String getName() {
		return null;
	}
}
