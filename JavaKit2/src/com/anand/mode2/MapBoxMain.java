package com.anand.mode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapBoxMain {

	public static void main(String[] args) {

		List<String> iteams=Arrays.asList("apple","banana","mosambai");
		 List<MapBox> listofBox=new ArrayList<>();
		 listofBox.add(new MapBox("Box-A", "yellow", iteams));
		 listofBox.add(new MapBox("Box B","Red", iteams));
		 listofBox.add(new MapBox("Box-c","Green", iteams));
		 System.out.println("orignal colour::"+listofBox);
		 
		 //change the colour each box to orange
		List<MapBox> mapboxyellow= listofBox.stream().map(b->b.changeColour("orange")).toList();
		System.out.println("modifide colour:::"+mapboxyellow);
		
	}

}
