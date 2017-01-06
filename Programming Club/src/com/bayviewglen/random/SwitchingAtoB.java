package com.bayviewglen.random;

import java.util.Scanner;

public class SwitchingAtoB {

	public static void main(String[] args) {

		Scanner teacup = new Scanner (System.in);
		
		System.out.println("This compares two numbers (ranging from 10 - 20). \nPlease enter a number: ");
		int a = teacup.nextInt();
		System.out.println("Please enter another number: ");
		int b = teacup.nextInt();
		
		if (b > a) {
			int temporary = a;
			a = b;
			b = temporary;
		}

		if (a >= 10 && a <= 20) {
			System.out.println("The more valid number is: " + a);
		} else if (b >= 10 && b <= 20) {
			System.out.println("The more valid number is: " + b);
		} else {
			System.out.println("There are no valid numbers.");
		}

	}

}
