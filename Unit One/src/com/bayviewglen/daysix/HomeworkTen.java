package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkTen {

	public static void main(String[] args) {
		
		// Rectangle Properties 
		
		Scanner teacup = new Scanner(System.in);
		
		System.out.println("Please enter the length of the rectangle: ");
		double length = teacup.nextDouble();
		
		System.out.println("Please enter the width of the rectangle: ");
		double width = teacup.nextDouble();
		
		double area = length * width;
		double perimeter = 2 * (length * width);
		
		System.out.println("With a length of " + length + " units and a width of " + width + " units, the rectangle's area is " + area + " units squared and its perimeter is " + perimeter + " units.");
		
		
	}

}
