package com.bayviewglen.assignment;

import java.util.Scanner;

public class AssignmentTwoBrainstorm {

	public static void main(String[] args) {
	
		boolean solved = false;
		Scanner keyboard = new Scanner (System.in);
		
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
		
		String phraseOne = "SMILE";
		String phraseOneSolution = "";
		String playerTwo = "Bob";
		/*
		String unusedCharacters = "";
		
		System.out.println(playerTwo + ", you have used 0 guesses would you like to (1) solve or (2) guess a character: ");
		int guessChoice = keyboard.nextInt(); // for either choice 1 or 2
		
		boolean valid = false;
		*/
		
	/*
		String correctChars = "IM";
		String currentChar = "";
		
		/*
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
		*/
		
		phraseOneSolution = "";
			System.out.println(playerTwo + ", please enter your solution: ");
			phraseOneSolution = keyboard.nextLine();
			if (phraseOneSolution.equals(phraseOne)){ 
				System.out.println("Congratulations " + playerTwo + "! You are correct."); // this doesn't work
				solved = true;
				//guessOver = false;
				//halfRoundOver = false;
			} else {
				System.out.println(playerTwo + ", you are unfortunately incorrect."); 
				//guessOver = false;
			}	
		
			/*
			// one times
			if (correctCharacter.indexOf(phrase.charAt(c)) != -1){
				System.out.print(correctCharacter + " ");
			} else if (VALID_CHARACTERS.indexOf(phrase.charAt(c)) != -1){
				System.out.print("_ ");
			} else {
				System.out.print("/ ");
			}
			
			
			// multiple times
			 	for (int c = 0; c < phrase.length(); c++){ 
							
							/* to count how many times a character appears in phraseMaker's phrase (e.g hiiiiiii)
							for (int k = 0; k < phrase.length(); k++){
								if (phrase.indexOf(correctCharacter.charAt(c)) != -1){
									phraseCharLen++;
								}
							}
							
							
							if (i == 0){
								if (VALID_CHARACTERS.indexOf(phrase.charAt(c)) != -1){
									System.out.print("_ ");
								} else {
									System.out.print("/ ");
								}	
							} 
							if (i > 0){
								if (phrase.indexOf(correctChars.charAt(c)) != -1){
									//for (int m = 0; m < phraseCharLen; m++){
									System.out.print(correctCharacter.charAt(c));
									//System.out.print(correctChars.charAt(c) + " ");
									//}
								} else if (VALID_CHARACTERS.indexOf(phrase.charAt(c)) != -1){
									System.out.print("_ ");
								} else {
									System.out.print("/ ");
								}
							}
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
		8?
		/*
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
	
	*/
	/*	
		for (int c = 0; c < phraseOne.length(); c++){ 
			//for (int a = 0; a < phraseOne.length(); a++){
				if (correctChars.indexOf(phraseOne.charAt(c)) != -1){
					System.out.print(correctChars + " ");
				} else if (VALID_CHARACTERS.indexOf(phraseOne.charAt(c)) != -1){
					System.out.print("_ ");
				} else {
					System.out.print("/ ");
				}
			//}
		}
		
		*/	
		
		
		
		
	}
}

