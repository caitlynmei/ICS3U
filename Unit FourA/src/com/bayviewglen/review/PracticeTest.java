package com.bayviewglen.review;

import java.util.Scanner;

public class PracticeTest {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		/*
		// Section 1: 6
		int six1 = 1;
		while (six1 <100)
			six1*=2;
		System.out.println(six1);
		
		//7
		int seven1 = 0;
		for (int i = 0; i<5; i++)
			seven1+=i;
		System.out.println(seven1);
		
		//8
		/*int eight = 10;
		while (eight>0){
			System.out.println(eight);
			eight--;
		}
		*/
		/*
		// Section 2: 6
		int y = 5;
		y %= 3;
		
		System.out.println(y);
		*/
						
		// Section 3: 1
		/*
		System.out.println("Please enter your score: ");
		int score = keyboard.nextInt();
		char grade = ' ';	
		
		if (score >= 90) grade = 'A';
		else if (score >= 80 && score < 90) grade = 'B';
		else if (score >= 70 && score < 80) grade = 'C';
		else if (score >= 60 && score < 70) grade = 'D';
		else grade = 'F';
		
		System.out.println(grade);
				
		//2
		for (int j=0; j<10; j++){
			for (int k=10; k>j; k--){
				System.out.print("*");
			} System.out.println();
		}
		
		
		//9
		int x = 0;
		
		for (int j=0; j<100; j++)
			for (int k = 100; k>0; k--)
				x++;
		
		System.out.println(x);
		
		}
		*/

		// Section 4: 1
		/*
		for (int i = 0; i<5; i++){
			System.out.println("******");
		}
		 */
		
		//2
		System.out.println("How many numbers will be inputed?");
		int amount = keyboard.nextInt();
		int limit = 0;
		int sum = 0;
		double average = 0;
		int maximum = 0;
		int minimum = 0;
		
		for (int i = 0; i < amount; i++){
			System.out.println("Please enter an integer: ");
			int num = keyboard.nextInt();
			
			sum += num;
			average = (double)sum / amount;
			average = (int)(average*100);
			average = (double)(average/100);
						
			
		}
		
		int sumFinal = sum;
		
		System.out.println("The sum of the integers is: " + sumFinal);
		System.out.println("The average of the integers is: " + average);
		System.out.println("The maximum integer is: ");
		System.out.println("The minimum integer is: ");
		
		keyboard.close();
	}
}
