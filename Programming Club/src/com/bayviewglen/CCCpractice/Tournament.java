package com.bayviewglen.CCCpractice;

import java.util.Scanner;

public class Tournament {

	public static void main(String[] args) {
		
		int count = 0;
		
		int group = -1;
		Scanner sc = new Scanner(System.in);
				
		for (int i=0; i<6; i++){
			String x = sc.nextLine();
			if (x.equals("W")){
				count++;
			}
		}
		
		if (count == 6 || count == 5){
			group = 1;
		} else if (count == 4 || count == 3){
			group = 2;
		} else if (count == 2 || count == 1){
			group = 3;
		}
		
		System.out.println(group);
		
	}
	
}
