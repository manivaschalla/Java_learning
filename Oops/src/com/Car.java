package com;

public class Car {
	
	String model;
	String company;
	String color;
	int price;
	int gare;
	int speed;
	
	Car(){
		
	}
	Car(String model, String company, String color, int price, int gare, int speed){
		
		this.model = model;
		this.company = company;
		this.color = color;
		this.price = price;
		this.gare = gare;
		this.speed = speed;
		
	}
	
	void start() {
		System.out.println("Starting "+ model +" car....");
	}
	void stop() {
		System.out.println("Stopping car....");
	}
	void gareUp() {
		gare++;
		System.out.println(model+ " Gare UP " + gare);
		accelarate();
	}
	void gareDown() {
		gare--;
		System.out.println(model +" Gare Down "+ gare);
		deAccelarate();
	}
	void accelarate() {
		speed +=20;
		System.out.println("Accelarating speed "+ speed);
	}
	void deAccelarate() {
		speed -=20;
		System.out.println("Decreasing speed "+ speed);
	}
	void brake() {
		System.out.println("Applying break....");
	}



}
