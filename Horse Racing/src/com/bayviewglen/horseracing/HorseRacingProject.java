package com.bayviewglen.horseracing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HorseRacingProject {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		introMessage(keyboard);
		
		System.out.println();
		
		String[] horses = getHorses();
		String[] players = getPlayers();
		String[] playerNames = getPlayerNames(players);
		int[] playerWallets = getPlayerWallets(players);
		
				
		// playerNames array
		// playerWallets array
		
		// or a 2D array with name / wallet (stored in strings, convert to int)
		
		boolean gameOver = false;
		while (!gameOver){
			doRace(horses, playerNames, playerWallets);
			gameOver = promptForGameOver(keyboard);
		}
		
		updatePlayerData(playerNames, playerWallets);
		closingMessage();
		
		keyboard.close();
	
	}

	public static void introMessage(Scanner keyboard) {
		System.out.println("Howdy everyone! Who's ready for some horse racing and betting?");
		System.out.print("Enter (0) to begin: ");
		String userPromptIntro = "";
		
		boolean invalid = false; // check if user didn't enter 0
		while (!invalid){
			userPromptIntro = keyboard.nextLine();
			if (userPromptIntro.equals("0")){
				invalid = true;
			} else {
				System.out.print("You must enter 0: ");
			}
		}
		
		if (userPromptIntro.equals("0")){
			System.out.println();
			System.out.println("Great! Let's start!!");
		}
		
		/* for not working method below
		if (checkInvalidInputforIntro(userPrompt, keyboard).equals("0")){
			System.out.println("Let's start!!");
		}
		*/
		
		System.out.println("Y\'all going to start with $1000 in your wallets. \n");
		
	}
	
	/* ---------------- check for invalid startRace prompt ------------------ (mine)
			
	private static String checkInvalidInputforIntro(String userPrompt, Scanner keyboard) {
		boolean invalid = false; // check if user didn't enter 0
		
		while (!invalid){
			if (userPrompt.equals("0")){
				invalid = true;
			} else {
				System.out.println("You must enter 0:");
			}
		}
		
		/*
		while(!isValid){
			try{
				if (userPrompt.equals("0")) 
					isValid = true;
			} catch(Exception ex){
				
			}
		}
		//
		
		return userPrompt;
		
	}
	*/
	
	// ---------------- startRace Method --------------------------
	
	public static int startRace(int[] horsesInRace) {
		return 0; 
	}
	
	public static boolean promptForGameOver(Scanner keyboard) { // ***got to fix this later
		//System.out.println("Alright! Good job to whoever bet on " + winningHorse + "!");
		System.out.println("Would you like to continue playing another round? ");
		System.out.print("If yes, please enter (1). If no, please enter (2): ");
		
		String userPromptGameOver = "";
		
		boolean invalid = false; // check if user entered something other than 1 or 2
		while (!invalid){
			userPromptGameOver = keyboard.nextLine();
			if (userPromptGameOver.equals("1") || userPromptGameOver.equals("2")){
				invalid = true;
			} else {
				System.out.print("You must enter (1) for playing another round or (2) to end the game: ");
			}
		}
		
		if (userPromptGameOver.equals("1")){
			System.out.println();
			System.out.println("Great! Get ready for another round!\n\n");
			return false;
		} else if (userPromptGameOver.equals("2")){
			return true;
		}
		return true;
	}

// ----------------- doRace Method ----------------------
	
	public static void doRace(String[] horses, String[] playerNames, int[] playerWallets) {
		// horsesInRace contains the index of the horses from the master horse array		
		int[] horsesInRace = getHorsesInRace(horses);
				
		System.out.println();
		System.out.println("#|Player Names          |     Wallet");
		
		// print chart with player names and wallets
		for (int i=0; i<playerNames.length; i++){
			System.out.println("-|----------------------|------------");
			System.out.printf(i+1 + "| %-20s | %10d \n", playerNames[i], playerWallets[i]);
		}
		
		System.out.println();
		System.out.print("Please choose a player (enter your number): ");
		
		// stuff for taking in each player's choice and bet and wallet stuff
		
		System.out.println();
		System.out.println("These are the horses participating in today's race... ");
		System.out.println("");
		
		System.out.println("#|Horse Names           |");
		
		// print chart with horses in this round
		for (int i=0; i<horsesInRace.length; i++){
			System.out.println("-|----------------------|-");
			System.out.printf(i+1 + "| %-20s | \n", horses[horsesInRace[i]]); 
		}
		
		System.out.println();
		
		// 2D array with column 0 = betAmount; column 1 = horseIndex(from horseInRace)
		int[][] playerBets = getPlayerBets(playerNames, playerWallets, horsesInRace);
		int winningHorse = startRace(horsesInRace);
		
		payOutBets(playerBets, playerWallets, playerNames, winningHorse);
	}

	public static void payOutBets(int[][] playerBets, int[] playerWallets, String[] playerNames, int winningHorse) {
		// TODO Auto-generated method stub
		
	}

