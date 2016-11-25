package com.bayviewglen.assignment;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
		
		// left to do: 1) keep track of scores 2) show used letters 3) if someone gets it one the first guess 4) already used letters, ask to re-enter
		
		Scanner keyboard = new Scanner (System.in);
		
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // notes: indexOf (6 - 7 loops per)
		final String VALID_CHARACTERS_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		final int MAX_GUESSES = 7; // number of total guesses
		final int guessedCharLen = 1; // length of choice (2) character
		String phrase = ""; // the phraseMaker's message
		String phraseSolution = ""; // the guesser's solution in choice (1)
		String guessedCharacter = ""; // for a character that was guessed in choice (2)
		String usedChars = ""; // for all characters that were guessed
		String correctCharacter = ""; // stores 1 correct guess in choice (2)
		String correctChars = ""; // stores all correct guesses in choice (2)
		
		int round = 1;			// defines which round we are currently on - a round has both players taking a turn (phrase and guessing)
		final int ROUND_LIMIT = 5;
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
		
		int playerOneScore = 0;		// was 7 changed by KD 11/24/2016
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
					
					boolean solved = false; // to end when guesser has guessed the solution correctly
					
					// ------------Phrase Maker Inputs Phrase------------
					
					System.out.println(phraseMaker + ", please enter a phrase for " + guesser + " to solve: ");
									
					boolean validPhrase = false;
					while (!validPhrase){
						validPhrase = true; 
						phrase = keyboard.nextLine().toUpperCase(); // changing phrase to upper case
						for (int b = 0; b < phrase.length() && validPhrase; b++){
							if(VALID_CHARACTERS_SPACE.indexOf(phrase.charAt(b)) == -1){ 
								validPhrase = false;
								System.out.println("Please enter a phrase containing only alphanumeric characters:");
								System.out.println("(*Hint: \'alphanumeric\' characters are: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 0 1 2 3 4 5 6 7 8 9)");
							} 
						}
					}
					
					// ------------Guesser Starts Guessing------------
					
					boolean halfRoundOver = false; // to end when one half round is over
					int i = 0; // to count number of guesses
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					while (!halfRoundOver){
																		
						// ------------To Show Encrypted Message------------
						
						//int phraseCharLen = 0; // to count how many times a character appears in phraseMaker's phrase
											
						for (int c = 0; c < phrase.length(); c++){ 
							
							/* to count how many times a character appears in phraseMaker's phrase (e.g hiiiiiii)
							for (int k = 0; k < phrase.length(); k++){
								if (phrase.indexOf(correctCharacter.charAt(c)) != -1){
									phraseCharLen++;
								}
							}
							*/
							if (VALID_CHARACTERS.indexOf(phrase.charAt(c)) != -1){
								System.out.print("_ ");
							} else {
								System.out.print("/ ");
							}	
					
						}
						/*
						if (correctChars.length() == phrase.length()){
							if (a == 0){
								playerTwoScore++;
							} else {
								playerOneScore++;
							}
							solved = true;
						}
						*/
						// ------------Choosing Between Choice (1) or (2)------------
								
						System.out.println();
						System.out.println(playerTwo + ", you have used " + i + " guess" + ((i > 1) || (i == 0) ? "es" : "") + ", would you like to (1) solve or (2) guess a character: ");
													
						String guessChoice = ""; // for guesser's decision in choice (1) or choice (2)
						boolean invalidChoice = true; // to check if the entered choice is (1) or (2)
						while (invalidChoice){ 
							guessChoice = keyboard.nextLine(); 
							if (guessChoice.equals("1") || guessChoice.equals("2")){
								invalidChoice = false;
							} else { 
								System.out.println(guesser + ", you must enter (1) to solve or (2) to guess a character: ");
							} 
						}
								
						// Choice (1): solution guess
						phraseSolution = ""; // the guesser's solution
						if (guessChoice.equals("1")){ // for choice (1)
							System.out.println(guesser + ", please enter your solution: ");
									
							phraseSolution = "";								
							boolean validGuessedSolution = false; // to check if guessed character is a single alphanumeric character
							while (!validGuessedSolution){
								validGuessedSolution = true;
								phraseSolution = keyboard.nextLine().toUpperCase(); // changing guess of character to upper case
								for (int e = 0; e < guessedCharacter.length() && validGuessedSolution; e++){
									if (VALID_CHARACTERS_SPACE.indexOf(phraseSolution.charAt(e)) == -1){ 
										validGuessedSolution = false; 
										System.out.println(guesser + ", please enter a valid phrase with only alphanumeric characters (you can use spaces): ");
									} 
								}
							}
									
							if (phraseSolution.equals(phrase)){ 
								System.out.println("Congratulations " + guesser + "! You are correct."); // this doesn't work
								if (a == 0){
									playerTwoScore++;
								} else {
									playerOneScore++;
								}
								solved = true;
							
							} else {
								System.out.println(playerTwo + ", you are unfortunately incorrect."); 
							}	
							
							// Choice (2): character guess	
						} else { 
							System.out.println("Unused Characters: ");
							String unusedCharacters = ""; // the displayed unused/guessed characters
							for (int d = 0; d < VALID_CHARACTERS.length(); d++){
								unusedCharacters += VALID_CHARACTERS.charAt(d) + " ";
							}
							System.out.println(unusedCharacters);
							System.out.println(guesser + ", please enter a single character: "); // need to continue this part
														
							guessedCharacter = "";								
							boolean validGuessedCharacter = false; // to check if guessed character is a single alphanumeric character
							while (!validGuessedCharacter){
								validGuessedCharacter = true;
								guessedCharacter = keyboard.nextLine().toUpperCase(); // changing guess of character to upper case
								for (int e = 0; e < guessedCharacter.length() && validGuessedCharacter; e++){
									if (guessedCharacter.length() != 1 && VALID_CHARACTERS.indexOf(guessedCharacter.charAt(e)) == -1){ 
										validGuessedCharacter = false; 
										System.out.println(guesser + ", please enter a single valid alphanumberic character (don't use spaces):");
									} else if (guessedCharacter.length() != 1){ 
										validGuessedCharacter = false; 
										System.out.println(guesser + ", please enter a \'single\' valid alphanumeric character (don't use spaces):");
									} 
								}
							}
									
							/*
							boolean alreadyGuessed = false; // to check if guessed character was already used
							while (!alreadyGuessed){
								for (int x = 0; x < usedChars.length(); x++){
									if (usedChars.indexOf(guessedCharacter.charAt(x)) != -1){
										System.out.println(guesser + ", you have already guessed the character \'" + guessedCharacter + "\', please select again: ");
										alreadyGuessed = true;
									}
								}
							}
							*/
									
							//boolean validMessageChar = false; // to update encrypted message
							for (int f = 0; f < guessedCharLen; f++){
								if (phrase.indexOf(guessedCharacter.charAt(f)) != -1){
									System.out.println(guesser + ", the character \'" + guessedCharacter + "\' is in the phrase.");
									if (a == 0){
										playerTwoScore++;
									} else {
										playerOneScore++;
									}
									usedChars += guessedCharacter;
									correctCharacter = guessedCharacter;
									correctChars += guessedCharacter;
									//System.out.println(playerTwoScore); just checking
											
								} else {
									System.out.println(guesser + ", the character \'" + guessedCharacter + "\' is not in the phrase.");
									usedChars += guessedCharacter;
								}
							} 
						} // end of choice (2) character guess
						i++;
						halfRoundOver = i > MAX_GUESSES-1 || solved;
								
						if (i == MAX_GUESSES){
							System.out.println(guesser + ", you have used up your guesses. Please enter your solution: ");
							String finalSolution = keyboard.nextLine();
							if (finalSolution.equals(phrase)){ 
								System.out.println("Congratulations " + guesser + "! You are correct."); 
								solved = true;
								if (a == 0){
									playerTwoScore++;
								} else {
									playerOneScore++;
								}
							} else {
								System.out.println(guesser + ", you are unfortunately incorrect."); 
							}
						}
					} // end of one half round
					round++;
					
					System.out.println();
					System.out.println();
					System.out.println("Current Scores: ");
					System.out.println("---------------");
					System.out.println(playerOne + ": " + playerOneScore);
					System.out.println(playerTwo + ": " + playerTwoScore);
					System.out.println();
										
				} // end of 2 half rounds
				gameOver = (round > ROUND_LIMIT) && (playerOneScore != playerTwoScore);
			} // end of the whole entire game
		
		keyboard.close();
		
	}
}
