package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ReadTimes {

	public static void main(String[] args) {
		
	// Read Times in Cross Country

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a time:");
	String time1 = scanner.nextLine();
	int minutes = Integer.parseInt(time1.split(":")[0]); // Start counting at 0, start at 0
	double seconds = Double.parseDouble(time1.split(":")[1]);

	scanner.close();
	
	}
}
