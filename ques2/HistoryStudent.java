package com.ques2;

public class HistoryStudent extends Student{

	double historyMarks;
	double civicsMarks;
	
	public HistoryStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getPercentage() {
		// TODO Auto-generated method stub
		double total = historyMarks + civicsMarks;
		double average = (total/200)*100.00;
		return average;
	}

}
