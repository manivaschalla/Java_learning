package com;

public class DemoString {
	public static void main(String[] args) {
		
		//Strings have indexing(start's from 0)
		
		String s1 = "HAI";
	 	String s2 = "Hello";
		String s3 = "HAI";  // String pool do not accept duplicates. s1 and s3 share the same value address
		String s4 = "hai";
		
		//Creating strings via classes
		String s5 = new String("VAMSI");
		String s6 = new String("VAMSI");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3); // both s1 and s3 are pointing to same reference.
		System.out.println(s1 == s4);
		
		System.out.println(s5.equals(s6)); // .equals() method compare's the content of the string
		System.out.println(s5 == s6); // the new keyword creates new space for each variable.
		

	}

}
