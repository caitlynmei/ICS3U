package com.bayviewglen.dayfour;

import java.util.ArrayList;

public class ExampleOne {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>(); // need to specify type

		marks.add(new Integer(7));
		marks.add(29); 		// auto boxing 
		
		// you can give an Integer object an int, you can swap
	
		int x = 3 + new Integer(9); // auto unboxing
		
		marks.add(0, 100); 	// inserts at index 0
		
		System.out.println(marks); // can see order
		
		int y = marks.set(1, 200); // replace
		
		System.out.println(marks);
		
		System.out.println(y);
		
		int z = marks.remove(1);
		
		System.out.println(marks);
		
		System.out.println(z);
		marks.add(1, 200);
		
		System.out.println(marks);
		
		marks.add(0, 200);
		System.out.println(marks);
		marks.remove(new Integer(200));
				
		System.out.println(marks);
		
	}
	
}
