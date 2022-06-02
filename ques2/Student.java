package com.ques2;

public abstract class Student {

	String name;
	String address;
	
	public abstract double getPercentage();
	
	public Student(String name, String address) {
		this.name=name;
		this.address=address;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
