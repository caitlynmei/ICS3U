package com.bayviewglen.albertassignment;

public class OneJumble {

	public static void main(String[] args) {
		
		String jumble = "shehas250antsinher5rooms";
		String d = "0123456789";
		int n1 = 0, n2 = 0;
		
		for (int i=0; i<jumble.length(); i++){
			System.out.println("d.indexOf " + d.indexOf(jumble.substring(i,i+1)));
			if (d.indexOf(jumble.substring(i,i+1)) >= 0){
				n1 += Integer.parseInt(jumble.substring(i,i+1));
				System.out.println("n1: " + n1);
			} else {
				n2++;
				System.out.println("n2: " + n2);
			}
		}
		
		System.out.println(n1+n2);

	}

}
