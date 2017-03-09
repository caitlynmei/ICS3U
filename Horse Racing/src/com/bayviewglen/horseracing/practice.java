package com.bayviewglen.horseracing;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public static int startHorseRace(int[] horsesInRace, String[] horses) {
		
		int winningHorse = (int)(Math.random() * horsesInRace.length); // winning horses randomizer
		final int numSpacesInRace = 80;
		
		
		// array containing the number in race (horse position in race track)
		int[] horseDisplayInRace = new int[horsesInRace.length]; 
		for (int i=1; i<=horsesInRace.length; i++){
			horseDisplayInRace[i-1] = i;
		}
		
		//int[] stepsInRace = getStepsInRace(horsesInRace, winningHorse);
		
		int[] stepsInRace = new int[horsesInRace.length]; // array holding the number of steps each horse takes (speed)
		
		for (int i=0; i<horsesInRace.length; i++){
			if (horsesInRace[i] == winningHorse){
				stepsInRace[i] = stepsInRace[i] + 8; // winning horse will have the most steps
			} else {
				stepsInRace[i] = stepsInRace[i] + (int)(Math.random() * 6);
			}
		}
		
		boolean horseRaceOver = checkRaceOver(stepsInRace, horsesInRace);
		
		//String[] horseNumInRace = {"1", "2", "3", "4", "5", "6", "7", "8"};
	
		int index = 0;
		//boolean horseRaceOver = false; // when the horse race is over
	
		// printing race visualization
		for (int i=0; i<horsesInRace.length; i++){
			System.out.println("-|---------------------|----------------------------------------------------------------------------------|-");
			System.out.printf(" |%-20s | %-80d\n", horses[horsesInRace[i]], horseDisplayInRace[i]);
		}
		System.out.println("-|---------------------|----------------------------------------------------------------------------------|-"); // 2, 80 
				
		for (int i=0; i<horsesInRace.length; i++){
			int steps = stepsInRace[i];
			System.out.println("-|---------------------|----------------------------------------------------------------------------------|-");
			System.out.printf(" |%-20s |", horses[horsesInRace[i]]);
					
			for (int j=0; j<steps; j++){
				System.out.print(" ");
			}
			System.out.print(i+1);
			System.out.println();	
				
		}
		System.out.println("-|---------------------|----------------------------------------------------------------------------------|-");
		return winningHorse;
}

public static boolean checkRaceOver(int[] stepsInRace, int[] horsesInRace) {
	boolean horseRaceExit = false;
	
	for (int i=0; i<horsesInRace.length; i++){
		if (stepsInRace[i] >= 50){
			horseRaceExit = true;
		}
	}

	return horseRaceExit;
}

}
