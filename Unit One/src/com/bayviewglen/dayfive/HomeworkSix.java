package com.bayviewglen.dayfive;

public class HomeworkSix {

	public static void main(String[] args) {

		double x = 5.5, y = 3.0, z = -2.0;
		int i = 5, j = 4, k = 3;
		
		x += y; // 5.5 + 3.0 = 8.5
		y += y; // 3.0 + 3.0 = 6.0
		z += x - y; // -2.0 + (5.5 - 3.0) = 0.5
		i *= j + k; // 5 * (4 + 3) = 35
		j /= k; // 4 / 3 = 1 
		
		System.out.println(x + ", " + y + ", " + z + ", " + i + ", " + j);

	}

}
