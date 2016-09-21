package com.bayviewglen.dayseven;

import java.util.Scanner;

public class BvgPools {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		double length, width, depthDeep, depthShallow, lengthShallow, transition;
		double priceOne, priceTwo, priceThree; 
		
		// ----- Questions ------
		
		System.out.println("The following questions will ask for pool measurements in metres.");
		System.out.print("Please enter the length of the pool: ");
		length = keyboard.nextDouble(); 
		System.out.println("");	
		
		System.out.print("Please enter the width of the pool: ");
		width = keyboard.nextDouble(); 
		System.out.println("");	
		
		System.out.print("Please enter the depth of the deep end: ");
		depthDeep = keyboard.nextDouble(); 
		System.out.println("");	
		
		System.out.print("Please enter the depth of the shallow end: ");
		depthShallow = keyboard.nextDouble(); 
		System.out.println("");	
		
		System.out.print("Please enter the length of the \"transition\" between the deep and shallow end: ");
		transition = keyboard.nextDouble(); 
		System.out.println("");	
		
		System.out.print("Please enter the length of the shallow end: ");
		lengthShallow = keyboard.nextDouble(); 
		
		System.out.println("");	
		System.out.println("-----------------------------------------------------");
		System.out.println("");	
		
		System.out.println("The following questions are for the prices of the three choices of pool liners is dollars.");
		System.out.print("Please enter the price of the first liner: $");
		priceOne = keyboard.nextDouble(); 
		System.out.println("");	
		
		System.out.print("Please enter the price of the second liner: $");
		priceTwo = keyboard.nextDouble(); 
		System.out.println("");	
		
		System.out.print("Please enter the price of the third liner: $");
		priceThree = keyboard.nextDouble(); 
		System.out.println("");	
		
		System.out.println("-----------------------------------------------------");
		System.out.println("");	
		
		
		// ----- Measurement Overview -----
		
		System.out.println("Okay, so this is an overview of your answers.");
		System.out.println("Length of pool: " + length + "m");
		System.out.println("Width of pool: " + width + "m");
		System.out.println("Depth of shallow end: " + depthShallow + "m");
		System.out.println("Depth of deep end: " + depthDeep + "m");
		System.out.println("Length of transition between shallow and deep end: " + transition + "m");
		System.out.println("Lenth of shallow end: " + lengthShallow + "m");

	
		// ----- Volume Calculations -----
		
		double volumeShallow, volumeDeep, volumeTransitionOne, volumeTransitionTwo, finalVolume;
		double volumeDesirable; // at 90% full
		
		volumeShallow = lengthShallow * width * depthShallow;
		volumeDeep = (length - lengthShallow - transition) * width * depthDeep;
		volumeTransitionOne = depthShallow * width * transition;
		volumeTransitionTwo = (depthDeep - depthShallow) * transition * width / 2;
		
		finalVolume = volumeShallow + volumeDeep + volumeTransitionOne + volumeTransitionTwo;
		
		volumeDesirable = (finalVolume * 0.9) * 100;
		volumeDesirable = (int)(volumeDesirable * 100);
		volumeDesirable = (double)(volumeDesirable /100);
		
		System.out.println("");	
		System.out.println("-----------------------------------------------------");
		System.out.println("");	
				
		System.out.println("Since the volume of the pool is " + finalVolume + "m cubed, and the pool is to be filled up 90% full, the amount of water");
		System.out.println("needed is " + volumeDesirable + "m cubed.");
		
	
		/*
		double areaSideDeep = width * depthDeep;
		double areaSideShallow = width * depthShallow;
		*/
		
		
	}

}
