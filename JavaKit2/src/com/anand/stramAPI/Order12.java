package com.anand.stramAPI;

import java.util.List;

public class Order12 {

	private List<OrderIteam> iteams;

	public Order12(List<OrderIteam> iteams) {
		this.iteams = iteams;
	}

	public List<OrderIteam> getIteams() {
		return iteams;
	}

	public void setIteams(List<OrderIteam> iteams) {
		this.iteams = iteams;
	}
	
	
}
