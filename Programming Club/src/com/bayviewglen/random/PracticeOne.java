package com.bayviewglen.random;

public class PracticeOne {

	public static void main(String[] args) {
	
		// Exercise: Change you code so that the loop adds up the numbers 1 to a 100. 
		// The answer you should get is 5050.

		int answer = 0;
		
		for (int i = 0; i < 101; i++){
			answer += i;
		}
		
		System.out.println("THis is the answer: " + answer);
		
	}

}
