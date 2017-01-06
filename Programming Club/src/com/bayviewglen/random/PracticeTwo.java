package com.bayviewglen.random;

import java.util.Scanner;

public class PracticeTwo {

	public static void main(String[] args) {
		// Write a times table program. The program should ask a user to input a
		// number.
		// This number is then used as the times table.
		// So if the user enters 10, the 10 times table should be displayed.

		Scanner teacup = new Scanner(System.in);

		System.out.println("Please enter a number (1 - 10) for its times table:");
		int number = teacup.nextInt();

		int answer = 0;

		System.out.println();
		for (int i = 1; i < 11; i++) {
			answer = i * number;
			System.out.println(number + " x " + i + " = " + answer);
		}

	}
}
