package com.bayviewglen.daytwo;

import java.util.Scanner;

public class U5D1HomeworkFour {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please enter a number: ");
		int number = keyboard.nextInt();
		Fibonacci(number);
			
		System.out.println("The first n elements of the Fibonacci Sequence are: 1 " + Fibonacci(number));
		
	}

	public static String Fibonacci(int n){
		int next = 1;
		int prev = 0;
		int temp;
		String pattern = "";
		
		for (int i=1; i<n; i++){
			temp = next;
			next = next + prev;
			prev = temp;
			pattern += next + " ";
		}
		
		return pattern;
	}
	
	public static int fib(int n){
		
		if (n == 1 || n == 2){
			return 1;
		} else {
			return fib(n-2) + fib(n-1);
		}
		
	}
	
	
	
}
