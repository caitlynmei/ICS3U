package com.bayviewglen.dayfour;

public class HomeworkTwo {

	public static void main(String[] args) {
	
		double studentMark = 36.5;
		
		int totalMarks = 50;
		
		double studentAverage = studentMark / (double)totalMarks * 100;
		
		System.out.println("The average grade of a student who performed a " + studentMark + " on a test out of " + totalMarks + " would be " + (int)studentAverage + "%.");

	}

}
