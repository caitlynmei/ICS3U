package com.bayviewglen.dayOne;

public class DieDriver {

	public static void main(String[] args) {
		Die die1 = new Die(26);
		
		while (die1.getTop() != 12){
			System.out.println(die1);
			die1.roll();
		}

	}

}
