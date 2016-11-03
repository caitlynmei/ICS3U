package com.bayviewglen.daytwo;

public class FramingSquares {

	public static void main(String[] args) {
	
		int m,n,p,q;
		m = 4;
		n = 6;
		p = 2;
		q = 1;
		
		for (int i = 1; i <= q; ++i){
			for (int j = 1; j <= n + 2*p + 2*q; j++){
				System.out.print("#");
			}
		System.out.println();
		}
		
		//System.out.print("#");
		
		for (int i = 0; i<= q; i++){
			for (int j = 0; j<=p;j++){
				System.out.print("#");
			}
			for (int k = 0; k < n; k++){
				System.out.print("+");
				
			}
			for (int j = 0; j<=p;j++){
				System.out.print("#");
			} 
			System.out.println();
		}
	
		
		for (int i = 1; i <= q; ++i){
			for (int j = 1; j <= n + 2*p + 2*q; j++){
				System.out.print("#");
			}
		System.out.println();
		}			

	}

}