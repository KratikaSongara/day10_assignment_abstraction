package com.ques2;

public class ScienceStudent extends Student{

	double physicsMarks;
	double chemistryMarks;
	double mathsMarks;
	
	
	public ScienceStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getPercentage() {
		// TODO Auto-generated method stub
		double total = physicsMarks + chemistryMarks + mathsMarks;
		double percentage = (total/300)*100.00;
		return percentage;
	}

}
