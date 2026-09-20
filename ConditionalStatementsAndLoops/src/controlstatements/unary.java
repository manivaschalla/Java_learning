package controlstatements;

import java.util.Scanner;

/*
 * -> Short form of if else 
 * -> syntax :
 * 		dt variable = (condition) ? true condition : false condition;
 * 
 */

public class unary {
	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
		
		String grade = (marks>= 90 && marks<=100)? "Grade : A"
				: (marks >=80 && marks <90)? "Grade : B"
						: (marks >=70 && marks <80)? "Grade : c"
								: (marks >=50 && marks <70)? "Grade : D"
										: (marks >=0 && marks <50)? "Fail"
												: "Invalid Marks";
		System.out.println(grade);
		sc.close();
	}
}
