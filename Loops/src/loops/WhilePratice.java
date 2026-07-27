package loops;

import java.util.Scanner;

public class WhilePratice {
	public static void main(String[] args) {
		
		
		// Reverse countdown from 10-0 anf print HAPPY NEWYEAR
		
//		int countdown = 10;
//		
//		while(countdown >= 0) {
//			System.out.println(countdown);
//			countdown--;
//		}
//		System.out.println("Happy NEWYEAR......!");
		
		
		//Multiplication table
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a table : ");
		int table = sc.nextInt();
		System.out.print("Enter how many times requried : ");
		int times = sc.nextInt();
		int count = 0;
		
		while(count <= times) {
			int res = table * count;
			System.out.println(table+" x "+count+" = "+res);
			count++;
		}
		
		
		
		
		
		
	}
	
	

}
