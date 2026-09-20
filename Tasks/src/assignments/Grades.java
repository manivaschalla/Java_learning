package assignments;
import java.util.*;

public class Grades {
	public static void main(String[] args) {
		
		System.out.print("Enter Marks : ");
		
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		
		String grade = (marks>= 90 && marks<=100)? "Grade : A"
				: (marks >=80 && marks <90)? "Grade : B"
						: (marks >=70 && marks <80)? "Grade : c"
								: (marks >=50 && marks <70)? "Grade : D"
										: (marks >=0 && marks <50)? "Fail"
												: "Invalid Marks";
		System.out.println(grade);
		
		System.out.println();
		
		System.out.println("By using if else");
		
		if (marks >= 90 && marks <= 100) {
			System.out.println("Grade : A");
		}else if(marks >= 80 && marks < 90) {
			System.out.println("Grade : B");
		}else if(marks >= 70 && marks < 80) {
			System.out.println("Grade : C");
		}else if(marks >= 50 && marks <70) {
			System.out.println("Grade : D");
		}else if(marks >= 0 && marks < 50) {
			System.out.println("Fail.....! Retry again...");
		}else {
			System.out.println("Invalid Marks");
		}
		
		
		
		
		
		
		
	}

}
