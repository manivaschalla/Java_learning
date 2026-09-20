package com;

public class AcRemote extends Remote{
	
	@Override
	void turnOn() {
		System.out.println("Daikin Turning on...");
	}
	
	void controlTemp() {
		System.out.println("Incerease or decrease temp");
	}

}
