package com.bayviewglen.dayfive;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryAssignment {

	static final int sixty = 60;
	
	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("00.000");
		
		// First and Last Name
		System.out.print("Please enter you first and last name: ");
		String name = scanner.nextLine();
		String firstName = (name.split(" ")[0]);
		String lastName = (name.split(" ")[1]);
		
		
		// First Mile Time
		System.out.print(firstName + ", please enter your time after the first mile (mm:ss.sss): ");
		String timeOne = scanner.nextLine();
		
		int minutes1 = Integer.parseInt(timeOne.split(":")[0]);
		double seconds1 = Double.parseDouble(timeOne.split(":")[1]);
		
		double totalSec1 = minutes1 * sixty + seconds1; // Total number of seconds with minutes converted to seconds 
		
		
		// Second Mile Time
		System.out.print(firstName + ", please enter your time to the end of the second mile (mm:ss.ss): ");
		String timeTwo = scanner.nextLine();	
		
		int minutes2 = Integer.parseInt(timeTwo.split(":")[0]);
		double seconds2 = Double.parseDouble(timeTwo.split(":")[1]);
		
		double minSec2 = minutes2 * sixty + seconds2; // Total of time at the end of the second mile in seconds
		double totalSec2 = minSec2 - totalSec1;
		int actualMinutes2 = (int) totalSec2 / sixty;
		double actualSeconds2 = actualMinutes2 - (actualMinutes2 / sixty);

		
		// Distance of Second Mile to End of Race
		System.out.print(firstName + ", please enter your time to the end of the 5 kilometer race (mm:ss.sss): ");
		String timeThree = scanner.nextLine();
		
		int minutes3 = Integer.parseInt(timeThree.split(":")[0]);
		double seconds3 = Double.parseDouble(timeThree.split(":")[1]);
		
		double minSec3 = minutes3 * sixty + seconds3;
		double totalSec3 = minSec3 - totalSec2;
		int actualMinutes3 = (int) totalSec3 / sixty;
		double actualSeconds3 = actualMinutes3 - (actualMinutes3 / sixty);
		
		// Total Time
		double totalSecTime = totalSec1 + totalSec2 + totalSec3;
		int totalMinutes = (int) totalSecTime / 60;
		double totalSeconds = totalSecTime - (totalSecTime / 60);
		
			
		// Runner 1 Summary
		System.out.println("");
		System.out.println("Runner One Summary");
		System.out.println("******************");
		System.out.println("");
		System.out.println("Split One: " + minutes1 + ":" + formatter.format(seconds1));
		System.out.println("Split Two: " + actualMinutes2 + ":" + formatter.format(actualSeconds2));
		System.out.println("Split Three: " + actualMinutes3 + ":" + formatter.format(actualSeconds3));
		System.out.println("Total: " + totalMinutes + ":" + formatter.format(totalSeconds));
		
		/*
		System.out.print("Enter a time:");
		String time1 = scanner.nextLine();
		int minutes = Integer.parseInt(time1.split(":")[0]);
		double seconds = Double.parseDouble(time1.split(":")[1]);
		*/
		
	
		
		}

}
