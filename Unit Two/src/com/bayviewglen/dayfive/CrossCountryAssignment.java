package com.bayviewglen.dayfive;

import java.util.Scanner;

public class CrossCountryAssignment {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter you first and last name: ");
		String name = scanner.nextLine();
		String firstName = (name.split(" ")[0]);
		String lastName = (name.split(" ")[1]);
			
		System.out.print(firstName + ", " + "please enter your time after the first mile (mm:ss:sss): ");
		String timeOne = scanner.nextLine();
		int minutes = Integer.parseInt(timeOne.split(":")[0]);
		double seconds = Double.parseDouble(timeOne.split(":")[1]);
		
		System.out.print("Please enter your time after the second mile (mm:ss:ss): ");
		
		
		/*
		System.out.print("Enter a time:");
		String time1 = scanner.nextLine();
		int minutes = Integer.parseInt(time1.split(":")[0]);
		double seconds = Double.parseDouble(time1.split(":")[1]);
		*/
		
		scanner.close();
		
		}

}
