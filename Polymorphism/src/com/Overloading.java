package com;

/*
 * 
 *Compile - time polymorphism / Static Binding / Method overloading
 *	Rules :-
 *		1. Change num of parameters
 *			void sum(inta);
 *			void sum(int a, int b);
 *
 *		2. Changing data types
 *			int add(inta, intb); 
 *			double add(double a, double b);
 *
 *		3. Change the order of parameters and datatypes
 *
 *			void sum(int a, int b);
 *			void sum(int b, int a);// ambiguity
 *
 *			void sum(int a, string name );
 *			void sum(string name, int a );  // have to change the data tyes also
 *
 *		4. Main method can be overloaded
 * 		
 * 
 *
 */




public class Overloading {
	
	
		// --> 1. Change num of parameters
		
		void sum(int a) {
			System.out.println("Only one perametr"+a);
		}
		void sum(int a, int b) {
			System.out.println("perameter a "+a+" paramenter b "+b);
		}
		
		//---> 2. Changing data types
		void add(int a, int b) {
			System.out.println(a+b);
		}
		void add(double a, double b) {
			System.out.println(a+b);
		}
			
	}













