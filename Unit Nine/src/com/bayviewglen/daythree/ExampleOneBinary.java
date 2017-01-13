package com.bayviewglen.daythree;

public class ExampleOneBinary {

	public static void main(String[] args) {
		// Binary Search: call a sorting algorithm (merge) to first sort Array

	}
	
	int binarySearch (int[] arr, int search, int low, int high){
		int mid = (low + high)/2;
		if (low > high){
			return -1;
		} else if (arr[mid] == search){
			return mid;
		} else if (search < arr[mid]){
			return binarySearch(arr, search, low, mid-1);
		} else { // (search > arr[mid])
			return binarySearch(arr, search, mid+1, high);
		}
	}

}
