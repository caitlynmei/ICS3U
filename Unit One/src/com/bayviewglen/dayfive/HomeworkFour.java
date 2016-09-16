package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
	
		Scanner teacup = new Scanner(System.in); 

		System.out.print("Please enter your initial velocity: ");
		double v1 = teacup.nextDouble();
		
		System.out.print("Please enter your acceleration: ");
		double a = teacup.nextDouble();
		
		System.out.print("Please enter the time elasped: ");
		double t = teacup.nextDouble();
		
		double vf = v1 + (a * t);
		
		System.out.println("");
		System.out.println("Therefore, if your initial velocity was " + v1 + "m/s, acceleration was " + a + "m^2/s, and the time elapsed was " + t + " seconds,");
		System.out.println(" the final velocity would be " + vf + "m/s.");
		
	}

}
