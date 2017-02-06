package com.bayviewglen.january;

import java.util.Arrays;

public class InsertionSortPractice {

	public static void main(String[] args) {
		
		int[] arr = {12, 4, 6, 3, 5, 9};
		
		for (int i=1; i<arr.length; i++){
			int temp = arr[i];
			int j;
			for (j=i-1; j>=0; j--){
				if (arr[j] > temp){
					arr[j+1] = arr[j];
				} else {
					break;
				}
			} 
			arr[j+1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
