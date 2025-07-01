package com.anand.mode2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalContainerExample {

	private static Map<Integer,String> username;
	
	static {
		System.out.println("static Block");
		username=new HashMap<>();
		username.put(1,"Anand");
		username.put(2,"Rani");
	}
	public Optional<String> getuserNameById(int id){
		String name=username.get(id);
		return Optional.ofNullable(name);
	}
	public static void main(String[] args) {
		OptionalContainerExample op=new OptionalContainerExample();
	     //user that exits;
	Optional<String> userName1=op.getuserNameById(1);
	if(userName1.isPresent()) {
		System.out.println(userName1.get());
	}else {
		System.out.println("User 1 not Found");
	}
		//user does not Exits
	 Optional<String> userName2=op.getuserNameById(3);
	 if(userName2.isPresent()) {
		 System.out.println(userName2.get());
	 }else {
		 System.out.println("user 3  does not exists");
	 }
	
	
	}
	
	
}
