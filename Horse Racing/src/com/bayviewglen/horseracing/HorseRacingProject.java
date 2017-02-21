package com.bayviewglen.horseracing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HorseRacingProject {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		introMessage();
		String[] horses = getHorses();
		String[] players = getPlayers();
		String[] playerNames = getPlayerNames(players);
		int[] playerWallets = getPlayerWallets();
		
				
		// playerNames array
		// playerWallets array
		
		// or a 2D array with name / wallet (stored in strings, convert to int)
		
		boolean gameOver = false;
		while (!gameOver){
			doRace(horses, playerNames, playerWallets);
			gameOver = promptForGameOver();
		}
		
		updatePlayerData(playerNames, playerWallets);
		closingMessage();
	
	}

	public static void introMessage() {
		System.out.println("Howdy everyone! Who's ready for the horse race and some betting?");
		System.out.println("Let's start!!");
		
	}

	public static boolean promptForGameOver() {
		//System.out.println("Alright! Good job to whoever bet on " + winningHorse + "!");
		System.out.println("Would you like to continue playing another round? ");
		System.out.println("If yes, please enter \"1\". If no, please enter \"2\". ");
		
		Scanner keyboard = null; //check
		int userPrompt = keyboard.nextInt();
		
		// catch if user enters int other than 1 or 2
		
		if (userPrompt == 1){
			return true;
		} else if (userPrompt == 2){
			return false;
		}
		
		return false;
	}

// ----------------- doRace Method ----------------------
	
	public static void doRace(String[] horses, String[] playerNames, int[] playerWallets) {
		// horsesInRace contains the index of the horses from the master horse array		
		int[] horsesInRace = getHorsesInRace(horses);
		
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
	
	public static int startRace(int[] horsesInRace) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int[][] getPlayerBets(String[] playerNames, int[] playerWallets, int[] horsesInRace) {
		// check that you can't bet more than you have
		return null;
	}

	public static int[] getHorsesInRace(String[] horses) {
		int numHorsesInRace = 0;
		int minNumHorsesInRace = 5;
		int maxNumHorsesInRace = 8;
		
		numHorsesInRace = (int)(Math.random() * (maxNumHorsesInRace - minNumHorsesInRace) + minNumHorsesInRace);
		
		String[] horsesInRace = new String[numHorsesInRace];
		
		for (int i=0; i<numHorsesInRace; i++){
			horsesInRace[i] = horses[(int)(Math.random() * horses.length)+1];
		}
			
		return horsesInRace; // ***** Question: Why won't it take it in? 
							 // ***** Answer: Because indexes are ints silly. Not String. :D
								
		// randomizer
		// how to get horse name: horses[horsesInRace[0]]
	}

	public static int[] getPlayerWallets() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String[] getPlayerNames(String[] players) {
		String[] playerNames = new String[players.length];
		
		for (int i=0; i<players.length; i++){
			int j;
			for (j=0; j<players[i].length(); j++){
				char currentChar = players[i].charAt(j);
				if (currentChar >= '0' && currentChar <= '9')
					break;
			}
			playerNames[i] = players[i].substring(0, j);
		}
		
		System.out.println("playerNames" + Arrays.toString(playerNames));
		
		return playerNames;
		// **** Question: why was there nothing inputed in? Why return null? Why doesn't it take it in above?
		
	}

/* ---- don't need -----
	
	public static String[] horsesSelection(String[] horses, int numSelectedHorses){
		
		String[] selectedHorses = new String[numSelectedHorses];
		
		for (int i=0; i<numSelectedHorses; i++){
			selectedHorses[i] = horses[(int)(Math.random()*horses.length)+1];
		}
			
		return selectedHorses;
		
	}
*/ 
	
// ---------- checks if horse is already in the race ---------
	// sequential search
	public static boolean alreadyInRace(int horse, int[] horsesInRace){
		
		for (int i = 0; i < horsesInRace.length; i++){
			if (horsesInRace[i] == horse){
				return true;
			}
		}
			
		return false;
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
		
		// System.out.println("here " + Arrays.toString(horses));
		
		return horses;
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

// 
	public int getvalidInput(int min, int max, Scanner keyboard){ // pass in range (0, wallet)
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
		System.out.println("Thanks for playing!! ");
		
	}
	
	
}
