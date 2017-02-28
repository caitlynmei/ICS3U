package com.bayviewglen.dayOne;

public class Coin {
	private String face;

	public Coin(){ //constructor, only method you don't specify return type. Just initialize it
		flip();
	}
	
	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}
	
	public void flip(){
		if (1 == (int) (Math.random() * 2))
			face = "heads";
		else 
			face = "tails";
	}
	
	public boolean isHeads(){
		return face.equals("heads");
	}
	
	public String toString(){ // so you don't print the address 
		return face;
	}
	
}