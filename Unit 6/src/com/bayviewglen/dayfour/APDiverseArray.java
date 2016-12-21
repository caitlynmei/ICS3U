package com.bayviewglen.dayfour;

public class APDiverseArray {

	
	static int[] arr = {1, 2, 3, 4, 5, 6, 9};
	static int[][] arr2D = {
								{1, 2, 3, 4, 8},
								{1, 3},
								{10, 23, -1, 23, 56},
								{5, 3, 1, 2}
							};
	
	public static void main(String[] args) {
		
		int sum = arraySum(arr);
		System.out.println("The sum is: " + sum);
		
		int[] sum2D = rowSums(arr2D);
		display(sum2D);
		
		System.out.println(isDiverse(arr2D));

		
	}

	// --- C ---
	private static boolean isDiverse(int[][] rogueTwo) {
		boolean diverse = true;
		int[] sum2D = rowSums(arr2D);
		
		for (int i=0; i<sum2D.length; i++){
			for (int j=i+1; j<sum2D.length; j++){
				if (sum2D[i] == sum2D[j])
					return false;
			}
		}
		
		return diverse;
		
	}

	private static void display(int[] sum2d) {
		for (int i=0; i<sum2d.length; i++){
			System.out.print(sum2d[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
	}

	// B
	public static int[] rowSums(int[][] rogueOne) {
		int[] sums = new int[rogueOne.length];
		
		for (int i=0; i<rogueOne.length; i++){
			sums[i] = arraySum(rogueOne[i]);
		}
		
		return sums;
		
	}

	// --- A ---
	public static int arraySum(int[] arr) {
		int sum = 0;
		
		for (int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		return sum;
	}

}
