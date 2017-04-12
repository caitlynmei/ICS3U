package com.bayviewglen.interfaces;

public interface Animal {

	public void eat(int amount, String foodType); // interfaces have methods without a body --> abstract method
	
	public void sleep(int minutes);
	
	/*
	public void sleep(int minutes){ 	// non-static methods cannot have a body 
		System.out.println("Sleeping for " + minutes + " minutes");
	}
	*/
	
	// void after static
	public static void repeat(String msg){		// static methods with bodies are allowed
		System.out.println(msg + " " + msg);	// static methods belong to the Class/Interface
	}
	
	// public static void repeat();				// static method MUST have a body
	
	// static must have a body
	// non-static cannot have a body
	
	public static final int CONSTANT = 20; 
	
	public String animalType = "AnImAl TyPe"; 		// variables have to be set
	
}
