package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {

		Scanner teacup = new Scanner(System.in);
		
		System.out.print("Please enter a five digit number: ");
		
		int num = teacup.nextInt();
		
		int digit2 = num / 1000 % 10;
		int digit4 = num / 10 % 10;
		
		int product = digit2 * digit4;
		
		System.out.println("");
		System.out.println("The product of the second digit, " + digit2 + ", and the fourth digit, " + digit4 + ", is " + product + ".");
		
		teacup.close();
		
	}

}
