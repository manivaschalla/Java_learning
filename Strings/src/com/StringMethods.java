package com;

public class StringMethods {
	public static void main(String[] args) {
		
				   //0123456
		String s1 = "Welcome";
		String s2 = "To The World";
				//   01234567891011
		String s3 = "WELCOME";
		String s4 = "     HAI   ";
		
		System.out.println("Length of s1 : "+ s1.length()); // Return's the length of the string
		System.out.println("Length of s2 : "+s2.length());
		
		System.out.println("Character at particular position :"+ s1.charAt(0)); // Returns the character at that particular  index.
		
		System.out.println("Substring of a string"+ s2.substring(7)); //returns the remaining string from the given index
		
		System.out.println("Check the given string is present or not : "+ s2.contains("The")); // Return Boolean
		
		System.out.println("Check's the content of the string S1 and S3 : "+ s3.equals(s1)); 
		
		System.out.println("Ignoring the case of the string : "+ s3.equalsIgnoreCase(s1));
		
		System.out.println("Changes to lower case : "+ s3.toLowerCase());
		
		System.out.println("Changes to lower case : "+ s1.toUpperCase());
		
		System.out.println("Trims the empty spaces : "+ s4.trim());
		
		System.out.println("Replaces the character : "+ s3.replace('E', 'A'));
		
		String str = "F,L,M";
		
		String[] parts = str.split(",");
		System.out.println("Splits the string into parts : "+ parts[0]);
		
		System.out.println("Returns the index of starting char : "+ s1.indexOf('e'));
		
		System.out.println("Returns the last index of given char : "+ s1.lastIndexOf('e'));
		
		System.out.println("Return's the starting of a string : "+ s2.startsWith("To"));
		
		System.out.println("Return's the Ending of a string : "+ s2.endsWith("ld"));
		
		
	}

}
