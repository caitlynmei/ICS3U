package com.bayviewglen.dayfour;

public class HomeworkFive {

	public static void main(String[] args) {
	
		double x = 5.5, y = 3.0, z = -2.0;
		int i = 5, j = 4, k = 3;
		
		double term1 = x - y;
		double term2 = i - j;
		double term3 = x + term2;
		double term4 = -1 * term1;
		double term5 = i + j;
		double term6 = i - j;
		double term7 = i * j;
		int term8 = i / j;
		double term9 = i + k;
		double term10 = i - k;
		double term11 = j / k;
		double term12 = x / k;


		
		// System.out.println(i - (i - (i - (i - j))));
		System.out.print("The answer to 5.a) is ");
		System.out.println((int) (i - term2) + "."); // 5.a
		System.out.println("");

		
		// System.out.println((x - y) * (x + (i - j)));
		System.out.print("The answer to 5.b) is ");
		System.out.println(term1 * term3 + "."); // 5.b
		System.out.println("");

		
		// System.out.println((x - y) - (y - x) - (x - y) - (y - x));
		System.out.print("The answer to 5.c) is ");
		System.out.println(-2 * term4 + "."); // 5.c
		System.out.println("");

		
		// System.out.println((x - y) - ((y - x) - ((x - y) - (y - x))));
		System.out.print("The answer to 5.d) is ");
		System.out.println(2 * (term1 - term4) + "."); // 5.d
		System.out.println("");

		
		// System.out.println(i + j - k * i / j);
		System.out.print("The answer to 5.e) is ");
		System.out.println((int) (term5 - k * term8) + "."); // 5.e
		System.out.println("");

		
		// System.out.println(i * j / k + i - j);
		System.out.print("The answer to 5.e) is ");
		System.out.println((int) (term7 / k + term6) + "."); // 5.f
		System.out.println("");


		// System.out.println(((i + k) * (i - k) / ((i + j) * (i - j))));
		System.out.print("The answer to 5.f) is ");
		System.out.println((int)(term9 * term10 / (term5 * term6)) + "."); // 5/g can this be simplified?
		System.out.println("");

		
		// System.out.println((double) i + j / k);
		System.out.print("The answer to 5.h) is ");
		System.out.println(i + term11 + "."); // 5.h
		System.out.println("");

		
		// System.out.println((int) x / k - x / k);
		System.out.print("The answer to 5.i) is ");
		System.out.println((int) term12 - x / k + "."); // 5.i
		System.out.println("");

		
		System.out.println((double) i / j - (double) (i / j)); 
		System.out.print("The answer to 5.j) is ");
		System.out.println((int) term8 - (double) ((term8)) + "."); // 5.j
		
	}

}
