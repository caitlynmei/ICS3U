package com.bayviewglen.dayone;

import java.util.Scanner;

public class U5D1ExampleOne {

	public static void main(String[] args) {
		//int x = 25;
		
		//int y = sum(x);
		//System.out.println(y);	

		//int z = 3;
		//System.out.println(cube(z));
		
		//String goodString = getAlphaNumericString();
		//System.out.println("The good String is: " + goodString);
		
		int n = 10;
		System.out.println("You rolled a: " + roll(n));
	}

	public static int roll(int numSides){
		if (numSides < 3){
			throw new IllegalArgumentException("Number of sides must be at least 3...");
		}
		
		return (int)(Math.random() * numSides) + 1;
	
	}
	/*
	public static String getAlphaNumericString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String sentence = "";
		boolean isValid = false;
		while(!isValid){
			isValid = true;
			sentence = scanner.nextLine().toUpperCase();
			for (int i=0; i<sentence.length(); i++){
				if (validChars.indexOf(sentence.charAt(i)) == -1){
					isValid = false;
				}
			}
			if (!isValid)
				System.out.println("Come on... enter a sentence:");
		}
		return sentence;
	}

	// accepts an integer n and sums the number [1,n]	
	public static int sum(int n){ //outside of main method: 2 options (change int to void/return something)
		int sum = 0;
		
		for (int i=1; i<=n; i++){
			sum += i;
		}
		
		return sum;
		
	}
	
	public static double cube(double x){
		
		return x * x * x;
		
	}
	*/
	
	
}
