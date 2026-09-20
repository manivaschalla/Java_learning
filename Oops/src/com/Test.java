package com;

public class Test {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.color = "White";
		car1.company = "TATA";
		car1.model = "Safari";
		car1.price = 1500000;
		car1.gare = 0;
		car1.speed = 0;
		
		System.out.println(car1.model);
		System.out.println(car1.color);
		
		Car car2 = new Car();
		
		car2.color = "Black";
		car2.company = "Mahindra";
		car2.model = "7XO";
		car2.price = 1700000;
		car2.gare = 0;
		car2.speed = 0;
		
		Car car3 = new Car("Sonet", "KIA", "Blue", 100000, 0, 0);
		
		car1.color = "RED"; // Updating value
		
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car1.color);
		
		car1.start();
		car2.start();
		car3.start();
		
		
		System.out.println(car1.gare);
		car1.gareUp();
		System.out.println(car1.gare);
		
		car2.gareUp();
		
		car3.gareUp();
		
		
		car1.gareUp();
		car2.gareUp();
		car3.gareUp();
		
		
		car1.gareDown();
		car2.gareDown();
		car3.gareDown();
		
	}
	
}
