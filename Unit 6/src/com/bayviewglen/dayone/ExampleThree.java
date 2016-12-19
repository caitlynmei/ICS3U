package com.bayviewglen.dayone;

public class ExampleThree {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		
		mystery(nums);
		
		System.out.println(nums); //rn just printing address

	}

	private static void mystery(int[] arr) {
		for (int i=0; i<arr.length; ++i){
			arr[i] *= 2; // arr[i] = 2 * arr[i]; 
		}
		
	}
	
	

}
