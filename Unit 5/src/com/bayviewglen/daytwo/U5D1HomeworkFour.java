package com.bayviewglen.daytwo;

import java.util.Scanner;

public class U5D1HomeworkFour {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please enter a number: ");
		int number = keyboard.nextInt();
			
		int position = Fibonacci(number);
		String pattern = "";
		
		for (int i=0; i<=number; i++){
			pattern =+ position + " ";
		}
		
		System.out.println("The first n elements of the Fibonacci Sequence are: 1 1 " + pattern);
		
	}

	public static int Fibonacci(int n){
		int position = 1;
		//int answer = 0;
		
		for (int i=1; i<=n; i += position){
			position = i;
		}
		
		/*
		for (int i=0; i<=n; i++){
			elements =+ answer + " ";
		}
		*/
		
		return position;
	}
	
}
