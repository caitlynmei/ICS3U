package com.bayviewglen.random;

public class Loops {

	public static void main(String[] args) {
		
		String cat1 = "cat";
		String cat2 = "cat";
		
		if (cat1.equals(cat2)){
			System.out.println("true");
		}
		
		int a = 5;
		int b = 10;
		
		int x = 45 % 10;
		int y = Math.abs(a-b);
		
		System.out.println(x);
		System.out.println(y);
		
		/*
		int num = 0;
		int i = 0;
		
		while (i<101){
			if (i % 2 == 0){
				num += i;
			}
			i++;
		}
		
		System.out.println(num);
		
		int num1 = 0;
		for (int j = 0; j < 101; j+=2){
			if (num1 % 2 == 0){
				num1 += j;
			}
		}
		
		System.out.println(num1);
		
		String str = "eeeeeeeeeee";
		int count = 0;
		for (int a = 0; a < str.length(); a++){
			if (str.charAt(a) == 'e'){
				count ++;
			}
		}
		
		System.out.println(count);
		
		/*for (int i = 1; i <= 5; i++){
			for (int j = 1; j <= i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
		*/
		
		/*
		// while loop
		int i = 0;
		
		while (i < 101){
			System.out.println("I will not chew gum while playing the flute.");
			i++;
		}
		
		
		// for loop
		for (int i = 0; i < 101; i++){
			System.out.println("I will not chew gum while playing the flute.");
		}
		 
		*/
		
	}

}
