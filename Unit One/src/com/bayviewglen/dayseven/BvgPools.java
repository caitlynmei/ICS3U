package com.bayviewglen.dayseven;

import java.util.Scanner;

public class BvgPools {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		double length, width, depthDeep, depthShallow, lengthShallow, transition;
		double priceOne, priceTwo, priceThree; 
		
		System.out.println("The following questions will ask for pool measurements in metres.");
		System.out.println("Please enter the length of the pool: ");
		length = keyboard.nextDouble(); 
		
		System.out.print("Please enter the width of the pool: ");
		width = keyboard.nextDouble(); 
		
		System.out.println("");
		System.out.println("-----------------------------------------------------");
		System.out.println("");
		
		System.out.println("Please enter the depth of the deep end: ");
		depthDeep = keyboard.nextDouble(); 
				
		System.out.println("Please enter the depth of the shallow end: ");
		depthShallow = keyboard.nextDouble(); 
		
		
		System.out.println("Please enter the length of the shallow end: ");
		lengthShallow = keyboard.nextDouble(); 
		
		System.out.println("Please enter the length of the /'transition/' between the deep and shallow end: ");
		transition = keyboard.nextDouble(); 
		
		
		System.out.println("");
		System.out.println("-----------------------------------------------------");
		System.out.println("");	
		
		System.out.println("The following questions are for the prices of the three choices of pool liners.");
		System.out.println("Please enter the price of the first liner: ");
		priceOne = keyboard.nextDouble(); 
		
		System.out.println("Please enter the price of the second liner: ");
		priceTwo = keyboard.nextDouble(); 
		
		System.out.println("Please enter the price of the third liner: ");
		priceThree = keyboard.nextDouble(); 
		
		
		double volumeShallow = length * width * depthShallow;
		double volumeDeep = length * width * depthDeep;
		double 
	
		/*
		double areaSideDeep = width * depthDeep;
		double areaSideShallow = width * depthShallow;
		*/
		
		
	}

}
