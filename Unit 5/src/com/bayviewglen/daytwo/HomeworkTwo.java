package com.bayviewglen.daytwo;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please enter a number: ");
		int number = keyboard.nextInt();
		
		System.out.println("The sum of your number from 1 is: " + SumSequence(number));
		
	}

	public static int SumSequence(int num){
		int sum = 0;		
		
		for (int i = 1; i <= num; i++){
			sum += i;
		}
		
		return sum;
			
	}
	
}
