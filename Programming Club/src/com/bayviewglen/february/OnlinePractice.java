package com.bayviewglen.february;

import java.util.Arrays;

public class OnlinePractice {

	public static void main(String[] args) {
		/*
		int[] x = new int[50];
		
		for (int i=0; i<x.length; i++){
			x[i] = i;
		}
		
		System.out.println(Arrays.toString(x));
		
		System.out.println(mystery(x, 20));
		*/
		// ----------
		
		String s = "what";
		
		System.out.println(highestChar1(s));
		
	}
	public static String highestChar1(String s) {
		String max = s.substring(s.length()-1);
		for (int i=0; i<s.length(); i++){
			if (s.substring(i,i+1).compareTo(max)>0)
				max = s.substring(i,i+1);
		}
		return max;
	}
	/*
	public static String highestChar(String s){
		String max = s.substring(s.length()-1);
		for (int i=1; i<s.length(); i++){
			if (s.substring(i-1,i) > i)
				max = s.substring(i-1);
		}
		
		return max;
	}
	*/
	
	
	/*
	public static int mystery(int[] x, int key) {
		
		int q = 0;
		int low = 0; 
		int high = x.length - 1;
		
		while (low <= high){
			int mid = (low + high)/2;
			q++;
			if (key > x[mid])
				low = mid + 1;
			else if (key < x[mid])
				high = mid - 1;
			else
				return q;
		}
		return q;
	}
	*/
}
