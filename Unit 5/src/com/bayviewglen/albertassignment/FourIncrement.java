package com.bayviewglen.albertassignment;

public class FourIncrement {

	public static void main(String[] args) {
		
		//int x = increDecre(4);

		int x = 4;
		System.out.print(++x);
		System.out.print(x++);
		System.out.print(--x);
		if (x++ == 5){
			return;
		}
		System.out.print(x--);
		
		System.out.println(x);
		
	}
	
	public static void increDecre(int x){
			
		System.out.print(++x);
		System.out.print(x++);
		System.out.print(--x);
		if (x++ == 5){
			return;
		}
		System.out.print(x--);
		
		
	}

}
