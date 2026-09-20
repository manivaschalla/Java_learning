package com;

/*
 * Overriding / Run - time / Dynamic / Late Binding
 * 
 * To obtain run time polymorphism we need parent and child relation.
 * 
 * 1. @Override is not mandatory.
 * 2. cannot change parameters.
 * 3. cannot change return type.
 * 4. Static methods cannot be override.
 * 5. when we try to override static method its called Method Hiding
 * 
 */

public class Overriding {
	public static void main(String[] args) {
		
		
		AcRemote ac = new AcRemote();
		ac.turnOn();
		
		TvRemote tv = new TvRemote();
		tv.turnOn();
		tv.increaseVolume();
		tv.increaseVolume(5);
		
		Remote remote = new Remote();
		remote.turnOn();
	}

}
