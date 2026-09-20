package com;

public class StringPratice {
	public static void main(String[] args) {
		
		// Reversing a String
		
			//METHOD : 1
				   //0123456
//		String s1 = "EDUTECH";
//		
//		for(int i = 6; i>=0; i--) {
//			System.out.print(s1.charAt(i));
//		}
//		
			//METHOD : 2
		
		
		
//		a
//		ab
//		abc
//		abcd
//		b
//		bc
//		bcd
		
		
		String input = "abcd";
		
		for(int i = 0; i<=3; i++) {
			
			for(int j =i; j<=3; j++) {
				
				String temp = input.substring(i, j+1);
				System.out.println(temp);
			}
		}
		
		
		
		
	}

}
