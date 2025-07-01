package com.anand.mode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapBoxMain {

	public static void main(String[] args) {
		List<String> iteams=Arrays.asList("apple","banana","mosambai");
		 List<MapBox> listofBox=new ArrayList<>();
		 listofBox.add(new MapBox("Box-A", "yellow", iteams));
		 listofBox.add(new MapBox("Box B","Red", iteams));
		 listofBox.add(new MapBox("Box-c","Green", iteams));
		 System.out.println("orignal colour::"+listofBox);
		 
		// Example: Flatten the list of items from all boxes into a single list
	List<String> ls=	 listofBox.stream().flatMap(n->n.getIteams().stream()).toList();
	
	System.out.println(ls);
	}

}
