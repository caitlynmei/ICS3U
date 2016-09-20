package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEleven {

	public static void main(String[] args) {
		
		// Kinetic energy
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("This is to find the kinetic energy of a moving object.");
		System.out.println("");
		
		System.out.println("Please enter the mass of the object: ");
		double mass = keyboard.nextDouble();
			
		System.out.println("Please enter the speed of the object: ");
		double speed = keyboard.nextDouble();
		
		double ke = ((mass * (speed * speed))) / 2;
		
		System.out.println("");
		System.out.println("");
		System.out.println("Great!");
		System.out.println("");
		System.out.println("The kinetic energy of your object is " + ke + " joules.");

	}

}
