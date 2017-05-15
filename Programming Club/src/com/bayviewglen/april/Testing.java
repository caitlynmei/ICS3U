package com.bayviewglen.april;

public class Testing {

	private double num;
	
	public Testing() {
		
	}
	
	public Testing(double myNum){
		num = myNum;
	}
	
	public void setNum(double myNum){
		num = myNum;
	}
	
	public double getSquareRoot(){
		double result = Math.sqrt(num);
		return result;
	}

}
