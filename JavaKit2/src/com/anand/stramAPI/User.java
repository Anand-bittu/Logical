package com.anand.stramAPI;

import java.util.List;

public class User {

	
	private String name;
	private List<String> roles;
	public User(String name, List<String> roles) {
		this.name = name;
		this.roles = roles;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", roles=" + roles + "]";
	}
	
	
	
}
