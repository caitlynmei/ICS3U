package com.bayviewglen.daytwo;

public class ExampleOneRecursion {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));

	}

	public static int factorial (int n){
		if (n == 0 || n == 1){
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
}
