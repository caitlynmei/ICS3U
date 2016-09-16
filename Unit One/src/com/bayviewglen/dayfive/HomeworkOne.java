package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		
		Scanner teacup = new Scanner(System.in);
		
		double x;
		System.out.print("Please enter a number: ");
		
		x = teacup.nextDouble();
		
		double squared = x * x;
		System.out.println(x + " squared is " + squared + ".");
		
		teacup.close();
		
	}

}
