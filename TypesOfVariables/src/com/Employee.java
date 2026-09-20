package com;

/*
	In Java, variables are classified into three main types:
		1. Instance Variables
		2. Static Variables (Class Variables)
		3. Local Variables
		
		
		1. Instance Variables
				Definition:
				 Declared inside a class but outside any method or constructor.
				 Each object of the class has its own copy.
				 Stored in Heap Memory.
				 Accessible only through object reference

		2. Static Variables (Class Variables)
				Definition:
				 Declared with the static keyword inside a class but outside any method or constructor.
				 Belongs to the class, not to individual objects.
				 Stored in Method Area.
				 Loaded when the class is loaded.
				 Can be accessed without creating an object.
				
		3. Local Variables
				Definition:
				 Declared inside a method, constructor, or block.
				 Stored in Stack Memory.
				 Scope is limited to the method or block.
				 Not accessible outside the method.
				 No default values – must be initialized explicitly.
				
				
*/


public class Employee {
	
	String employeeName;
	
	int empID;
	
	static String companyName;

}
