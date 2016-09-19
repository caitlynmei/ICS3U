package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEight {

	public static void main(String[] args) {
		
		// Basic Math
		
		Scanner teacup = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		double num = teacup.nextDouble();
		
		double squared = num * num;
		
		double squareRoot = Math.sqrt(num);
		squareRoot = (int)(squareRoot * 100); 
		squareRoot = (double)(squareRoot) / 100;
		
		System.out.println(num + " squared is " + squared + ", and " + num + " square rooted is " + squareRoot + ".");

	}

}
