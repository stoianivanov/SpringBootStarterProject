package com.swiftacad.model;

public class Wine {
	private String name;
	private int age;
	
	public Wine(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Wine() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
