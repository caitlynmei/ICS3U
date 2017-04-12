package com.bayviewglen.interfaces;

public class Driver {

	public static void main(String[] args) {
		
		Animal x; 		// reference to an Animal (Any kind of animal)
		//x = new Animal();	// you cannot instantiate interfaces
							// cannot say give me a new instance of an interface
		
		// Animal.repeat();		// static methods and variables can be called directly 
		Animal.repeat("Test");	// through the interface
		
		// Dog dog1 = new Dog("Black"); // A Dog is a Dog but cannot be instantiated since it's abstracgt
		// x = new Dog("White");		// A Dog is an Animal - see above
		
		// dog1.setHairColour("Red");
		
		// x.setHairColour("Yellow"); 		// can only access methods exposed through Animal
			
		Animal animal = new Puppy("Grey");
		
		animal.eat(10, "kibble");
		// animal.setColour("Black");	// Yikes! not in Animal 
		
		
		// polymorphism 
		Dog dog2 = null;
		if (animal instanceof Dog)
			dog2 = (Dog) animal;
		
		if (dog2 instanceof Puppy)
			((Puppy)dog2).makeAccident("Kid\'s Room!"); 
			
		Animal dog3 = new AdultDog();
		dog3.sleep(6);
		dog2.sleep(6);
		animal.sleep(6);
		
	}

}
