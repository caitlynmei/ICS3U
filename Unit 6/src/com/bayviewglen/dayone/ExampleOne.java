package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, -3, 4, 15};
		
		int sum = 0;
		
		for (int i=0; i<arr.length; ++i){
			sum += arr[i];
		}
		
		System.out.println((double)sum / arr.length);

	}

}
