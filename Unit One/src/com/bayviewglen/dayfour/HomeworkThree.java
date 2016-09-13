package com.bayviewglen.dayfour;

public class HomeworkThree {

	public static void main(String[] args) {
	
		int num = 234567;
		
		int digit2 = num / 1000 % 10;
		int digit5 = num / 10 % 10;
		
		int product = digit2 * digit5;
		
		System.out.println("With the given number " + num + ", and you multiple the 2nd and 5th digits (which are " + digit2 + " and " + digit5 + ", the product is " + product + ".");

	}

}
