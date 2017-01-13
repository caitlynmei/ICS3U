package com.bayviewglen.january;

import java.util.Arrays;

public class SelectionInsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {42, 13, 98, 92, 107, 3};
		
		// selection sort: smallest to largest
		
		for (int i=0; i<arr.length-1; i++){
			int smallestIndex = i; // remember!!! i changes each time
			for (int j=i+1; j<arr.length; j++){
				if (arr[j] < arr[smallestIndex]){
					smallestIndex = j;
				}
				int temp = arr[i];
				arr[i] = arr[smallestIndex];
				arr[smallestIndex] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	
		int[] newArr = {42, 13, 98, 92, 107, 3};
		// insertion sort: smallest to largest
		
		for (int i=1; i<newArr.length; i++){
			int nextNumber = newArr[i];
			int j;
			for (j=i-1; j>=0; j--){ 
				if (newArr[j] > nextNumber){
					newArr[j+1] = newArr[j];
				} else {
					break;
				}
			}
			newArr[j+1] = nextNumber; 
		}
	
		System.out.println(Arrays.toString(newArr));
		
	}

}
