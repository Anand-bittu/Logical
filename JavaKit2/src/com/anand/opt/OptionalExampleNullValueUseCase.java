package com.anand.opt;

import java.util.Optional;

public class OptionalExampleNullValueUseCase {

	public static void main(String[] args) {

	Optional<String> endResult=getName();
	if(endResult.isPresent()) {
           String up=endResult.get();
           System.out.println(up.toUpperCase());
	}else {
		System.out.println("Null value");
	}
		
	}
	
	public static Optional<String> getName(){
		String value=null;
		if(value==null) {
			Optional<String> op=Optional.empty();
			return op;
		}else {
			Optional<String> op2=Optional.of(value);
			return op2;
		}
	}

}
