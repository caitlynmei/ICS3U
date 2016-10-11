package com.bayviewglen.dayfive;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryAssignment {

	
	public static void main(String[] args) {
		final int SIXTY = 60; // Used for conversions between minutes and seconds

		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("00.000");
		
		// For the following variables (for String, int, and double), I have placed numbers at the end of each one to represent which runner they are referring too. 
		// E.g. I would use name1 for Runner 1
		
		// Runner 1:
		System.out.println("Runner One: ");
		System.out.println("");
		
		// First and Last Name
		System.out.print("Please enter you first and last name: ");
		String name1 = keyboard.nextLine();
		String firstName1 = (name1.split(" ")[0]);
		String lastName1 = (name1.split(" ")[1]);
				
		// First Mile Time (Split 1)
		System.out.print(firstName1 + ", please enter your time after the first mile (mm:ss.sss): ");
		String timeOne1 = keyboard.nextLine();
		
		int splitOneMinutes1 = Integer.parseInt(timeOne1.split(":")[0]); // Amount of minutes for time from start to end of first mile (Split 1)
		double splitOneSeconds1 = Double.parseDouble(timeOne1.split(":")[1]); // Amount of seconds for Split 1, leftover after amount of minutes are already subtracted
		double totalSecondsOne1 = (splitOneMinutes1 * SIXTY) + splitOneSeconds1; // Total amount of time for Split 1, in seconds
				
		// Second Mile Time (Split 2)
		System.out.print(firstName1 + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		String timeTwo1 = keyboard.nextLine();	
		
		int minutesTwo1 = Integer.parseInt(timeTwo1.split(":")[0]);
		double secondsTwo1 = Double.parseDouble(timeTwo1.split(":")[1]);
		
		double totalSecondsTwo1 = (minutesTwo1 * SIXTY) + secondsTwo1; // Total amount of time from start to end of the second mile, in seconds
		double splitTwoTotalSeconds1 = totalSecondsTwo1- totalSecondsOne1; // Total amount of time from the end of the first mile to the end of the second mile (Split 2), in seconds
		
		int splitTwoMinutes1 = (int) (splitTwoTotalSeconds1) / SIXTY; // Amount of minutes for Split 2
		double splitTwoSeconds1 = splitTwoTotalSeconds1 - (splitTwoMinutes1 * SIXTY); // Amount of seconds for Split 2, leftover after amount of minutes are already subtracted
				
		// Distance of Second Mile to End of Race (Split 3)
		System.out.print(firstName1 + ", please enter your time to the end of the 5 kilometer race (mm:ss.sss): ");
		String timeThree1 = keyboard.nextLine();
		
		int minutesThree1 = Integer.parseInt(timeThree1.split(":")[0]);
		double secondsThree1 = Double.parseDouble(timeThree1.split(":")[1]);
		
		double totalSecondsThree1 = (minutesThree1 * SIXTY) + secondsThree1; // Total amount of time start to end of race, in seconds
		double splitThreeTotalSeconds1 = totalSecondsThree1 - totalSecondsTwo1; // Total amount of time from the end of the second mile to the end of the race (Split 3), in seconds
				
		int splitThreeMinutes1 = (int) (splitThreeTotalSeconds1) / SIXTY; // Amount of minutes for Split 3
		double splitThreeSeconds1 = splitThreeTotalSeconds1 - (splitThreeMinutes1 * SIXTY); // Amount of seconds for Split 3, leftover after amount of minutes are already subtracted 
		
		// Total Time
		// The amount of minutes and seconds entered from user for Runner 1's time at the end of the race is the same as the ones for total time
		int totalMinutes1 = minutesThree1;
		double totalSeconds1 = secondsThree1;
			
		// Runner 1 Summary
		System.out.println("");
		System.out.println("Runner One Summary");
		System.out.println("******************");
		System.out.println("");
		System.out.println("Runner: " + lastName1 + ", " + firstName1);
		System.out.println("Split One: " + splitOneMinutes1 + ":" + formatter.format(splitOneSeconds1));
		System.out.println("Split Two: " + splitTwoMinutes1 + ":" + formatter.format(splitTwoSeconds1));
		System.out.println("Split Three: " + splitThreeMinutes1 + ":" + formatter.format(splitThreeSeconds1));
		System.out.println("Total: " + totalMinutes1 + ":" + formatter.format(totalSeconds1));
		
		
		// Runner 2:
		System.out.println("Runner Two: ");
		System.out.println("");
		
		// First and Last Name
		System.out.print("Please enter you first and last name: ");
		String name2 = keyboard.nextLine();
		String firstName2 = (name2.split(" ")[0]);
		String lastName2 = (name2.split(" ")[1]);
		
		// First Mile Time (Split 1)
		System.out.print(firstName2 + ", please enter your time after the first mile (mm:ss.sss): ");
		String timeOne2 = keyboard.nextLine();
		
		int splitOneMinutes2 = Integer.parseInt(timeOne2.split(":")[0]);
		double splitOneSeconds2 = Double.parseDouble(timeOne2.split(":")[1]);
		double totalSecondsOne2 = (splitOneMinutes2 * SIXTY) + splitOneSeconds2; 
		
		// Second Mile Time (Split 2)
		System.out.print(firstName2 + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		String timeTwo2 = keyboard.nextLine();	
		
		int minutesTwo2 = Integer.parseInt(timeTwo2.split(":")[0]);
		double secondsTwo2 = Double.parseDouble(timeTwo2.split(":")[1]);
		
		double totalSecondsTwo2 = (minutesTwo2 * SIXTY) + secondsTwo2; 
		double splitTwoTotalSeconds2 = totalSecondsTwo2- totalSecondsOne2; 
		
		int splitTwoMinutes2 = (int) (splitTwoTotalSeconds2) / SIXTY; 
		double splitTwoSeconds2 = splitTwoTotalSeconds2 - (splitTwoMinutes2 * SIXTY); 
		
		// Distance of Second Mile to End of Race (Split 3)
		System.out.print(firstName2 + ", please enter your time to the end of the 5 kilometer race (mm:ss.sss): ");
		String timeThree2 = keyboard.nextLine();
		
		int minutesThree2 = Integer.parseInt(timeThree2.split(":")[0]);
		double secondsThree2 = Double.parseDouble(timeThree2.split(":")[1]);
		
		double totalSecondsThree2 = (minutesThree2 * SIXTY) + secondsThree2; 
		double splitThreeTotalSeconds2 = totalSecondsThree2 - totalSecondsTwo2;
				
		int splitThreeMinutes2 = (int) (splitThreeTotalSeconds2) / SIXTY; 
		double splitThreeSeconds2 = splitThreeTotalSeconds2 - (splitThreeMinutes2 * SIXTY);
		
		// Total Time
		// The amount of minutes and seconds entered from user for Runner 2's time at the end of the race is the same as the ones for total time
		int totalMinutes2 = minutesThree2;
		double totalSeconds2 = secondsThree2;
		
	
		// Runner 2 Summary
		System.out.println("");
		System.out.println("Runner Two Summary");
		System.out.println("******************");
		System.out.println("");
		System.out.println("Runner: " + lastName2 + ", " + firstName2);
		System.out.println("Split One: " + splitOneMinutes2 + ":" + formatter.format(splitOneSeconds2));
		System.out.println("Split Two: " + splitTwoMinutes2 + ":" + formatter.format(splitTwoSeconds2));
		System.out.println("Split Three: " + splitThreeMinutes2 + ":" + formatter.format(splitThreeSeconds2));
		System.out.println("Total: " + totalMinutes2 + ":" + formatter.format(totalSeconds2));

		
		// Runner 3:
		System.out.println("Runner Three: ");
		System.out.println("");
		
		// First and Last Name
		System.out.print("Please enter you first and last name: ");
		String name3 = keyboard.nextLine();
		String firstName3 = (name3.split(" ")[0]);
		String lastName3 = (name3.split(" ")[1]);
		
		// First Mile Time (Split 1)
		System.out.print(firstName3 + ", please enter your time after the first mile (mm:ss.sss): ");
		String timeOne3 = keyboard.nextLine();
		
		int splitOneMinutes3 = Integer.parseInt(timeOne3.split(":")[0]);
		double splitOneSeconds3 = Double.parseDouble(timeOne3.split(":")[1]);
		double totalSecondsOne3 = (splitOneMinutes3 * SIXTY) + splitOneSeconds3; 
		
		// Second Mile Time (Split 2)
		System.out.print(firstName3 + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		String timeTwo3 = keyboard.nextLine();	
		
		int minutesTwo3 = Integer.parseInt(timeTwo3.split(":")[0]);
		double secondsTwo3 = Double.parseDouble(timeTwo3.split(":")[1]);
		
		double totalSecondsTwo3 = (minutesTwo3 * SIXTY) + secondsTwo3; 
		double splitTwoTotalSeconds3 = totalSecondsTwo3- totalSecondsOne3; 
		
		int splitTwoMinutes3 = (int) (splitTwoTotalSeconds3) / SIXTY; 
		double splitTwoSeconds3 = splitTwoTotalSeconds3 - (splitTwoMinutes3 * SIXTY); 
		
		// Distance of Second Mile to End of Race (Split 3)
		System.out.print(firstName3 + ", please enter your time to the end of the 5 kilometer race (mm:ss.sss): ");
		String timeThree3 = keyboard.nextLine();
		
		int minutesThree3 = Integer.parseInt(timeThree3.split(":")[0]);
		double secondsThree3 = Double.parseDouble(timeThree3.split(":")[1]);
		
		double totalSecondsThree3 = (minutesThree3 * SIXTY) + secondsThree3; 
		double splitThreeTotalSeconds3 = totalSecondsThree3 - totalSecondsTwo3;
				
		int splitThreeMinutes3 = (int) (splitThreeTotalSeconds3) / SIXTY; 
		double splitThreeSeconds3 = splitThreeTotalSeconds3 - (splitThreeMinutes3 * SIXTY);
		
		// Total Time
		// The amount of minutes and seconds entered from user for Runner 3's time at the end of the race is the same as the ones for total time
		int totalMinutes3 = minutesThree3;
		double totalSeconds3 = secondsThree3;
		
		// Runner 3 Summary
		System.out.println("");
		System.out.println("Runner Three Summary");
		System.out.println("******************");
		System.out.println("");
		System.out.println("Runner: " + lastName3 + ", " + firstName3);
		System.out.println("Split One: " + splitOneMinutes3 + ":" + formatter.format(splitOneSeconds3));
		System.out.println("Split Two: " + splitTwoMinutes3 + ":" + formatter.format(splitTwoSeconds3));
		System.out.println("Split Three: " + splitThreeMinutes3 + ":" + formatter.format(splitThreeSeconds3));
		System.out.println("Total: " + totalMinutes3 + ":" + formatter.format(totalSeconds3));

		
		// Runner 4:
		System.out.println("Runner Four: ");
		System.out.println("");
		
		// First and Last Name
		System.out.print("Please enter you first and last name: ");
		String name4 = keyboard.nextLine();
		String firstName4 = (name4.split(" ")[0]);
		String lastName4 = (name4.split(" ")[1]);
		
		// First Mile Time (Split 1)
		System.out.print(firstName4 + ", please enter your time after the first mile (mm:ss.sss): ");
		String timeOne4 = keyboard.nextLine();
		
		int splitOneMinutes4 = Integer.parseInt(timeOne4.split(":")[0]);
		double splitOneSeconds4 = Double.parseDouble(timeOne4.split(":")[1]);
		double totalSecondsOne4 = (splitOneMinutes4 * SIXTY) + splitOneSeconds4; 
		
		// Second Mile Time (Split 2)
		System.out.print(firstName4 + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		String timeTwo4 = keyboard.nextLine();	
		
		int minutesTwo4 = Integer.parseInt(timeTwo4.split(":")[0]);
		double secondsTwo4 = Double.parseDouble(timeTwo4.split(":")[1]);
		
		double totalSecondsTwo4 = (minutesTwo4 * SIXTY) + secondsTwo4; 
		double splitTwoTotalSeconds4 = totalSecondsTwo4- totalSecondsOne4; 
		
		int splitTwoMinutes4 = (int) (splitTwoTotalSeconds4) / SIXTY; 
		double splitTwoSeconds4 = splitTwoTotalSeconds4 - (splitTwoMinutes4 * SIXTY); 
		
		// Distance of Second Mile to End of Race (Split 3)
		System.out.print(firstName4 + ", please enter your time to the end of the 5 kilometer race (mm:ss.sss): ");
		String timeThree4 = keyboard.nextLine();
		
		int minutesThree4 = Integer.parseInt(timeThree4.split(":")[0]);
		double secondsThree4 = Double.parseDouble(timeThree4.split(":")[1]);
		
		double totalSecondsThree4 = (minutesThree4 * SIXTY) + secondsThree4; 
		double splitThreeTotalSeconds4 = totalSecondsThree4 - totalSecondsTwo4;
				
		int splitThreeMinutes4 = (int) (splitThreeTotalSeconds4) / SIXTY; 
		double splitThreeSeconds4 = splitThreeTotalSeconds4 - (splitThreeMinutes4 * SIXTY);
		
		// Total Time
		// The amount of minutes and seconds entered from user for Runner 4's time at the end of the race is the same as the ones for total time
		int totalMinutes4 = minutesThree4;
		double totalSeconds4 = secondsThree4;
		
	
		// Runner 4 Summary
		System.out.println("");
		System.out.println("Runner Four Summary");
		System.out.println("******************");
		System.out.println("");
		System.out.println("Runner: " + lastName4 + ", " + firstName4);
		System.out.println("Split One: " + splitOneMinutes4 + ":" + formatter.format(splitOneSeconds4));
		System.out.println("Split Two: " + splitTwoMinutes4 + ":" + formatter.format(splitTwoSeconds4));
		System.out.println("Split Three: " + splitThreeMinutes4 + ":" + formatter.format(splitThreeSeconds4));
		System.out.println("Total: " + totalMinutes4 + ":" + formatter.format(totalSeconds4));

		
		// Runner 5:
		System.out.println("Runner Five: ");
		System.out.println("");
		
		// First and Last Name
		System.out.print("Please enter you first and last name: ");
		String name5 = keyboard.nextLine();
		String firstName5 = (name5.split(" ")[0]);
		String lastName5 = (name5.split(" ")[1]);
		
		// First Mile Time (Split 1)
		System.out.print(firstName5 + ", please enter your time after the first mile (mm:ss.sss): ");
		String timeOne5 = keyboard.nextLine();
		
		int splitOneMinutes5 = Integer.parseInt(timeOne5.split(":")[0]);
		double splitOneSeconds5 = Double.parseDouble(timeOne5.split(":")[1]);
		double totalSecondsOne5 = (splitOneMinutes5 * SIXTY) + splitOneSeconds2; 
		
		// Second Mile Time (Split 2)
		System.out.print(firstName5 + ", please enter your time to the end of the second mile (mm:ss.sss): ");
		String timeTwo5 = keyboard.nextLine();	
		
		int minutesTwo5 = Integer.parseInt(timeTwo5.split(":")[0]);
		double secondsTwo5 = Double.parseDouble(timeTwo5.split(":")[1]);
		
		double totalSecondsTwo5 = (minutesTwo5 * SIXTY) + secondsTwo5; 
		double splitTwoTotalSeconds5 = totalSecondsTwo5- totalSecondsOne5; 
		
		int splitTwoMinutes5 = (int) (splitTwoTotalSeconds5) / SIXTY; 
		double splitTwoSeconds5 = splitTwoTotalSeconds5 - (splitTwoMinutes5 * SIXTY); 
		
		// Distance of Second Mile to End of Race (Split 3)
		System.out.print(firstName5 + ", please enter your time to the end of the 5 kilometer race (mm:ss.sss): ");
		String timeThree5 = keyboard.nextLine();
		
		int minutesThree5 = Integer.parseInt(timeThree5.split(":")[0]);
		double secondsThree5 = Double.parseDouble(timeThree5.split(":")[1]);
		
		double totalSecondsThree5 = (minutesThree5 * SIXTY) + secondsThree5; 
		double splitThreeTotalSeconds5 = totalSecondsThree5 - totalSecondsTwo5;
				
		int splitThreeMinutes5 = (int) (splitThreeTotalSeconds5) / SIXTY; 
		double splitThreeSeconds5 = splitThreeTotalSeconds5 - (splitThreeMinutes5 * SIXTY);
		
		// Total Time
		// The amount of minutes and seconds entered from user for Runner 5's time at the end of the race is the same as the ones for total time
		int totalMinutes5 = minutesThree2;
		double totalSeconds5 = secondsThree2;
		
	
		// Runner 5 Summary
		System.out.println("");
		System.out.println("Runner Five Summary");
		System.out.println("******************");
		System.out.println("");
		System.out.println("Runner: " + lastName5 + ", " + firstName5);
		System.out.println("Split One: " + splitOneMinutes5 + ":" + formatter.format(splitOneSeconds5));
		System.out.println("Split Two: " + splitTwoMinutes5 + ":" + formatter.format(splitTwoSeconds5));
		System.out.println("Split Three: " + splitThreeMinutes5 + ":" + formatter.format(splitThreeSeconds5));
		System.out.println("Total: " + totalMinutes5 + ":" + formatter.format(totalSeconds5));

		
		}
}
