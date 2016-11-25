package com.bayviewglen.assignment;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
		
		// left to do: 1) keep track of scores 2) show used letters 3) if someone gets it one the first guess 4) already used letters, ask to re-enter
		
		Scanner keyboard = new Scanner (System.in);
		
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // notes: indexOf (6 - 7 loops per)
		final String VALID_CHARACTERS_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		final int ROUND_LIMIT = 5;
		final int MAX_GUESSES = 7; // number of total guesses
		final int GUESSED_CHAR_LENGTH = 1; // choice (2): length of guessed character (which has to be 1)
		String phrase = ""; // the phraseMaker's message
		String phraseSolution = ""; // choice (1): the guesser's solution 
		String guessedCharacter = ""; // choice (1): a character that was guessed
		String usedChars = ""; // stores all characters that have been guessed
		String correctCharacter = ""; // choice (2): stores 1 correct guess
		String correctChars = ""; // choice (2): stores all correct guesses
		int round = 1;			// keeps track of which round we are currently on - a round has both players taking a turn (phrase and guessing)
		int guessCount = 0; // to count number of guesses
		boolean gameOver = false; // for when entire game ends
		
		System.out.println("------------HANGMAN------------");
		
		// ------------Getting Player Names------------
		
		System.out.println("Get ready to play a two player game of Hangman!!");
		System.out.println();
		System.out.print("Player 1, please enter your name: ");
		String playerOne = keyboard.nextLine();
		System.out.println();
		System.out.print("Player 2, please enter your name: ");
		String playerTwo = keyboard.nextLine();
		System.out.println();	
		
		// ------------Setting Player Scores------------
		
		int playerOneScore = 0;	// player one's score
		int playerTwoScore = 0; // player two's score
		int leftOverGuesses = MAX_GUESSES - guessCount; // number of guesses left over
		
			// ------------Starting Game------------
			
			// Introduction to rules of game
			System.out.println(playerOne + " and " + playerTwo + ", are you ready for a little competition? Let's begin a game of Hangman... \n");
			System.out.println("You will take turns giving each other a phrase to solve. Each player is allowed 7 guesses. During your turn as");
			System.out.println("guesser, you will be given the choice to either guess the solution to your friend's phrase at once or to guess");
			System.out.println("each individual character. Once all the 7 guesses are used up, the guesser for that round will be given one");
			System.out.println("final chance to guess the solution to the phrase. The player with highest score at the end of 5 rounds (unless");
			System.out.println("there's a tie, then winner of the tie-breaking round) will win!");
			System.out.println();
			
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
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					while (!halfRoundOver){
																		
						// ------------To Show Encrypted Message------------
						
						//int phraseCharLen = 0; // to count how many times a character appears in phraseMaker's phrase
						/* to count how many times a character appears in phraseMaker's phrase (e.g hiiiiiii)
						for (int k = 0; k < phrase.length(); k++){
							if (phrase.indexOf(correctCharacter.charAt(c)) != -1){
								phraseCharLen++;
							}
						}
						*/
						
						for (int c = 0; c < phrase.length(); c++){ 
							if (correctCharacter.indexOf(phrase.charAt(c)) != -1){
								System.out.print(correctCharacter + " ");
							} else if (VALID_CHARACTERS.indexOf(phrase.charAt(c)) != -1){
								System.out.print("_ ");
							} else {
								System.out.print("/ ");
							}						
						}
						
						// to end half round if guesser has guessed all characters of phraseMaker's phrase
						for (int p = 0; p < phrase.length(); p++){
							if (correctChars.indexOf(phrase.charAt(p)) != -1){
								if (a == 0){
									playerTwoScore++;
								} else {
									playerOneScore++;
								}
								solved = true;
							}
						}
												
						//System.out.println(correctChars); checking, need to figure out how to get repeating chars in too
						
						// ------------Choosing Between Choice (1) or (2)------------
								
						System.out.println();
						System.out.println(playerTwo + ", you have used " + guessCount + " guess" + ((guessCount > 1) || (guessCount == 0) ? "es" : "") + ", would you like to (1) solve or (2) guess a character: ");
													
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
														
							/*
							System.out.println("Unused Characters: ");
							String characterList = "A B C D E F G H I J K L M  N O P Q R S T U V W X Y Z 0 1 2 3 4 5 6 7 8 9";
							int index = characterList.indexOf("A");// do something
							String unusedCharacters = ""; // the displayed unused/guessed characters
										
							for (int d = 0; d < characterList.length(); d++){
								if (d == index){
									unusedCharacters += "_ ";
								} else {
									unusedCharacters += VALID_CHARACTERS.charAt(index) + " ";
								}
							}
							characterList = unusedCharacters;
							*/
												
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
									} else if (usedChars.indexOf(guessedCharacter) != -1){
										validGuessedCharacter = false;
										System.out.println(guesser + ", you have already guessed the character \'" + guessedCharacter + "\', please select again: "); // to check if guessed character was already used
									} 
								}
							}
								
							//boolean validMessageChar = false; // to update encrypted message
							for (int f = 0; f < GUESSED_CHAR_LENGTH; f++){
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
						guessCount++;
						halfRoundOver = guessCount > MAX_GUESSES-1 || solved;
								
						if (guessCount == MAX_GUESSES){
							System.out.println(guesser + ", you have used up your guesses. Please enter your solution: ");
							String finalSolution = keyboard.nextLine().toUpperCase();
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
						
						/* how to stop previous stored info from being carried on??
						if (guessCount > MAX_GUESSES){
							guessCount = 0; // to re-establish the number of guesses used as 0 for new round
							correctChars = ""; // to re-establish the strings for storing the correct guessed characters as empty for new round
							correctCharacter = ""; // same as line above
						}
						*/
											
					} // end of one half round
					round++;
																					
					System.out.println("\n\n");
					System.out.println("Current Scores: ");
					System.out.println("---------------");
					System.out.println(playerOne + ": " + playerOneScore);
					System.out.println(playerTwo + ": " + playerTwoScore);
					System.out.println();
										
				} // end of 2 half rounds
				gameOver = (round > ROUND_LIMIT) && (playerOneScore != playerTwoScore);
				
			} // end of the whole entire game
		
		if (playerOneScore > playerTwoScore){
			System.out.println(playerOne + " is the winner!!");
		} else {
			System.out.println(playerTwo + " is the winner!!");
		}
		
		System.out.println("Game is now over. Thanks for playing! :)");
		
		keyboard.close();
		
	}
}
