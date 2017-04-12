package com.bayviewglen.interfaces;

public class Puppy extends Dog { 
	
	// you extend a class that has a constructor with an argument,
	// you need to create a new constructor
	
	public Puppy(String abc){
		super(abc);	// If you call your parents' constructor in your
		int x = 0;
		// constructor, make sure it's the first thing you do (first line
	}
	
	// dynamic binding 
	public void sleep(int amt){
		amt += 3;
		super.sleep(2 * amt);
	}
	
	public void makeAccident(String where){
		System.out.println("Better get the Spray Bottle");
	}
	
	
	
	// If the child class does not write its OWN constructor, it will attempt to 
	// call super() -- that's your parent's no argument constructor
	// need a constructor that matches your parent 
	
}
