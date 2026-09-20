package com;

public class TvRemote extends Remote{
	
	@Override
	// cannot change the parameter and return type
	void turnOn() {
		System.out.println("Samsung Turning on...");
	}
	
	int volume = 0;
	void increaseVolume() {
		this.volume = this.volume+1;
		System.out.println("Increasing volume"+ volume);
	}
	
	void increaseVolume(int volume) {
		this.volume += volume;
		System.out.println("volume : "+this.volume);
	}

}
