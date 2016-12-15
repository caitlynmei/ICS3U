package com.bayviewglen.daytwo;

public class HomeworkOne {

	public static void main(String[] args) {
	
		for (int i=10; i<=50; i++){
			System.out.printf("%d:%8.4f\n",i, cubeRoots(i));
		}
		
	}
	
	public static double cubeRoots(int x){
		
		return Math.pow(x, 1.0/3.0);
		
	}
	
}
