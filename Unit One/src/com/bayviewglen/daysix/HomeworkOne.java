package com.bayviewglen.daysix;

public class HomeworkOne {

	public static void main(String[] args) {
		
		// Susan's computer purchase
		
		int computer = 985;
		double tax = 1.055;
		
		double total = (computer * tax);
		total = (int)(total * 100);
		total = (double)(total / 100);
		
		System.out.println("The total price of a computer at the cost of $" + computer + " is $" + total + ".");

	}

}
