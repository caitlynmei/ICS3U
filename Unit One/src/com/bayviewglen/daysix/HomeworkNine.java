package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
	
		// Sales

		Scanner teacup = new Scanner (System.in);
		
		double commission = 0.27;
		
		System.out.println("Please enter the amount of items sold by a salesperson: ");
		int item = teacup.nextInt();
		
		double pay = commission * item;
		pay = (int)(pay * 100);
		pay = (double) pay / 100;
		
		System.out.println("By selling " + item + " item(s), this salesperson's boss has to pay him $" + pay + ".");
		
	}

}
