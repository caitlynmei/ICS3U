package com.bayviewglen.random;

import java.util.Scanner;

public class CodingBatMiddleXYZ {

	public static void main(String[] args) {

		Scanner teacup = new Scanner(System.in);

		System.out.println("Please print the phrase: ");
		String str = teacup.nextLine();

		if (str.length() < 3) {
			System.out.println("false");
		}
		
		
		
		/*
		int i = 0;
		int countX = 0;
		int countZ = 0;

		for (; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("x")) {
				countX++;
			} else if (str.substring(i, i + 1).equals("z")) {
				countZ++;
			}
		}

		int firstX = str.indexOf("x");
		int firstZ = str.indexOf("z");
		int middleX = 0;
		int middleZ = 0;

		if (countX % 2 != 0 && countX >= 2) {
			middleX = str.indexOf("x", firstX + 1);
		} else {
			middleX = firstX;
		}

		if (countZ % 2 != 0 && countZ >= 2) {
			middleZ = str.indexOf("z", firstZ + 1);
		} else {
			middleZ = firstZ;
		}

		String front = str.substring(0, middleX);
		String back = str.substring(middleZ + 1);

		if (front.length() == back.length() || front.length() + 1 == back.length()
				|| back.length() + 1 == front.length()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		 */
	}

}
