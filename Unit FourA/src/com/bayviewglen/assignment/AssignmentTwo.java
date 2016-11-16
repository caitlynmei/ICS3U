package com.bayviewglen.assignment;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner (System.in);
		
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // indexOf (6 - 7 loops per)
		final String VALID_CHARACTERS_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		final int guessTotal = 7; // number of total guesses
		final int choiceTotal = 2; // number of choices: (1) and (2)
		final String VALID_GUESS_CHOICES = "12"; // for choices (1) or (2)
		
		System.out.println("------------HANGMAN------------");
		
		System.out.println("Get ready to play a two player game of Hangman!!");
		System.out.println();
		System.out.print("Player 1, please enter your name: ");
		String playerOne = keyboard.nextLine();
		System.out.println();
		System.out.print("Player 2, please enter your name: ");
		String playerTwo = keyboard.nextLine();
		System.out.println();	
		
		System.out.println(playerOne + " and " + playerTwo + ", are you ready for a little competition? Let's begin a game of Hangman. \n");
		
		System.out.println(playerOne + " will go first. " + playerOne + ", please enter a phrase for " + playerTwo + " to solve: ");
		String phraseOne = ""; // why is this nothing??
		
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
		
		int guessUsed = 0; // number of guesses used
		
		/*
		for (int j = 0; guessUsed < guessTotal; j++){
			guessUsed += j;
		}
		*/
			
		System.out.println();
		System.out.println(playerTwo + ", you have used " + guessUsed + " guesses would you like to (1) solve or (2) guess a character: ");
		
		String guessChoice = "";
		String unusedCharacters = "";
		boolean invalidChoice = true; 
		
		while (invalidChoice){ 
			guessChoice = keyboard.nextLine(); // for either choice 1 or 2
			if (guessChoice.equals("1") || guessChoice.equals("2")){
				invalidChoice = false;
			} else { 
				System.out.println(playerTwo + ", you must enter (1) to solve or (2) to guess a character: ");
				//guessChoice = keyboard.nextLine(); // for either choice 1 or 2
			} 
		}
		
		boolean isSolution = true;
		
		while (isSolution){
			if (guessChoice.equals("1")){
				System.out.println(playerTwo + ", please enter your solution: ");
				if ()
			} else {
				if (guessChoice.equals("1")){
					System.out.println(playerTwo + ", please enter your solution: ");
					if ()		
			}
		}
		
		if (guessChoice.equals("2")){
			for (int j = 0; j < VALID_CHARACTERS.length(); j++){
				unusedCharacters += VALID_CHARACTERS.charAt(j) + " ";
			}
		
		System.out.println("Unused Characters: ");
		System.out.println(unusedCharacters + " ");
		System.out.println(playerTwo + ", please enter a single character: "); // need to continue this part
	
		
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
		
		/*
		
		while (iOne < capPhraseOne.length()){
			for (int jOne = 0; jOne < iOne; jOne++){
				if (capPhraseOne.charAt(iOne) == VALID_CHARACTERS.charAt(jOne)){
					System.out.println("Great! Let's start guessing."); //how do make it so only prints once?
				} iOne++;
				
				if (capPhraseOne.charAt(iOne) != VALID_CHARACTERS.charAt(iOne)) {
					System.out.println("Please enter a phrase containing only alphanumeric characters.");
				}
			} 
		}
		*/
		//trying to use indexOf and ASCII
		/*for (int i = 0; i < capPhraseOne.length(); i++){
			if ((capPhraseOne.indexOf(i)-65) == (VALID_CHARACTERS.indexOf(i))){
				System.out.println("Great! Let's start guessing.");
			} else {
				System.out.println("Nope");
			}
		}
		*/
		
		/*if (phraseOne.substring(phraseOne.length()).equals(VALID_CHARACTERS) || phraseOne.substring(phraseOne.length()).equals(VALID_CHARACTERS_SPACE)){
			System.out.println("Great! Let's start guessing.");
		} else if (phraseOne.substring(phraseOne.length()).equals(VALID_CHARACTERS_SPACE)){
			char SPACE = (char) phraseOne.indexOf(" ");
			SPACE = '/';
			System.out.println("Great! Let's start guessing.");
			
		} else {
			System.out.println("Please enter a phrase containg only alphanumeric characters.");
		}
		*/
		//System.out.println(phraseOne); // only for reference at the moment
		
		
		/*
		for (int i = 0; i < phrase.lenght(); i++){
			if (VALID_CHARACTER.indexOf(phras.charAt(i))==-1){
				
			}
		}
		*/
		
		}

}
