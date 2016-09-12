package com.bayviewglen.daythree;

public class HomeworkSix {

	public static void main(String[] args) {
	
		// Find the roots
		
		double x_plus, x_minus;
		double a, b, c;
	
		a = 3;
		b = 44;
		c = -1;
		
		x_plus = (-b + Math.sqrt(b*b - (4*a*c)))/(2*a); 
		
		x_minus = (-b - Math.sqrt(b*b - (4*a*c)))/(2*a); 
		
		// y = a * (x * x) + (b * x) + c;
		
		
		// System.out.println("The answer to the equation y = ax2 + bx + c given variables a(" + a + "), b(" + b  + "), c(" + c + "), and is.");
		
		System.out.println("The roots are: " + x_plus + " and " + x_minus + ".");

	}

}
