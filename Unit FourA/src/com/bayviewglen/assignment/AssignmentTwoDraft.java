package com.bayviewglen.assignment;

import java.util.Scanner;

public class AssignmentTwoDraft {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner (System.in);
		
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // indexOf (6 - 7 loops per)
		final String VALID_CHARACTERS_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		final int guessTotal = 7; // number of total guesses
		boolean gotSolution = true; // for when guesser has guessed solution correctly

		System.out.println("------------HANGMAN------------");
		
		System.out.println("Get ready to play a two player game of Hangman!!");
		System.out.println();
		System.out.print("Player 1, please enter your name: ");
		String playerOne = keyboard.nextLine();
		System.out.println();
		System.out.print("Player 2, please enter your name: ");
		String playerTwo = keyboard.nextLine();
		System.out.println();	
		
		System.out.println(playerOne + " and " + playerTwo + ", are you ready for a little competition? Let's begin a game of Hangman... \n");
		
		System.out.println(playerOne + " will go first. " + playerOne + ", please enter a phrase for " + playerTwo + " to solve: ");
		String phraseOne = "";
		
		boolean valid = false;
		
		while (!valid){
			valid = true;
			phraseOne = keyboard.nextLine().toUpperCase(); // changing to upper case
			for (int i = 0; i < phraseOne.length() && valid; i++){
				if(VALID_CHARACTERS_SPACE.indexOf(phraseOne.charAt(i)) == -1){ 
					valid = false;
					System.out.println("Please enter a phrase containing only alphanumeric characters.");
				} 
			}
		}
		
		//--------------------------Guessing Time----------------------------
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Great! " + playerTwo + ", let's start guessing.");
		System.out.println();
		
		for (int i = 0; i < phraseOne.length(); i++){ 
			if (VALID_CHARACTERS.indexOf(phraseOne.charAt(i)) != -1){
				System.out.print("_ ");
			} else {
				System.out.print("/ ");
			}
		}
		
		int guessesUsed = 0; // number of guesses used
		
		/*
		for (int j = 0; guessUsed < guessTotal; j++){
			guessUsed += j;
		}
		*/
			
		System.out.println();
		System.out.println(playerTwo + ", you have used " + guessesUsed + " guesses, would you like to (1) solve or (2) guess a character: ");
		
		String guessChoice = ""; // for either choice 1 or 2
		boolean invalidChoice = true; 
		
		while (invalidChoice){ 
			guessChoice = keyboard.nextLine(); 
			if (guessChoice.equals("1") || guessChoice.equals("2")){
				invalidChoice = false;
			} else { 
				System.out.println(playerTwo + ", you must enter (1) to solve or (2) to guess a character: ");
				//guessChoice = keyboard.nextLine(); // for either choice 1 or 2
			} 
		}
		
		String phraseOneSolution = ""; // the guesser's solution
		boolean isSolution = true;
				
		while (isSolution){
			if (guessChoice.equals("2")){
				isSolution = false;
			} else {
				System.out.println(playerTwo + ", please enter your solution: ");
				phraseOneSolution = keyboard.nextLine();
				if (phraseOneSolution.equals(phraseOne)){ //must come back to end this 1/2 round
					System.out.println("Congratulations " + playerTwo + "! You are correct.");
					isSolution = false;
				} else {
					System.out.println(playerTwo + ", you are unfortunately incorrect."); 
					for (int i = 0; i < phraseOne.length(); i++){
						if (phraseOne.indexOf(phraseOneSolution.charAt(i)) != -1){
							System.out.print("_ ");
						} else {
							System.out.print("/ ");
						}
					}
					isSolution = false;
				}
			}
		}
		
		
		
		System.out.println(playerTwo + ", you have used " + guessesUsed + ", would you like to (1) solve or (2) guess a character: ");
		
		System.out.println("Unused Characters: ");
		String unusedCharacters = "";
		for (int i = 0; i < VALID_CHARACTERS.length(); i++){
			unusedCharacters += VALID_CHARACTERS.charAt(i) + " ";
		}
		System.out.println(unusedCharacters + " ");
		
		System.out.println(playerTwo + ", please enter a single character: "); // need to continue this part
		
		/*// for spaces shown in phrase
		for (int i = 0; i < phraseOne.length(); i++){
			if (phraseOne.indexOf(phraseOneSolution.charAt(i)) != -1){
				System.out.print("_ ");
			} else {
				System.out.print("/ ");
			}
		}
		*/
		
	
	
		
		//------------------If Player Entered Correct Character (True)---------------------
		
		/*
		for (int j = 0; j < choiceTotal; j++){
			if (guessChoice == 1){
				System.out.println(playerTwo + ", please enter your solution: ");
				String solutionOne = keyboard.nextLine(); // Player's solution guess 
				if (solutionOne.charAt(j) != phraseOne.charAt(j)){
					System.out.println(playerTwo + ", you are unfortunately incorrect.");
				} else {
					System.out.println("Congratulations " + playerTwo + "! You are correct.");
				}
			}
		}
		*/
		//should continue back into "what do you want 1 or 2

		}

}
