package com.bayviewglen.assignment;

import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner (System.in);
		
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // indexOf (6 - 7 loops per)
		final String VALID_CHARACTERS_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
	
		System.out.println("------------HANG MAN------------");
		
		System.out.println("Get ready to play a two player game of Hangman!!");
		System.out.println();
		System.out.print("Player 1, please enter your name: ");
		String playerOne = keyboard.nextLine();
		System.out.println();
		System.out.print("Player 2, please enter your name: ");
		String playerTwo = keyboard.nextLine();
		System.out.println();	
		
		System.out.println(playerOne + " and " + playerTwo + ", are you ready for a little competition?\n");
		
		System.out.println(playerOne + " will go first. " + playerOne + ", please enter a phrase containg only alphanumeric characters: ");
		String phraseOne = "";
		
		String capPhraseOne = phraseOne.toUpperCase(); //Changing all characters into upper case
		
		String x = "";
		
		boolean valid = false;
		
		while (!valid){
			valid = true;
			phraseOne = keyboard.nextLine().toUpperCase();
			for (int i = 0; i < phraseOne.length() && valid; i++){
				if(VALID_CHARACTERS.indexOf(phraseOne.charAt(i))==-1){
					valid = false;
					System.out.println("Please enter a phrase containing only alphanumeric characters.");
				} 
			}
		}
		
		System.out.println("Happy!");
		
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
