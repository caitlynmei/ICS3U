package com.bayviewglen.january;

public class twentySix {

	public static void main(String[] args) {
		
		int total = 0, num = 0;
		while (total >= 0 && num<100){
			total+=num;
			if (num<50)
				num+=10;
		}
		
		System.out.println(num + " " + total);
		
	}

}
