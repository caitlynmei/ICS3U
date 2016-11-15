package com.bayviewglen.assignment;

public class AssignmentTwoBrainstorm {

	public static void main(String[] args) {
	
		String str = "Hello";
		
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
		
		String capStr = str.toUpperCase();

		/*
		String inputString = "hello";
		String result = ""; 
		
		 for( int i=0; i < inputString.length( ); i++ ) { 
		    if( Character.isLetter( inputString.charAt( i ) ) ) 
		      result += inputString.charAt( i ); 
		  } 
		  	System.out.println(result); 
		} 
		*/
		
		for (int i = 0; i < str.length(); i++){
			if (Character.isLetter(str.charAt(i))){
				System.out.println("ok");
			} 
		}
		
		System.out.println("Yay!");

	
	}
}

