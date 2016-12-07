package com.bayviewglen.daytwo;

import java.util.Scanner;

public class U5D1HomeworkThree {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please enter a number: ");
		int number = keyboard.nextInt();
		
		System.out.println("The factorial of your number is: " + Factorial(number));
		
	}

	public static int Factorial(int num){
		int product = 1;
		
		for (int i = 1; i <= num; i++){
			product *= i;
		}
		
		return product;
		
	}
	
}
