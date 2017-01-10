package com.bayviewglen.random;

import java.util.Arrays;

public class WinterBreak {

	public static void main(String[] args) {
		
		String[] arr = {"AP Microeconomics", "AP Chemistry", "History", "AP Comp Sci"};
		
		String x = "AP Computer Science";
				
		int count = 0, num = 0;
		
		if (arr[num].indexOf("AP")>=0){
			count++;
			num++;
		}

		System.out.println(count + "\n\n\n");
		
		// --------------------------
		
		boolean z = false;
		
		if (!z){
			System.out.println(z);
		}
		
		int[] y = new int[12];
		for (int i=0; i<y.length; i++){
			y[i] = 5*(i/4);
		}
		
		System.out.println(sSearch(y, 5));
		
		System.out.println("\n\n\n");
		
		// --------------------------
		
		String str3 = "alluring";
		int count20 = 1, i20 = 0;
		
		while (i20 < str3.length()-1 && str3.substring(i20, i20+1).compareTo(str3.substring(i20+1, i20+2)) <= 0){
			count20++;
			i20++;
		}
		
		System.out.println("There are: " + count20);
		
		System.out.println("\n\n\n");
		
		// --------------------------
		
		int count2 = 9;
		int sum = 500;
		
		if (count2 > 0)
			System.out.println(sum/count2);
		System.out.println("0\n\n\n\n");
		
		// ----------------------------
		
		int[] nums1 = {1, 2, 3, 4};
		int[] nums2 = {1, 2, 3, 4};
		int total = 0, j = nums2.length-1;
		
		for (int i=0; i<nums1.length; i++){
			total += nums1[i] * nums2[j];
			System.out.print(total);
			j--;
		}
		
		System.out.println("\n\n\n");
		
		// --------------------------------
		
		int[] orig = {1, 2, 3, 4, 5};
		int[] changed = orig;
		
		System.out.println(Arrays.toString(orig));
		System.out.println(Arrays.toString(changed));
		int bonus = 5;
		
		for (int i=0; i<changed.length; i++){
			changed[i] += 5;
		}
		
		System.out.println("New One: " + Arrays.toString(changed));
		System.out.println("Old One: " + Arrays.toString(orig));
	
		for (int i=0; i<changed.length; i++){
			System.out.print(changed[i] - orig[i] + " ");
		}
		
		System.out.println("\n\n\n");
		
		// -------------------------------
		
		int t = 10;
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//System.out.println("Original: ");
		//System.out.println(arr3);
		
		int [] arr4 = new int[50];
		
		for (int i=0; i<50; i++){
			arr4[i] = i+1;
			System.out.print(arr4[i]);
		}
		
		System.out.println();
		
		/*
		for (int i=0; i<t; i++){
			int m = (int) (Math.random() * arr3.length);
			int n = (int) (Math.random() * arr3.length);
			arr3[m] = arr3[n];
		}
		*/
		/*
		System.out.println();
		String happy = "Happy";
		System.out.println(happy);
		happy = happy + " me";
		System.out.println(happy);
		*/
		
		System.out.println(shuffle(1000, arr4));
		
	}
	
	public static int[] shuffle(int t, int[] x){
		for (int i=0; i<t; i++){
			int j =(int)(Math.random()*x.length);
			int k =(int)(Math.random()*x.length);
			x[j] = x[k];
		}
		
		System.out.println(Arrays.toString(x));
		
		return null;
	}
	
	// -----------------------
	
	public static String sSearch (int[] x, int key){
		String y = "";
		boolean z = false;
		for (int i=0; i<x.length; i++){
			if (x[i] == key){
				y += i + " ";
				z = true;
			}
		}
		
		if (!z){
			y = "key not found";
		}
		
		return y;
		
	}
	
	public static void testMethod(){
		int[] y = new int[12];
		for (int i=0; i<y.length; i++){
			y[i] = 5*(i/4);
		}
		
		System.out.println(sSearch(y, 5));
	}
	
}
