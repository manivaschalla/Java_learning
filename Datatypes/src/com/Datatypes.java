package com;

public class Datatypes {
	/*
	 * There are two types of DATATYPES in java 
	 * 
	 * 		Primitive 						Non-Primitive
	 *  1) Integer						1) Classes
	 *  2) Floating Point				2) Arrays
	 *  3) Character					3) Interfaces
	 *  4) Boolean						4) Strings
	 *  
	 *  Each primitive datatype has a some sub types init: 
	 *  
	 *  Integer :
	 *  	- Store whole number both positive and negative
	 *  	- 4 types
	 *  	
	 *  	- 	-2^(bit-1) to 2^(bit-1)-1
	 *  
	 *  Default		DT		SIZE		range
	 *  
		    0  		byte  - 1 byte   ->  2^7 to (2^7)-1
	 *  	
	 * 		0		short - 2 byte  ->  2^15 to (2^15)-1
	 *  
	 *  	0		int   - 4 byte  ->  2^31 to (2^31)-1
	 *  
	 *  	0L		long  - 8 byte  ->  2^63 to (2^63)-1

	 *  
	 *  Floating point :
	 *  			- It stores the decimal numbers
	 *  			- 2 Types
	 *  	float - Single-precision 32 bit floating point
	 *  		  - can hold upto 7 decimal values after point
	 *  
	 *  	Double - Double-Precision 64 bit floating point
	 *			   - can hold upto 7 decimal values after point
	 *			   - Default choice for decimal values
	 *
	 *	Default		DT		SIZE		range
	 *
	 *  0.0f	  float		4 byte		Approximately ±3.4e−038 to ±3.4e+038
	 *  0.0d	  double	8 byte		Approximately ±1.7e−308 to ±1.7e+308
	 *  
	 *  
	 *	Character : 
	 *			- Used to store a single 16-bit Unicode character, letter & symbols.
	 * 
	 * 	Default		DT		SIZE		range
	 * 
	 * 	'\u0000' 	char	2 bytes		0 to 65,535 (Unicode characters)
	 * 
	 *	Boolean :
	 *			- Only two possible vales: true and false
	 *
	 *	Default		DT		SIZE		Values
	 * 
	 *	false	 boolean    1 bit		true/false
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		
		byte totalFingers = 19;
		
		short daily_Steps = 12532;
		
		int km_Driven = 170530;
		
		long mobileNumber = 9800000089l; // for long we have to mention 'l/L'
		
		float height = 5.7f;  // for long we have to mention 'f/F'
		
		double current_Temp = 7.0;
		
		char grade = 'A';
		
		boolean testPassed = true;
		
		
		System.out.println("This man consist of "+ totalFingers+"Fingers");
		System.out.println("My daily steps count is "+ daily_Steps);
		System.out.println("I totally drove this vehicle upto "+ km_Driven +"kilometers.");
		System.out.println("You can call me on "+mobileNumber+ ".");
		System.out.println("My Current Height is "+height);
		System.out.println("The current Temperacture outside is "+ current_Temp+" celsius");
		System.out.println("I have obtained an "+grade+" grade.");
		System.out.println("am above 18+ years of age "+ testPassed);
	}

}