// -------------- updatePlayerData Method --------------------
	
	public static void updatePlayerData(String[] playerNames, int[] playerWallets) {
		// TODO Auto-generated method stub
		
	}


	public static int[][] getPlayerBets(String[] playerNames, int[] playerWallets, int[] horsesInRace) {
		// check that you can't bet more than you have
		return null;
	}

// ------------------ getHorsesInRace (selecting horses to compete in the race) -----------
	
	public static int[] getHorsesInRace(String[] horses) {
		int numHorsesInRace = 0;
		int minNumHorsesInRace = 5;
		int maxNumHorsesInRace = 8;
		int horsesLength = horses.length;
		
		numHorsesInRace = (int)(Math.random() * (maxNumHorsesInRace - minNumHorsesInRace) + minNumHorsesInRace);
		
		int[] horsesInRace = new int[numHorsesInRace]; // holds indices of chosen horses in horse array
		
		for (int i=0; i<numHorsesInRace; i++){
			horsesInRace[i] = (int)((Math.random() * horsesLength) + 1);
		}
		
		System.out.println("HorsesInRace int array " + Arrays.toString(horsesInRace));
		
		return horsesInRace; // ***** Question: Why won't it take it in? 
							 // ***** Answer: Because indexes are ints silly. Not String. :D
								
		// randomizer
		// how to get horse name: horses[horsesInRace[0]]
	}


// -------------------- getPlayers Method ---------------------------
	
	public static String[] getPlayers(){
		String[] players = null;
		try {
			Scanner keyboard = new Scanner(new File("Input/players.dat"));
			int numPlayers = Integer.parseInt(keyboard.nextLine());
			players = new String[numPlayers];
			
			for (int i=0; i<numPlayers; i++){
				players[i] = keyboard.nextLine();
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//System.out.println("players " + Arrays.toString(players));
		
		return players;
		
	}

// ----------------- getHorses Method -----------------
	
	public static String[] getHorses() {
		String[] horses = null;
		try {
			Scanner keyboard = new Scanner(new File("Input/horses.dat"));
			int numHorses = Integer.parseInt(keyboard.nextLine()); // take string and turn it into int
			horses = new String[numHorses];
			
			for (int i = 0; i<numHorses; i++){
				horses[i] = keyboard.nextLine();
			}
				
		} catch (FileNotFoundException e) { // in case file isn't there
			e.printStackTrace(); 
		}
			
		//System.out.println("here " + Arrays.toString(horses));
		// System.out.println("should be 86th " + horses[85]);
		// ^ remember, should be length - 1 for last index
		
		return horses;
	}


	// ---------------- getPlayerNames -------------------------
		
		public static String[] getPlayerNames(String[] players) {
			String[] playerNames = new String[players.length];
			
			for (int i=0; i<players.length; i++){
				int j;
				for (j=0; j<players[i].length(); j++){
					char currentChar = players[i].charAt(j);
					if (currentChar >= '0' && currentChar <= '9')
						break;
				}
				playerNames[i] = players[i].substring(0, j-1);
			}
			
			//System.out.println("playerNames" + Arrays.toString(playerNames));
			
			return playerNames;
			
		}
		
		// ------------------ getPlayersWallets ---------------- 
		
		public static int[] getPlayerWallets(String[] players) {
			int[] playerWallets = new int[players.length];	
			
			for (int i=0; i<players.length; i++){
				int j;
				for (j=0; j<players[i].length(); j++){
					char currentChar = players[i].charAt(j);
					if (currentChar >= '0' && currentChar <= '9')
						break;
				}
				playerWallets[i] = Integer.parseInt(players[i].substring(j));
			}
			
			System.out.println("playerWallet stuff" + Arrays.toString(playerWallets));
			
			return playerWallets;
		}

	
// ---------- checks if horse is already in the race ---------
	// sequential search
	
	public static boolean alreadyInRace(int horse, int[] horsesInRace){
			
		for (int i = 0; i < horsesInRace.length-1; i++){
			if (horsesInRace[i] == horse){
				return true;
			}
		}
				
		return false;
	}
		

	
	// ---- checks if invalid input ----------
	public int getvalidInputforWallet(int min, int max, Scanner keyboard){ // pass in range (0, wallet)
		boolean isValid = false;
		int x = 0;
		while(!isValid){
			try{
				x = Integer.parseInt(keyboard.nextLine());
				if (x >= min && x <= max) 
					isValid = true;
			} catch(Exception ex){
		
			}
		}
		
		return x;
	}
	
// ------------- closingMessage Method ------------
	public static void closingMessage() {
		System.out.println("Alright! Thanks for playing!! :)");
	}
		
}
