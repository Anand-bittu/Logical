package com.anand.mode2;

import java.util.List;

public class FlatMapBox {
	private String label;
	private String colour;
	private List<String> iteams;
	public FlatMapBox(String label, String colour, List<String> iteams) {
		this.label = label;
		this.colour = colour;
		this.iteams = iteams;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public List<String> getIteams() {
		return iteams;
	}
	public void setIteams(List<String> iteams) {
		this.iteams = iteams;
	}
	@Override
	public String toString() {
		return "FlatMapBox [label=" + label + ", colour=" + colour + ", iteams=" + iteams + "]";
	}
	
	
	
}
