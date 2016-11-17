package com.bayviewglen.assignment;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // notes: indexOf (6 - 7 loops per)
		final String VALID_CHARACTERS_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		final int guessTotal = 7; // number of total guesses
		
		boolean gameOver = false; // for when entire game ends
		boolean gotSolution = true; // for when guesser has guessed solution correctly

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
		
		while (!gameOver){
			
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
								
				System.out.println(phraseMaker + ", please enter a phrase for " + guesser + " to solve: ");
				String phraseOne = "";
			
				boolean validPhrase = false;
				while (!validPhrase){
					validPhrase = true;
					phraseOne = keyboard.nextLine().toUpperCase(); // changing to upper case
					for (int i = 0; i < phraseOne.length() && validPhrase; i++){
						if(VALID_CHARACTERS_SPACE.indexOf(phraseOne.charAt(i)) == -1){ 
							validPhrase = false;
							System.out.println("Please enter a phrase containing only alphanumeric characters.");
						} 
					}
				}
				
				boolean roundOver = false;
				while (!roundOver){
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("Great! " + guesser + ", let's start guessing.");
					System.out.println();
					
					for (int i = 0; i < phraseOne.length(); i++){ 
						if (VALID_CHARACTERS.indexOf(phraseOne.charAt(i)) != -1){
							System.out.print("_ ");
						} else {
							System.out.print("/ ");
						}
					}								
										
					String guessChoice = ""; // for either choice 1 or 2
					boolean invalidChoice = true; 
					
					while (invalidChoice){ 
						guessChoice = keyboard.nextLine(); 
						if (guessChoice.equals("1") || guessChoice.equals("2")){
							invalidChoice = false;
						} else { 
							System.out.println(playerTwo + ", you must enter (1) to solve or (2) to guess a character: ");
						} 
					}
													
					int guessesUsed = 0; // number of guesses used
					
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
					//end
					
				}
				
	
			}
		}
	}
}
