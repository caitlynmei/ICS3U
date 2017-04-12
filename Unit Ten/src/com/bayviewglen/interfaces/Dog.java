package com.bayviewglen.interfaces;

public abstract class Dog implements Animal {

	private String hairColour;
	private int rested;
	private int belly; 

	public Dog(){
		this.hairColour = "Black";
	}

	public Dog(String hairColour){
		this.hairColour = hairColour; // this. refers to this particular instance
	}
	
	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

	@Override // overriding parent
	public void eat(int amount, String foodType) {
		belly += amount;
	}

	@Override
	public void sleep(int minutes) {
		rested += minutes;
	}
	
	
}
