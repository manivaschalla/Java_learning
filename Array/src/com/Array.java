/*
 * 
Array => Non Primitive data type

Array is a collection of elements of same data type

Size 10 = 10 Elements

Size 20 = 20 Elements

Fixed Size

 1 => Declare & Initialize latter

		int[] numbers ;

		numbers = new int[6];

 2 => Declare & Initialize in one line

		int[] arr = new int[6];  //6 values 

 3 => Direct Initialization

		int[] arr = {1,2,3,4,5,6};

 


*/
package com;


import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		int[] marks = new int[5];
		
		marks[0] = 93;
		marks[1] = 75;
		marks[2] = 68;
		marks[3] = 87;
		marks[4] = 81;
		//marks[5] = 95;
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		//System.out.println(marks[5]);
		
		char[] grades = {'A', 'B', 'C', 'D'};
		System.out.println(grades);
		
		grades[3] = 'F'; // updating existing value


System.out.println(grades);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the SIZE : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		
		for(int i = 0; i< size; i++) {
			System.out.println("Enter value of "+ i);
		
			arr[i] = sc.nextInt();
		}
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		for(int i = 0; i< size; i++) {
			System.out.println("value of "+ i+ " Index :"+arr[i]);
		}
		
		
		
	}

}
