package com.bayviewglen.horseracing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HorseRacingProject {

	public static void main(String[] args) throws InterruptedException {

		Scanner keyboard = new Scanner(System.in);

		introMessage(keyboard);

		System.out.println();

		// initializing variables
		final int minWalletAmount = 0; // minimum amount of money in a player's wallet $0
		String[] horses = getHorses();
		String[] players = getPlayers();
		String[] playerNames = getPlayerNames(players); // playerNames array
		int[] playerWallets = getPlayerWallets(players); // playerWallets array

		boolean gameOver = false;
		while (!gameOver) {
			doRace(minWalletAmount, horses, playerNames, playerWallets, keyboard);
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

		boolean isvalid = false; // check if user didn't enter 0
		while (!isvalid) {
			userPromptIntro = keyboard.nextLine();
			if (userPromptIntro.equals("0")) {
				isvalid = true;
			} else {
				System.out.print("You must enter 0: ");
			}
		}

		if (userPromptIntro.equals("0")) {
			System.out.println();
			System.out.println("Great! Let's start!!");
		}

		System.out.println("Y\'all going to start with $1000 in your wallets. \n");
	}

	// ----------------- doRace Method ----------------------
	public static void doRace(int minWalletAmount, String[] horses, String[] playerNames, int[] playerWallets, Scanner keyboard) throws InterruptedException {
		// horsesInRace contains the index of the horses from the master horse array
		int[] horsesInRace = getHorsesInRace(horses);
		final int minHorseChoice = 1; // minimum choice for horse number in race, #1 horse in list (on chart)
		final int maxHorseChoice = horsesInRace.length; // maximum choice for horse number in race

		System.out.println();
		System.out.println("#|Player Names          |     Wallet");
		// print chart with player names and wallets
		for (int i = 0; i < playerNames.length; i++) {
			System.out.println("-|----------------------|------------");
			System.out.printf(i + 1 + "| %-20s | %10d \n", playerNames[i], playerWallets[i]);
		}

		System.out.println("\n\n");
		System.out.println("These are the horses participating in today's race... ");
		System.out.println("");

		System.out.println("#|Horse Names           |");

		// print chart with horses in this round
		for (int i = 0; i < horsesInRace.length; i++) {
			System.out.println("-|----------------------|-");
			System.out.printf(i + 1 + "| %-20s | \n", horses[horsesInRace[i]]);
		}
		System.out.println("-|----------------------|-\n");

		System.out.println("Okay, so now we're going to start betting. ");
		System.out.println("Players will take turns entering a chosen horse number and the amount they want to bet in this race.");
		System.out.println();

		boolean playerTurnOver = false; // when a player's turn is over
		int userBettingAmount = 0; // holds the amount of money a player is betting
		int userBettingHorseNumber = 0; // holds the number of horse player is betting on
		int[] playerBetsMoney = new int[playerNames.length];
		int[] playerBetsHorseNumber = new int[playerNames.length];

		// initializing 2D array for playerBets
		final int numColumnsInPlayerBets = 2;
		int[][] playerBets = new int[playerNames.length][numColumnsInPlayerBets];
		// 2D array with column 0 = betting money; column 1 = betting horse number

		for (int i = 1; i <= playerNames.length; ++i) {
			while (!playerTurnOver) {
				System.out.println("Player " + i + ": ");
				System.out.print(playerNames[i - 1] + ", would you like to bet? Enter (1) for yes or (2) for no: ");

				String userAnswerToBetting = "";
				boolean inValid = true; // check if user didn't enter 1 or 2
				while (inValid) {
					userAnswerToBetting = keyboard.nextLine();
					if (userAnswerToBetting.equals("1") || userAnswerToBetting.equals("2")) {
						inValid = false;
					} else {
						System.out.print("You must enter (1) for yes or (2) for no: ");
					}
				}

				if (userAnswerToBetting.equals("1")) { // for "yes", I want to bet
					System.out.println("Great!");
					System.out.print(playerNames[i - 1] + ", you have $" + playerWallets[i - 1] + ". How much would you like to bet? (enter amount): $");
					userBettingAmount = getvalidInputforWallet(minWalletAmount, playerWallets[i - 1], keyboard);

					System.out.print("Which horse will you be betting on? (enter (0) to see the list of horses in this race): ");
					String userPromptToSeeList = ""; // for player's prompt to see the list of horses
					boolean validUserPromptToSeeList = true; // to check if player entered (0)
					while (validUserPromptToSeeList) {
						userPromptToSeeList = keyboard.nextLine();
						if (userPromptToSeeList.equals("0")) {
							validUserPromptToSeeList = false;
						} else {
							System.out.print("You must enter (0) to see the list of horses in this race: ");
						}
					}

					if (userPromptToSeeList.equals("0")) {
						// printing chart with horses from this round
						int j;
						for (j = 0; j < horsesInRace.length; j++) {
							System.out.println("-|----------------------|-");
							System.out.printf(j + 1 + "| %-20s | \n", horses[horsesInRace[j]]);
						}
						System.out.println("-|----------------------|-");

						System.out.println();
						System.out.print("Please choose a horse number: ");
						userBettingHorseNumber = getValidHorseNumberInput(minHorseChoice, maxHorseChoice, keyboard);

						System.out.println(playerNames[i - 1] + ", you have placed a $" + userBettingAmount + " on the number " + userBettingHorseNumber + ", " + horses[horsesInRace[userBettingHorseNumber - 1]] + ".\n");
					}

					playerBetsMoney[i - 1] = userBettingAmount;
					playerBetsHorseNumber[i - 1] = userBettingHorseNumber;

					++i;
					playerTurnOver = false || i == 7;

				} else if (userAnswerToBetting.equals("2")) { // if the player replies "no", I don't want to bet
					System.out.println("Okay " + playerNames[i - 1] + ", see you next round!\n");

					userBettingAmount = 0;
					userBettingHorseNumber = 0;
					playerBetsMoney[i - 1] = userBettingAmount;
					playerBetsHorseNumber[i - 1] = userBettingHorseNumber;

					++i;
					playerTurnOver = false || i == 7;
				}
			}
			System.out.println();
		}

		playerBets = getPlayerBets(playerBetsMoney, playerBetsHorseNumber, playerNames, playerWallets, horsesInRace);

		// ------- printing the race! ----------
		System.out.println("And let the horse race begin!!!\n");

		int[] winningHorses = startHorseRace(horsesInRace, horses);
		System.out.println("The winner(s) of the horse race is(are): ");
		for (int i = 0; i < winningHorses.length; i++) {
			if (winningHorses[i] != 0) {
				System.out.println("-- " + horses[horsesInRace[winningHorses[i] - 1]]);
			}
		}
		System.out.println();
		System.out.print("Hooray!!");
		System.out.println();
		
		// to pay out the betting money (adding or subtracting money to playerWallets)
		payOutBets(playerBets, playerWallets, playerNames, winningHorses); 

		System.out.println("And are final results are... ");
		System.out.println("\n\n");
		System.out.println("#|Player Names          |     Wallet");

		// print 'new' chart with player names and wallets
		for (int i = 0; i < playerNames.length; i++) {
			System.out.println("-|----------------------|------------");
			System.out.printf(i + 1 + "| %-20s | %10d \n", playerNames[i], playerWallets[i]);
		}

		System.out.println();
		System.out.println("here: " + Arrays.deepToString(playerBets));
	}

	// ------- getHorsesInRace (selecting horses to compete in the race) --------
		public static int[] getHorsesInRace(String[] horses) {
			int numHorsesInRace = 0;
			int minNumHorsesInRace = 5;
			int maxNumHorsesInRace = 9;
			int horsesLength = horses.length;

			numHorsesInRace = (int) (Math.random() * (maxNumHorsesInRace - minNumHorsesInRace) + minNumHorsesInRace);

			int[] horsesInRace = new int[numHorsesInRace]; // holds indices of  chosen horses in horse array									
			boolean isValidHorse = false; // to check if the index generated from randomizer is not repeated
			int currentHorseIndex = 0;

			for (int i = 0; i < numHorsesInRace; i++) {
				currentHorseIndex = (int) (Math.random() * horsesLength);
				horsesInRace[i] = currentHorseIndex;

				if (alreadyInRace(i, currentHorseIndex, horsesInRace) == true) {
					i--;
				}
			}

			System.out.println("HorsesInRace int array " + Arrays.toString(horsesInRace));

			return horsesInRace;

			// Brainstorming from a while ago:
			// ***** Question: Why won't it take it in? - me
			// ***** Answer: Because indexes are ints silly. Not String. :D - Wesley
		}
		
	// ---------- checks if horse is already in the race ---------
	// ---> sequential search
	public static boolean alreadyInRace(int currentIndex, int horse, int[] horsesInRace) {
		for (int i = 0; i < horsesInRace.length - 1; i++) {
			if (horsesInRace[i] == horse && i != currentIndex) {
				return true;
			}
		}

		return false;
	}
	
	// ---------------- startRace Method --------------------------
	public static int[] startHorseRace(int[] horsesInRace, String[] horses) throws InterruptedException {
		final int numSpacesInRace = 80;
		int[] stepsInRace = new int[horsesInRace.length]; // array holding the number of steps each horse takes
		// print initial starting position
		for (int i = 0; i < horsesInRace.length; i++) {
			System.out.println("-|---------------------|----------------------------------------------------------------------------------|-");
			System.out.printf(" |%-20s | %-80d\n", horses[horsesInRace[i]], i + 1);
		}
		System.out.println("-|---------------------|----------------------------------------------------------------------------------|-");
		System.out.println("\n\n\n");

		// printing race visualization
		boolean horseRaceOver = false;

		while (true) {
			for (int j = 0; j < horsesInRace.length; j++) {
				stepsInRace[j] = stepsInRace[j] + ((int) (Math.random() * 8) + 1);
			}

			displayHorseracingTable(stepsInRace, horses, horsesInRace);

			// to check if the horse race is over
			horseRaceOver = checkRaceOver(stepsInRace, horsesInRace, numSpacesInRace); 

			if (horseRaceOver == true) {
				break;
			}
		}
		
		// get the winning horses (if tie) in the race
		int[] winningHorses = getWinningHorse(stepsInRace, horsesInRace, numSpacesInRace); 
		
		return winningHorses;
	}

	// ------ displays horse racing table method (for visual) ------- 
	public static void displayHorseracingTable(int[] stepsInRace, String[] horses, int[] horsesInRace)
			throws InterruptedException {
		for (int i = 0; i < horsesInRace.length; i++) {
			int steps = stepsInRace[i];
			System.out.println("-|---------------------|----------------------------------------------------------------------------------|-");
			System.out.printf(" |%-20s |", horses[horsesInRace[i]]);

			for (int j = 0; j < steps; j++) {
				System.out.print(" ");
			}

			System.out.print(i + 1 + ", " + steps);
			System.out.println();

			Thread.sleep(250);
		}
		System.out.println("-|---------------------|----------------------------------------------------------------------------------|-");
		System.out.println("\n\n\n");
	}

	// -------- check if horse race is over method -------
	public static boolean checkRaceOver(int[] stepsInRace, int[] horsesInRace, int numSpacesInRace) {
		boolean horseRaceExit = false;

		for (int i = 0; i < horsesInRace.length; i++) {
			if (stepsInRace[i] >= numSpacesInRace) {
				horseRaceExit = true;
				break;
			}
		}
		return horseRaceExit;
	}

	// --------- gets the winning horses in race method -------- 
	public static int[] getWinningHorse(int[] stepsInRace, int[] horsesInRace, int numSpacesInRace) {
		int[] winningHorses = new int[horsesInRace.length];

		for (int i = 0; i < horsesInRace.length; i++) {
			if (stepsInRace[i] >= numSpacesInRace) {
				winningHorses[i] = i + 1;
			}
		}

		return winningHorses;
	}

	// ------- getting player bets method ------------ 
	public static int[][] getPlayerBets(int[] playerBetsMoney, int[] playerBetsHorseNumber, String[] playerNames, int[] playerWallets, int[] horsesInRace) {
		// 2D array with column 0 = betting amount, column 1 = betting horse
		// number
		final int numColumnsInPlayerBets = 2;
		int[][] playerBets = new int[playerNames.length][numColumnsInPlayerBets];

		for (int row = 0; row < playerBets.length; row++) {
			for (int column = 0; column < playerBets[0].length; column++) {
				playerBets[row][0] = playerBetsMoney[row];
				playerBets[row][1] = playerBetsHorseNumber[row];
			}
		}
		System.out.println("This is the playerBets arr " + Arrays.deepToString(playerBets));
		return playerBets;
	}

	// --------- paying out bets (math) method ------------ 
	public static void payOutBets(int[][] playerBets, int[] playerWallets, String[] playerNames, int[] winningHorses) {
		// 2D array playerBets columns: 0 is the betting amount, 1 is the
		// betting horse number

		for (int i = 0; i < playerBets.length; i++) {
			if (playerBets[i][1] == winningHorses[i]) {
				playerWallets[i] += playerBets[i][0];
				System.out.println("Congratulations to " + playerNames[i] + " for betting on the winning horse!!");
				System.out.println("You have earned " + playerWallets[i] + "!");
				System.out.println(Arrays.toString(playerWallets));
			} else {
				playerWallets[i] -= playerBets[i][0];
				System.out.println(Arrays.toString(playerWallets));
			}
		}
	}

	// ------updatePlayerData Method ------
	public static void updatePlayerData(String[] playerNames, int[] playerWallets) {

		/*
		 * //Gaby try { FileWriter fw = new FileWriter(new
		 * File("input/players.dat")); fw.close(); } catch (IOException e){
		 * e.printStackTrace(); }
		 */

	}

	// ------------- get Players Array Method -------------
	public static String[] getPlayers() {
		String[] players = null;
		try {
			Scanner scannerFile = new Scanner(new File("Input/players.dat"));
			int numPlayers = Integer.parseInt(scannerFile.nextLine());
			players = new String[numPlayers];

			for (int i = 0; i < numPlayers; i++) {
				players[i] = scannerFile.nextLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("players " + Arrays.toString(players));

		return players;
	}

	// ------------- get Horses Array Method -----------
	public static String[] getHorses() {
		String[] horses = null;
		try {
			Scanner scannerFile = new Scanner(new File("Input/horses.dat"));
			int numHorses = Integer.parseInt(scannerFile.nextLine()); // take a string and turn it into an int
			horses = new String[numHorses];

			for (int i = 0; i < numHorses; i++) {
				horses[i] = scannerFile.nextLine();
			}

		} catch (FileNotFoundException e) { // in case file isn't there
			e.printStackTrace();
		}

		return horses;
	}

	// -------------- get Player Names array -------------------
	public static String[] getPlayerNames(String[] players) {
		String[] playerNames = new String[players.length];

		for (int i = 0; i < players.length; i++) {
			int j;
			for (j = 0; j < players[i].length(); j++) {
				char currentChar = players[i].charAt(j);
				if (currentChar >= '0' && currentChar <= '9')
					break;
			}
			playerNames[i] = players[i].substring(0, j - 1);
		}

		return playerNames;
	}

	// ------------ get Players Wallets array ------------
	public static int[] getPlayerWallets(String[] players) {
		int[] playerWallets = new int[players.length];

		for (int i = 0; i < players.length; i++) {
			int j;
			for (j = 0; j < players[i].length(); j++) {
				char currentChar = players[i].charAt(j);
				if (currentChar >= '0' && currentChar <= '9')
					break;
			}
			playerWallets[i] = Integer.parseInt(players[i].substring(j));
		}

		System.out.println("playerWallet stuff" + Arrays.toString(playerWallets));

		return playerWallets;
	}

	// ------ checks if player has entered a valid amount of betting money -------
	public static int getvalidInputforWallet(int minWalletAmount, int maxWalletAmount, Scanner keyboard) { 
		// checks to see if money was in the range from $0 to total amount in wallet
		boolean isValid = false;

		int userBettingAmount = 0;
		while (!isValid) {
			try {
				userBettingAmount = Integer.parseInt(keyboard.nextLine());
				if (userBettingAmount >= minWalletAmount && userBettingAmount <= maxWalletAmount)
					isValid = true;
				else
					System.out.print("That is not how much you have in your wallet. Please enter another amount: ");
			} catch (Exception ex) {
				System.out.print("Please enter a valid amount: ");
			}
		}

		return userBettingAmount;
	}

	// ----- checks if player has entered a valid number for betting horse -----
	public static int getValidHorseNumberInput(int minHorseChoice, int maxHorseChoice, Scanner keyboard) {
		boolean isValid = false;

		int userBettingHorseNumber = 0;
		while (!isValid) {
			userBettingHorseNumber = Integer.parseInt(keyboard.nextLine());
			if (userBettingHorseNumber >= minHorseChoice && userBettingHorseNumber <= maxHorseChoice) {
				isValid = true;
			} else {
				System.out.print("Please enter a number for one of the horses shown in the table (1 - " + maxHorseChoice + "):");
			}
		}

		return userBettingHorseNumber;
	}

	// ------------ prompt for Game Over method ----------
	public static boolean promptForGameOver(Scanner keyboard) {
		System.out.println("Would you like to continue playing another round? ");
		System.out.print("If yes, please enter (1). If no, please enter (2): ");

		String userPromptGameOver = "";

		boolean isvalid = false; // check if user entered something other than 1 or 2
		while (!isvalid) {
			userPromptGameOver = keyboard.nextLine();
			if (userPromptGameOver.equals("1") || userPromptGameOver.equals("2")) {
				isvalid = true;
			} else {
				System.out.print("You must enter (1) for playing another round or (2) to end the game: ");
			}
		}

		if (userPromptGameOver.equals("1")) {
			System.out.println();
			System.out.println("Great! Get ready for another round!\n\n");
			return false;
		} else if (userPromptGameOver.equals("2")) {
			return true;
		}
		return true;
	}

	// ------------- closingMessage Method ------------
	public static void closingMessage() {
		System.out.println("Alright! Thanks for playing!! :)");
	}

}
