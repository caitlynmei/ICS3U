package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		double mark, percentage;
		int totalMarks;
		
		System.out.print("Please enter your mark: ");
		mark = keyboard.nextDouble();
		
		System.out.print("Please enter the total amount that the test was out of: ");
		totalMarks = keyboard.nextInt();
		
		percentage = (mark / totalMarks) * 100;
		
		System.out.println("With a " + mark + " out of " + totalMarks + ", your score would be " + (int) percentage + "% on the test.");
		
		keyboard.close();
	}

}
