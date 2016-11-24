package com.bayviewglen.assignment;

import java.util.Scanner;

public class AssignmentTwoCaitlyn {

	public static void main(String[] args) {

			
				// left to do: 1) switch turns 2) keep track of scores 3) change guess for 1 4) show used letters 5) if someone gets it one the first guess
				
				Scanner keyboard = new Scanner (System.in);
				
				final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // notes: indexOf (6 - 7 loops per)
				final String VALID_CHARACTERS_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
				final int MAX_GUESSES = 7; // number of total guesses
				final int guessedCharLen = 1; // length of choice (2) character
				String phraseOneSolution = null; // the guesser's solution in choice (1)
				String guessedCharacter = null; // for a character that was guessed in choice (2)
				String usedChars = ""; // for all characters that were guessed
				String correctChars = ""; // for correct guesses in choice (2)
				
				int round = 1;			// defines which round we are currently on - a round has both players taking a turn (phrase and guessing)
				final int ROUND_LIMIT = 5;
				boolean gameOver = false; // for when entire game ends
				boolean guessOver = false; // for end of each guess

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
				
				//for (int z = 0; z < 40; z++){		// removed by KD 11/24/2016
							
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
								validPhrase = true; 
								phraseOne = keyboard.nextLine().toUpperCase(); // changing phrase to upper case
								for (int b = 0; b < phraseOne.length() && validPhrase; b++){
									if(VALID_CHARACTERS_SPACE.indexOf(phraseOne.charAt(b)) == -1){ 
										validPhrase = false;
										System.out.println("Please enter a phrase containing only alphanumeric characters.");
									} 
								}
							}
							
							// ------------Guesser Starts Guessing------------
							/*
							boolean roundOver = false; // for 1 half round
							while (roundOver){
								System.out.println(playerOne + ": " + playerOneScore);
								System.out.println(playerTwo + ": " + playerTwoScore);
							}
							*/ // removed by KD because no one knows what it does 11/24/2016
							boolean halfRoundOver = false;
							while (!halfRoundOver){
								System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
																				
								// ------------For Each Guess------------
								
								//boolean guessOver = false; // for end of each guess
								//while (!guessOver){
								
									// ------------One Guess------------
									
									for (int i = 0; i < MAX_GUESSES; i++){ // to limit number of guesses at 7
										int guessCounter = 0; // to count number of guesses -- I need to use this or else i will increment a lot	
																										
										// ------------To Show Encrypted Message------------
										
										for (int c = 0; c < phraseOne.length(); c++){ 
											if (correctChars.indexOf(phraseOne.charAt(c)) != -1){
												System.out.print(correctChars + " ");
											} else if (VALID_CHARACTERS.indexOf(phraseOne.charAt(c)) != -1){
												System.out.print("_ ");
											} else {
												System.out.print("/ ");
											}
										}
										
										// ------------Choosing Between Choice (1) or (2)------------
										
										System.out.println();
										System.out.println(playerTwo + ", you have used " + i + " guess" + ((i > 1) || (i == 0) ? "es" : "") + ", would you like to (1) solve or (2) guess a character: ");
															
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
												
										phraseOneSolution = ""; // the guesser's solution
																					
										if (guessChoice.equals("1")){ // for choice (1) solution guess
											System.out.println(playerTwo + ", please enter your solution: ");
											phraseOneSolution = keyboard.nextLine();
											if (phraseOneSolution.substring(phraseOneSolution.length()).equals(phraseOne.substring(phraseOne.length()))){ //must come back to end this 1/2 round!!!!!!
												System.out.println("Congratulations " + playerTwo + "! You are correct."); // this doesn't work
												if (a == 0){
													playerTwoScore++;
												} else {
													playerOneScore++;
												}
												guessOver = false;
												halfRoundOver = false;
											} else {
												System.out.println(playerTwo + ", you are unfortunately incorrect."); 
												if (a == 0){
													playerTwoScore--;
												} else {
													playerOneScore--;
												}
												guessCounter++;
												guessOver = false;
											}	
											
										} else { // for choice (2) character guess
											System.out.println("Unused Characters: ");
											String unusedCharacters = ""; // the displayed unused / guessed characters
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
														System.out.println(guesser + ", please enter a single valid character (from \'Unused Characters\', not including spaces):");
													} else if (guessedCharacter.length() != 1){ 
														validGuessedCharacter = false; 
														System.out.println(guesser + ", please enter a \'single valid\' character (from \'Unused Characters\', not including spaces):");
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
												if (phraseOne.indexOf(guessedCharacter.charAt(f)) != -1){
													System.out.println(guesser + ", the character \'" + guessedCharacter + "\' is in the phrase.");
													guessCounter++;	
													if (a == 0){
														playerTwoScore++;
													} else {
														playerOneScore++;
													}
													usedChars += guessedCharacter;
													correctChars += guessedCharacter;
													//System.out.println(playerTwoScore); just checking
													guessOver = false;	
																						
												} else {
													System.out.println(guesser + ", the character \'" + guessedCharacter + "\' is not in the phrase.");
													usedChars += guessedCharacter;
													guessCounter++;
													if (a == 0){
														playerTwoScore--;
													} else {
														playerOneScore--;
													}
													guessOver = false;	
												}
																			
											} 
																		
										} // end of choice (2) character guess
									} // end of half round
								//} // end of each guess 
							} // end of 1 half round
							round++;
						} // end of 2 half rounds
						
						gameOver = (round > ROUND_LIMIT) && (playerOneScore != playerTwoScore);
					} // end of the whole entire game
			//	} // end of score keeping	removed by KD 11/24/2016
				
				keyboard.close();
				
			}
		}

		
	}

}
