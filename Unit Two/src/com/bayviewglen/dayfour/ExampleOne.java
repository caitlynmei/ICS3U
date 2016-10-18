/*
 * Display a random upper case character
 */ 
// didn't go through this one in class

package com.bayviewglen.dayfour;

public class ExampleOne {

	public static void main(String[] args) {
		final int NUM_OF_LETTERS = 26;
		final int UPPER_CASE_A = 65;
		
		char letter = (char)((int)(Math.random()*NUM_OF_LETTERS)+UPPER_CASE_A);

		System.out.println("The random letter is: " + letter); 

		/*String please = "Happy";
		
		System.out.println(please.charAt(please.length()/2));
		System.out.println(please.indexOf("appy"));
		*/
		
	}

}