package com.bayviewglen.loops;

import java.util.ArrayList;
import java.util.List;

public class SampleLoops {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		List<Integer> arrList = new ArrayList<Integer>();

		for (int x : arr) {
			arrList.add(x);
		}

		for (int x : arrList) {
			System.out.println(x);
		}

		int i = 0;
		for (int x : arrList) {
			System.out.println(x);
			arrList.set(i, x + 1);
			i++;
		}

		for (int x : arrList) {
			System.out.println(x);
		}
		/*
		i=0; 
		for (int x : arrList){ 
			if (i==1) arrList.remove(1); 
			i++; 
		}
		*/

		for (i = 0; i < arrList.size(); i++) {
			if (i == 1)
				arrList.remove(1);
			System.out.println(i + " " + arrList.get(i));

		}

	}

}
