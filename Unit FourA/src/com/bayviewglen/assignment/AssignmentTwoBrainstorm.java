package com.bayviewglen.assignment;

import java.util.Scanner;

public class AssignmentTwoBrainstorm {

	public static void main(String[] args) {
	
		/*
		String str = "Hello";
		
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
		
		String capStr = str.toUpperCase();

		/*
		String inputString = "hello";
		String result = ""; 
		
		 for( int i=0; i < inputString.length( ); i++ ) { 
		    if( Character.isLetter( inputString.charAt( i ) ) ) 
		      result += inputString.charAt( i ); 
		  } 
		  	System.out.println(result); 
		} 
		
		
		for (int i = 0; i < str.length(); i++){
			if (Character.isLetter(str.charAt(i))){
				System.out.println("ok");
			} 
		}
		
		System.out.println("Yay!");

		*/
		
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		Scanner keyboard = new Scanner (System.in);
		
		String playerTwo = "Bob";
		String unusedCharacters = "";
		
		System.out.println(playerTwo + ", you have used 0 guesses would you like to (1) solve or (2) guess a character: ");
		int guessChoice = keyboard.nextInt(); // for either choice 1 or 2
		
		if (guessChoice == 1){
			System.out.println(playerTwo + ", please enter your solution: ");
		} else if (guessChoice == 2){
			for (int i = 0; i < VALID_CHARACTERS.length(); i++){
				unusedCharacters += VALID_CHARACTERS.charAt(i) + " ";
			}
			System.out.println(unusedCharacters + " ");
		} else {
			System.out.println(playerTwo + ", you must enter (1) to solve or (2) to guess a character:");
		}
		
		/*
		 while (!valid){
			if (guessChoice == 1){
				valid = true;
				System.out.println(playerTwo + ", please enter your solution: ");
			} else if (guessChoice == 2){
				valid = true;
				for (int i = 0; i < VALID_CHARACTERS.length(); i++){
					unusedCharacters += VALID_CHARACTERS.charAt(i) + " ";
				}
				System.out.println("Unused Characters: ");
				System.out.println(unusedCharacters + " ");
			} else {
				for (int i = 0; !(guessChoice == 1 || guessChoice == 2) && valid; i++){
					valid = false;
					System.out.println(playerTwo + ", you must enter (1) to solve or (2) to guess a character:");
				} System.out.println();
			}
		}
		//--------------------
		valid = false;
		
		while (!valid){
			for (int i = 0; i < 2; i++){
				if (!(guessChoice == 1 || guessChoice == 2) && valid){
					valid = false;
					System.out.println(playerTwo + ", you must enter (1) to solve or (2) to guess a character:");
				}
			} 
		}
		
		while (valid = true){
			if (guessChoice == 1){
				System.out.println(playerTwo + ", please enter your solution: ");
			} else if (guessChoice == 2){
				for (int i = 0; i < VALID_CHARACTERS.length(); i++){
					unusedCharacters += VALID_CHARACTERS.charAt(i) + " ";
				}
				System.out.println("Unused Characters: ");
				System.out.println(unusedCharacters + " ");
			}
		}
		
			
		*/
		
		
		
	}
}

