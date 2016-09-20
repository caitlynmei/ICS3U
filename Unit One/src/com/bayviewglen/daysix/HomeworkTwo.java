package com.bayviewglen.daysix;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		// Area & Perimeter
		
		double length = 4.5;
		double width = 2.3;
		
		double area = length * width;
		
		area = (int)(area * 100) / 100;
		
		double perimeter = 2 * (length * width); 
		
		perimeter = (int)(perimeter * 100) / 100;
		
		System.out.println("With the measurements of " + length + " feet by " + width + " feet, the area would be " + area + " feet squared and the perimeter would be " + perimeter);
		System.out.println("feet.");

	}

}
