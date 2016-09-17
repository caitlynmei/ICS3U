/*
 * Using the Scanner to read input from the user/keyboard.
 * 
 * Prompt the user for 3 digit integer. 
 * 
 * Display the sum of the three digits to the console.
 */

package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ExampleThree {

	public static void main(String[] args) {
		
		Scanner teacup = new Scanner(System.in);
		System.out.print("Please enter a three (3) digit number: ");
		
		int number = teacup.nextInt();
				
		int digit1 = number % 10;
		int digit3 = number / 100;
		int digit2 = number % 100 / 10;
		
	
		
		System.out.println("");
		System.out.println("The sum of the numbers " + digit3 + ", " + digit2 + ", and " + digit1 + " is " + (digit1 + digit2 + digit3) + ".");
		
		teacup.close();
		

	}

}