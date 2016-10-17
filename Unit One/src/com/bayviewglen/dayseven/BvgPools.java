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
		
		
		// ----- Measurement/Cost Overview -----
		
		System.out.println("Okay, so this is an overview of your answers.");
		System.out.println("Length of pool: " + length + "m");
		System.out.println("Width of pool: " + width + "m");
		System.out.println("Depth of shallow end: " + depthShallow + "m");
		System.out.println("Depth of deep end: " + depthDeep + "m");
		System.out.println("Length of transition between shallow and deep end: " + transition + "m");
		System.out.println("Lenth of shallow end: " + lengthShallow + "m");
		System.out.println("The price of the first liner is $" + priceOne + ".");
		System.out.println("The price of the two liner is $" + priceTwo + ".");
		System.out.println("The price of the third liner is $" + priceThree + ".");
		
	
		// ----- Volume Calculations -----
		
		double volumeShallow, volumeDeep, volumeTransitionOne, volumeTransitionTwo, finalVolume;
		double transitionB = depthDeep - depthShallow;
		double transitionA = Math.sqrt((transition * transition) - (transitionB * transitionB));
		double lengthDeep = length - lengthShallow - transitionA;
		
		double volumeDesirable; // at 90% full
				
		volumeShallow = lengthShallow * width * depthShallow;
		volumeDeep = lengthDeep * width * depthDeep;
		volumeTransitionOne = depthShallow * width * transitionA; // Top half of transition area 
		volumeTransitionTwo = transitionA * transitionB * width / 2; // Bottom half of transition area, the triangular prism
		
		finalVolume = volumeShallow + volumeDeep + volumeTransitionOne + volumeTransitionTwo;
		
		volumeDesirable = finalVolume * 0.9;
		volumeDesirable = (int)(volumeDesirable * 100);
		volumeDesirable = (double)(volumeDesirable /100);
		
		System.out.println("");	
		System.out.println("-----------------------------------------------------");
		System.out.println("");	
				
		System.out.println("Since the volume of the pool is " + finalVolume + "m cubed, and the pool is to be filled up 90% full, the amount of water");
		System.out.println("needed is " + volumeDesirable + "m cubed.");
		
		// ------ Surface Area Calculations ------
		
		double areaSideDeep, areaSideShallow, areaBottom, areaShallow, areaDeep, areaTransitionOne, areaTransitionTwo;
		double finalSA;
		
		areaSideDeep = width * depthDeep;
		areaSideShallow = width * depthShallow;
		areaBottom = width * length;
		areaShallow = 2 * (lengthShallow * depthShallow);
		areaDeep = 2 * (lengthDeep * depthDeep);
		areaTransitionOne = 2 * (depthShallow * transitionA);
		areaTransitionTwo = transitionA * transitionB;
		
		finalSA = areaSideDeep + areaSideShallow + areaBottom + areaShallow + areaDeep + areaTransitionOne + areaTransitionTwo;
		finalSA = (int)(finalSA * 100);
		finalSA = (double)(finalSA /100);
		
		System.out.println("");	
		System.out.println("-----------------------------------------------------");
		System.out.println("");	
				
		System.out.println("The total amount of liner needed is " + finalSA + "m squared.");
		
		
		// ------ Cost of Liner Calculations ------
		
		double linerOne, linerTwo, linerThree;
		
		linerOne = finalSA * priceOne;
		linerOne = (int)(linerOne * 100);
		linerOne = (double)(linerOne / 100);
		
		linerTwo = finalSA * priceTwo;
		linerTwo = (int)(linerTwo * 100);
		linerTwo = (double)(linerTwo / 100);
		
		linerThree = finalSA * priceThree;
		linerThree = (int)(linerThree * 100);
		linerThree = (double)(linerThree / 100);
		
		System.out.println("");	
		System.out.println("-----------------------------------------------------");
		System.out.println("");	
				
		System.out.println("The following are the comparitive costs of the three different liners.");
		System.out.println("The total costs of the first liner is $" + linerOne + ".");
		System.out.println("The total costs of the second liner is $" + linerTwo + ".");
		System.out.println("The total costs of the third liner is $" + linerThree + ".");
		
		System.out.println("");
		System.out.println("Thank you for using this program. Have a nice day. : ) ");
		
		keyboard.close();
		
		}

}
