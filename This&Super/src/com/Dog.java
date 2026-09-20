package com;

public class Dog extends Animal {
	
	String breed;
	
	Dog(String breed){
		this.breed = breed;
		super.numOfLegs = 4;
	}
	
	void sound() {
		//this.breed = "Husky";
		System.out.println(breed);
		System.out.println("Dog is barking");
		System.out.println(" It contains "+ super.numOfLegs+" Number of legs");
	}
	
	// --> Cannot be used inside a Static method
	
//	static void print() {
//		System.out.println(this.breed);
//	}
//	
	

}
