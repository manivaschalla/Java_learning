package com;
/*
 * WRAPPER CLASS
 * 
 * jAVA IS NOT 100% OOP language because of Primitive Data Types 
 * To archive 100% OOP wrapper classes are introduced
 * All wrapper classes are immutable classes
 * -----------------------------------------------------
 *  Primitive Data type			Wrapper Class
 * 		byte				-		Byte
 * 		short				-		Short
 * 		int 				-		Integer
 * 		long				-		Long
 * 		
 * 		double				-		Double
 * 		float				-		Float
 * 
 * 		char				-		Character
 * 
 * 		boolean				-		Boolean
 * 
 * -----------------------------------------------------
 * 
 * 2 Types 
 * 	 AutoBoxing
 * 			primitive -> Wrapper
 * 				int -> Integer
 * 	 AutoUnboxing
 * 			Wrapper -> Primitive
 * 				Integer -> int
 * 
 * 
 * 
 */

public class Test {
	public static void main(String[] args) {
		
		int a = 10;
		int x = 80;
		Integer y = 90;
		
		Integer b = new Integer(20);
		Integer c = Integer.valueOf(30);
		
		//java5
		Integer d = Integer.valueOf(a);
		int e = c.intValue();
		
		//java5
		Integer f = x;
		int g = y;
		
		///System.out.println(a);
		
		String z = "30";
		
		int num1 = Integer.parseInt(z);
		System.out.println(num1+3);
		
		
		
		
		
		
		
		
	}

}
