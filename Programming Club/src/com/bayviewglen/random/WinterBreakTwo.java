package com.bayviewglen.random;

import java.util.Arrays;

public class WinterBreakTwo {

	public static void main(String[] args) {
		
		int[] arr = {231, 45, 6, -92};
		
		System.out.println("This is 2: " + Arrays.toString(getTensDigit2(arr)));
		System.out.println(Arrays.toString(getTensDigit3(arr)));

	}

	public static int[] getTensDigit3(int[] arr) {
		int[] tensDigit = new int[arr.length];
		for (int i=0; i<arr.length; i++){
			if (arr[i] > -10 && arr[i] < 10){
				arr[i] = -1;
				tensDigit[i] = -1;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			if (arr[i]>0)
				tensDigit[i] = arr[i]%100/10;
		}
		
		return tensDigit;
	}

	public static int[] getTensDigit2(int[] arr){
		int[] tensDigit = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			if (arr[i]>-10 && arr[i]<10)
				tensDigit[i] =-1;
			else 
				tensDigit[i] = Math.abs((arr[i]%100)/10);
		}
		
		return tensDigit;
	}

	

}
