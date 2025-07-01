package com.anand.mode2;

import java.util.List;

public class MapBox {
private String label;
private String colour;
private List<String> iteams;

public MapBox(String label, String colour, List<String> iteams) {
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
public MapBox changeColour(String newcolour) {
	return new MapBox(this.label,newcolour, this.iteams);
}
@Override
public String toString() {
	return "MapBox [label=" + label + ", colour=" + colour + ", iteams=" + iteams + "]";
}



}
