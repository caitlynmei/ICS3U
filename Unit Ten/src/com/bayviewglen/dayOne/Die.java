package com.bayviewglen.dayOne;

public class Die {
	private int numSides; //project instance variable
	private int top;
	
	public Die(){
		numSides = 6;
		roll();
	}
	
	public Die(int numSides){
		this.numSides = numSides;
	}

	public void roll(){
		top = (int)(Math.random() * numSides) + 1;
	}
	
	public int getTop(){
		return top;
	}
	
	public int getNumSides() {
		return numSides;
	}
	
	public String toString (){
		return "" + getTop();
	}
	
	
}
