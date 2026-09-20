package controlstatements;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		System.out.println("Enter Marks : ");
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
		
		if (marks >= 90 && marks <= 100) {
			System.out.println("Grade : A");
		}else if(marks >= 80 && marks < 90) {
			System.out.println("Grade : B");
		}else if(marks >= 70 && marks < 80) {
			System.out.println("Grade : C");
		}else if(marks >= 50 && marks <70) {
			System.out.println("Grade : D");
		}else if(marks >= 0 && marks < 50) {
			System.out.println("Fail..... Better Luck Next Time....!");
		}else {
			System.out.println("Invalid Marks");
		}
		sc.close();
	}

}
