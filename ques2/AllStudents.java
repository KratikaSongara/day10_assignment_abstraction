package com.ques2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter address");
		String address = sc.next();		
		System.out.println("Enter physics marks");
		double physics = sc.nextInt();
		System.out.println("Enter chemistry marks");
		double chemistry = sc.nextInt();
		System.out.println("Enter maths marks");
		double maths = sc.nextInt();
		System.out.println("Enter history marks");
		double hist = sc.nextInt();
		System.out.println("Enter civics marks");
		double civics = sc.nextInt();
		
		HistoryStudent history = new HistoryStudent(name, address);
		history.civicsMarks=civics;
		history.historyMarks=hist;
		double history_percentage=history.getPercentage();
		System.out.println("History percentage : "+history_percentage+"%");
		
		ScienceStudent science = new ScienceStudent(name, address);
		science.chemistryMarks=chemistry;
		science.mathsMarks=maths;
		science.physicsMarks=physics;
		double science_percentage=science.getPercentage();
		System.out.println("Science percentage : "+science_percentage+"%");
	}

}
