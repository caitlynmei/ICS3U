package com.bayviewglen.assignment;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner (System.in);
	
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
		final String VALID_CHARACTERS_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		final int HALF_ROUND_LIMIT = 10; // maximum number of half rounds unless there's a tie
		final int MAX_GUESSES = 7; // maximum of total guesses
		final int MAX_POINTS_PER_ROUND = 8; // maximum points earned per round
		final int GUESSED_CHAR_LENGTH = 1; // choice (2): length of guessed character (which has to be 1)
		String phrase = ""; // the phraseMaker's message
		String phraseSolution = ""; // choice (1): the guesser's solution
		String guessedCharacter = ""; // choice (1): a character that was guessed
		String usedChars = ""; // stores all characters that have been guessed
		String encryptedMessage = ""; // string that stores the encrypted message phraseMaker creates
		int round = 1; // keeps track of which round we are currently on - a round has both players taking a turn (phrase and guessing)
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

			// ------------Starting Game------------
			
			// Introduction to rules of game
			System.out.println(playerOne + " and " + playerTwo + ", are you ready for a little competition? Let's begin a game of Hangman... \n");
			System.out.println("You will take turns giving each other a phrase to solve. Each player is allowed 7 guesses. During your turn as");
			System.out.println("guesser, you will be given the choice to either guess the solution to your friend's phrase at once or to guess");
			System.out.println("each individual character. Once all the 7 guesses are used up, the guesser for that round will be given one");
			System.out.println("final chance to guess the solution to the phrase. The player with highest score at the end of 5 rounds (unless");
			System.out.println("there's a tie, then winner of the tie-breaking round) will win! \n");
			System.out.println("Each correct character guessed or correct solution guessed is 1 point. Unused guesses are also counted as points.");
			System.out.println("Good luck!!");
			System.out.println();
			
			while (!gameOver){ // for when the whole entire game ends
				
				// ------------Assigning Roles to Players------------
				
				String phraseMaker = ""; // to assign phrase making role to one player
				String guesser = ""; // to assign guesser role to another player
				
				for (int a = 0; a <= 1; a++){ // to alternate between players for each round
					if (a == 0){
						phraseMaker = playerOne; // assigning phraseMaker to a player
						guesser = playerTwo; // assigning guesser to other player
					} else {
						phraseMaker = playerTwo;
						guesser = playerOne;
					}
					
					boolean solved = false; // to end when guesser has guessed the solution correctly
					
					// ------------Phrase Maker Input Phrase------------
					
					System.out.println(phraseMaker + ", please enter a phrase for " + guesser + " to solve: ");
									
					boolean validPhrase = false; // to check if phraseMaker entered valid characters for phrase
					while (!validPhrase){
						validPhrase = true; 
						phrase = keyboard.nextLine().toUpperCase(); 
						for (int b = 0; b < phrase.length() && validPhrase; b++){
							if(VALID_CHARACTERS_SPACE.indexOf(phrase.charAt(b)) == -1){ 
								validPhrase = false;
								System.out.println("Please enter a phrase containing only alphanumeric characters:");
								System.out.println("(*Hint: \'alphanumeric\' characters are: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 0 1 2 3 4 5 6 7 8 9)");
							} 
						}
					}
					
					// the displayed characters which the guesser may choose from 
					String characterList = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 0 1 2 3 4 5 6 7 8 9"; 

					// ------------Guesser Starts Guessing------------
					
					boolean halfRoundOver = false; // to end when one half round is over
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

					while (!halfRoundOver){
																		
						// ------------To Show Encrypted Message------------
						
						// to update and show encrypted message
						encryptedMessage = "";
						for (int b = 0; b < phrase.length(); b++){ 
							if (usedChars.indexOf(phrase.charAt(b)) != -1){
								encryptedMessage += usedChars.charAt(usedChars.indexOf(phrase.charAt(b))) + " ";
								//codedMessage += phrase.charAt(b); // simpler version of above line
							} else if (VALID_CHARACTERS.indexOf(phrase.charAt(b)) != -1){
								encryptedMessage += "_ ";
							} else {
								encryptedMessage += "/ ";
							}
						}
						
						System.out.println(encryptedMessage);
					
						// ------------Choosing Between Choice (1) or (2)------------
								
						System.out.println(guesser + ", you have used " + guessCount + " guess" + ((guessCount > 1) || (guessCount == 0) ? "es" : "") + ", would you like to (1) solve or (2) guess a character: ");
													
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
								for (int c = 0; c < guessedCharacter.length() && validGuessedSolution; c++){
									if (VALID_CHARACTERS_SPACE.indexOf(phraseSolution.charAt(c)) == -1){ 
										validGuessedSolution = false; 
										System.out.println(guesser + ", please enter a valid phrase with only alphanumeric characters (you can use spaces): ");
									} 
								}
							}
									
							if (phraseSolution.equals(phrase)){ 
								System.out.println("Congratulations " + guesser + "! You are correct."); // this doesn't work
								if (guessCount == 0){ // if guesser gets solution on first try
									if (a == 0){
										playerTwoScore += MAX_POINTS_PER_ROUND;
									} else {
										playerOneScore += MAX_POINTS_PER_ROUND;
									}
								} else if (guessCount == 6){
									if (a == 0){
										playerTwoScore += MAX_GUESSES - guessCount;
									} else {
										playerOneScore += MAX_GUESSES - guessCount;
									}
								} else { // if guesser don't get solution on first try
									if (a == 0){
										playerTwoScore += MAX_GUESSES - guessCount;
									} else {
										playerOneScore += MAX_GUESSES - guessCount;
									}
								} 
								solved = true;
							} else {
								System.out.println(guesser + ", you are unfortunately incorrect."); 
							}	
							
						// Choice (2): character guess	
						} else { 
							// to display unused characters
							System.out.println("Unused Characters: ");
							String displayedCharacters = ""; // the displayed unused and guessed characters
							System.out.println(characterList);
									
							System.out.println(guesser + ", please enter a single character: "); 
														
							guessedCharacter = "";								
							boolean validGuessedCharacter = false; // to check if guessed character is a single alphanumeric character
							while (!validGuessedCharacter){
								validGuessedCharacter = true;
								guessedCharacter = keyboard.nextLine().toUpperCase(); // changing guess of character to upper case
								for (int c = 0; c < guessedCharacter.length() && validGuessedCharacter; c++){
									if (guessedCharacter.length() != 1 && VALID_CHARACTERS.indexOf(guessedCharacter.charAt(c)) == -1){ 
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
							
							// to print and update the displayed characters guesser may use
							int index = 0;
							index = characterList.indexOf(guessedCharacter);
							for (int c = 0; c < characterList.length(); c++){
								if (c == index){
									displayedCharacters += "_";
								} else {
									displayedCharacters += characterList.charAt(c);
								}
							}
							characterList = displayedCharacters;
							
							// to check if guessed character is in message
							for (int c = 0; c < GUESSED_CHAR_LENGTH; c++){
								if (phrase.indexOf(guessedCharacter.charAt(c)) != -1){
									System.out.println(guesser + ", the character \'" + guessedCharacter + "\' is in the phrase.");
									if (a == 0){
										playerTwoScore++;
									} else {
										playerOneScore++;
									}
								} else {
									System.out.println(guesser + ", the character \'" + guessedCharacter + "\' is not in the phrase.");
								}
								usedChars += guessedCharacter;
							}
																										
						} // end of choice (2) character guess
						guessCount++; // to count number of guesses per half round
						if (guessCount > MAX_GUESSES-1 || solved){ // when a half round is finished
							halfRoundOver = true;
						}
					
					} // end of one half round 
					round++;
					
					// ------------To Update and Show Encrypted Message One Last Time------------
					if (guessCount == MAX_GUESSES && !solved){ // final solution guess given
						encryptedMessage = "";
						for (int b = 0; b < phrase.length(); b++){ 
							if (usedChars.indexOf(phrase.charAt(b)) != -1){
								encryptedMessage += usedChars.charAt(usedChars.indexOf(phrase.charAt(b))) + " ";
							} else if (VALID_CHARACTERS.indexOf(phrase.charAt(b)) != -1){
								encryptedMessage += "_ ";
							} else {
								encryptedMessage += "/ ";
							}
						}
						// ------------To Check if Final Solution is Correct------------
						System.out.println(encryptedMessage);
						System.out.println(guesser + ", you have used up your guesses. Please enter your solution: ");
						String finalSolution = keyboard.nextLine().toUpperCase();
						if (finalSolution.equals(phrase)){ 
							System.out.println("Congratulations " + guesser + "! You are correct."); 
							solved = true;
							if (a == 0){
								playerTwoScore += 1 + (MAX_GUESSES - guessCount);
							} else {
								playerOneScore += 1 + (MAX_GUESSES - guessCount);
							}
						} else {
							System.out.println(guesser + ", good try but you are unfortunately incorrect. " + phraseMaker + " entered \"" + phrase + "\".");
						}
					}
					// ------------Scores------------
					System.out.println("\n\n");
					System.out.println("Current Scores: ");
					System.out.println("---------------");
					System.out.println(playerOne + ": " + playerOneScore);
					System.out.println(playerTwo + ": " + playerTwoScore);
					System.out.println();
					
					// ------------Re-establishing Storing Strings------------
					guessCount = 0; // to re-establish the number of guesses used as 0 for new round
					guessedCharacter = ""; // to re-establish the string for storing the current guessed character
					usedChars = ""; // to re-establish the string for storing the used characters
								
				} // end of alternate between players for each round
				if ((round > HALF_ROUND_LIMIT) && (playerOneScore == playerTwoScore)){
					round --;
				} else {
					gameOver = (round > HALF_ROUND_LIMIT) && (playerOneScore != playerTwoScore);
				}
				
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
