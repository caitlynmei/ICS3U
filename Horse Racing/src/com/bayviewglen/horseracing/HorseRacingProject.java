package com.bayviewglen.horseracing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HorseRacingProject {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		introMessage();
		String[] horses = getHorses();
		String[] playerNames = getPlayerNames();
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
		
		/* first attempt
		String[] horsesInRace = {""};
	
		System.out.println("Howdy! Please enter the amount of horses you would like in this race: ");
		int numSelectedHorses = keyboard.nextInt();
		
		boolean validNumHorses = false;
		while (!validNumHorses){
			validNumHorses = true;
			if (numSelectedHorses < 5 || numSelectedHorses > 8){
				validNumHorses = false;
				System.out.println("You need a different amount of horses. Please enter an amount between 5 - 8 horses: ");
			}
		}
				
		System.out.println("Cool! So y'all will be betting on " + numSelectedHorses + " in this race.");
		
		horsesSelection(horses, numSelectedHorses); // making array for randomly selected horses in race
		*/
	}

	public static void closingMessage() {
		System.out.println("Alright! Good job to whoever bet on " + winningHorse + "!");
		System.out.println("Thanks for playing!! ");
		
	}

	public static void introMessage() {
		System.out.println("Howdy everyone! Who's ready for the horse race and some betting?");
		
	}

	public static void updatePlayerData(String[] playerNames, int[] playerWallets) {
		// TODO Auto-generated method stub
		
	}

	public static boolean promptForGameOver() {
		// TODO Auto-generated method stub
		return false;
	}

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
			
		return horsesInRace;
								
		// randomizer
		// how to get horse name: horses[horsesInRace[0]]
	}

	public static int[] getPlayerWallets() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String[] getPlayerNames() {
		// TODO Auto-generated method stub
		return null;
	}

// ----
	
	public static String[] horsesSelection(String[] horses, int numSelectedHorses){
		
		String[] selectedHorses = new String[numSelectedHorses];
		
		for (int i=0; i<numSelectedHorses; i++){
			selectedHorses[i] = horses[(int)(Math.random()*horses.length)+1];
		}
			
		return selectedHorses;
		
	}
	
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
		
		return horses;
	}
	
// -------------------- getPlayers Method ---------------------------
	
	public static String[] getPlayers(){
		String[] players = null;
		try {
			Scanner keyboard = new Scanner(new File("Input/players.dat"));
			int numPlayers = Integer.parseInt(keyboard.nextLine());
			players = new String[numPlayers];
			
			for (int i = 0; i<numPlayers; i++){
				players[i] = keyboard.nextLine();
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
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
	
	
}
