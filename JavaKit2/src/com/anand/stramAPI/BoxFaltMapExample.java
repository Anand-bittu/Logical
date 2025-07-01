package com.anand.stramAPI;

import java.util.List;

public class BoxFaltMapExample {

	public String colour;
	private String label;
	private List<String> iteams;
	
	public BoxFaltMapExample() {
          System.out.println("0 parameter Box");
	}
	

	public BoxFaltMapExample(String colour, String label, List<String> iteams) {
		this.colour = colour;
		this.label = label;
		this.iteams = iteams;
	}


	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<String> getIteams() {
		return iteams;
	}

	public void setIteams(List<String> iteams) {
		this.iteams = iteams;
	}

	
	public BoxFaltMapExample ChageBoxColour(String newColour) {
		return new BoxFaltMapExample(newColour,this.label,this.iteams);
	}
	
	@Override
	public String toString() {
		return "BoxFaltMapExample [colour=" + colour + ", label=" + label + ", iteams=" + iteams + "]";
	}
	
	
	
	
}


