package com.bayviewglen.daythree;

public class HomeworkFive {

	public static void main(String[] args) {
	
		// Total amount of money
		
		int penny, nickle, dime, quarter, loonie, toonie;
		double total;
		
		penny = 8;
		nickle = 4;
		dime = 10;
		quarter = 100;
		loonie = 4;
		toonie = 6;
		
		total = 0.01 * penny + (0.05 * nickle) + (0.1 * dime) + (0.25 * quarter) + loonie + (2 * toonie);
		
		System.out.println("Given that you have " + penny + " penny(pennies), " + nickle + " nickle(s), " + quarter + " quarter(s), "+ loonie + " loonie(s), and " + toonie + " toonie(s),");
		System.out.println("the total amount of money you have would be $" + total + ".");
		
	}
	

}
