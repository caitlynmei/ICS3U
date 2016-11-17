package com.bayviewglen.assignment;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // notes: indexOf (6 - 7 loops per)
		final String VALID_CHARACTERS_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		//final int guessTotal = 7; // number of total guesses
		
		boolean gameOver = false; // for when entire game ends
		//boolean gotSolution = true; // for when guesser has guessed solution correctly

		System.out.println("------------HANGMAN------------");
		
		// Getting Player Names
		
		System.out.println("Get ready to play a two player game of Hangman!!");
		System.out.println();
		System.out.print("Player 1, please enter your name: ");
		String playerOne = keyboard.nextLine();
		System.out.println();
		System.out.print("Player 2, please enter your name: ");
		String playerTwo = keyboard.nextLine();
		System.out.println();	
		
		// ------------Setting Player Scores------------
		
		int playerOneScore = 0;
		int playerTwoScore = 0;
		
		// ------------Starting Game------------
		
		System.out.println(playerOne + " and " + playerTwo + ", are you ready for a little competition? Let's begin a game of Hangman... \n");
		
		while (!gameOver){ // for when the whole entire game ends
			
			// ------------Assigning Roles to Players------------
			
			String phraseMaker = ""; // to assign phrase making role to one player
			String guesser = ""; // to assign guesser role to one player
			
			for (int a = 0; a <= 1; a++){ // for 2 half rounds
				if (a == 0){
					phraseMaker = playerOne; // assigning phraseMaker to a player
					guesser = playerTwo; // assigning guesser to other player
				} else {
					phraseMaker = playerTwo;
					guesser = playerOne;
				}
				
				// ------------Phrase Maker Inputs Phrase------------
				
				System.out.println(phraseMaker + ", please enter a phrase for " + guesser + " to solve: ");
				String phraseOne = "";
			
				boolean validPhrase = false;
				while (!validPhrase){
					validPhrase = true; // Explain?
					phraseOne = keyboard.nextLine().toUpperCase(); // changing to upper case
					for (int i = 0; i < phraseOne.length() && validPhrase; i++){
						if(VALID_CHARACTERS_SPACE.indexOf(phraseOne.charAt(i)) == -1){ 
							validPhrase = false;
							System.out.println("Please enter a phrase containing only alphanumeric characters.");
						} 
					}
				}
				
				// ------------Guesser Starts Guessing------------
				
				boolean roundOver = false; // for 1 half round
				while (!roundOver){
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("Great! " + guesser + ", let's start guessing.");
					System.out.println();
					
					// ------------For One Guess------------ (fix this title)
					
					boolean guessOver = false; // for end of each guess
					while (!guessOver){
					
						// ------------To Show Encrypted Message------------
						
						for (int i = 0; i < phraseOne.length(); i++){ 
							if (VALID_CHARACTERS.indexOf(phraseOne.charAt(i)) != -1){
								System.out.print("_ ");
							} else {
								System.out.print("/ ");
							}
						}								
						
						// ------------Choosing Between Choice (1) or (2)------------
						
						int guessesUsed = 0; // number of guesses used
						
						System.out.println();
						System.out.println(playerTwo + ", you have used " + guessesUsed + " guesses, would you like to (1) solve or (2) guess a character: ");
											
						String guessChoice = ""; 
						boolean invalidChoice = true; 
						
						while (invalidChoice){ 
							guessChoice = keyboard.nextLine(); 
							if (guessChoice.equals("1") || guessChoice.equals("2")){
								invalidChoice = false;
							} else { 
								System.out.println(playerTwo + ", you must enter (1) to solve or (2) to guess a character: ");
							} 
						}
								
						String phraseOneSolution = ""; // the guesser's solution
						//boolean isSolution = true;
												
						if (guessChoice.equals("1")){ // for choice (1) solution guess
							System.out.println(playerTwo + ", please enter your solution: ");
							phraseOneSolution = keyboard.nextLine();
							if (phraseOneSolution.equals(phraseOne)){ //must come back to end this 1/2 round!!!!!!
								System.out.println("Congratulations " + playerTwo + "! You are correct.");
								//isSolution = false;
							} else {
								System.out.println(playerTwo + ", you are unfortunately incorrect."); 
								guessOver = false;
								//isSolution = false;
							}
						} else { // for choice (2) character guess
							System.out.println("Unused Characters: ");
							String unusedCharacters = ""; // the displayed unused / guessed characters
							for (int i = 0; i < VALID_CHARACTERS.length(); i++){
								unusedCharacters += VALID_CHARACTERS.charAt(i) + " ";
							}
							System.out.println(unusedCharacters + " ");
							System.out.println(guesser + ", please enter a single character: "); // need to continue this part
							
							String guessedCharacter = keyboard.nextLine();
							boolean validGuessedCharacter = false; // to check if guessed character is a single alphanumeric character
							while (!validGuessedCharacter){
								validGuessedCharacter = true;
								for (int i = 0; i < phraseOne.length() && validPhrase; i++){
									if((VALID_CHARACTERS.indexOf(phraseOne.charAt(i)) == -1) && (guessedCharacter.length() != 1)){ 
										validPhrase = false;
										System.out.println(guesser + ", please enter a single valid character (from \'Unused Characters\', not including spaces):");
									} 
								}
							}
							
							for (int i = 0; i < guessedCharacter.length(); i++){
								if (phraseOne.indexOf(guessedCharacter.charAt(i)) != -1){
									System.out.println(guesser + ", the character \'" + guessedCharacter + "\' is in the phrase.");
								} else {
									System.out.println(guesser + ", the character \'" + guessedCharacter + "\' is not in the phrase.");
								}
								guessOver = false;								
							} 
						} // end of choice (2) character guess
					} // end of each guess
				} // end of 1 half round
			} // end of 2 half rounds
		} // end of the whole entire game 
		
		keyboard.close();
		
	}
}
