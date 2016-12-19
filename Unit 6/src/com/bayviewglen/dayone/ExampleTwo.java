package com.bayviewglen.dayone;

public class ExampleTwo {

	public static void main(String[] args) {
		
		String[] arr = { "Hello", "Hi", "Bye", "Sorry", "ISC3U", "Bubble Gum", "Bees"};
		int howMany = howManyEs(arr);
		
		System.out.println(howMany);	
		
	}
	
	public static int howManyEs(String[] words){
		
		int numEs = 0;
		
		for (int i = 0; i < words.length; ++i){
			String word = words[i].toUpperCase();
			
			for (int j=0; j<word.length(); ++j){
				if (word.charAt(j) == 'E')
					numEs++;
			}
		}
		
		return numEs;
		
	}
	
}
