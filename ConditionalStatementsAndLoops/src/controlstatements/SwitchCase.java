package controlstatements;

import java.util.Scanner;

/*
 * 	Switch support : byte, short, int, String, char
 * 
 * 	Switch didn't support : long, float, double, boolean
 * 
 * 
 * switch(expression){
 * 	case value1:
 * 			//code for value1
 * 			break;
 * 	case value2:
 * 			//code for value2
 * 			break;
 * 
 * 	.....
 * 
 * 	default:
 * 		// Default code if no match
 * 
 * }
 */


public class SwitchCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What day is Today...??");
		
		String day = sc.nextLine();
		
		switch(day) {
		case "Monday":
			System.out.println("Today is Monday => Go to WORK :(");
			break;
		case "Tuesday":
			System.out.println("I want to RESIGN :{");
			break;
		case "Wednesday":
			System.out.println("I have EMI's on my back {..}");
			break;
		case "Thursday":
			System.out.println("What if i get married...? She can pay my EMI'S so i can Quit");
			break;
		case "Friday":
			System.out.println("Finally....! WeekEnd...:)");
			break;
		case "Saturday":
			System.out.println("I have to wash my clothes");
			break;
		case "Sunday":
			System.out.println("Weekend completed.......:(");
			break;
		default:
			System.out.println("Enter correct input.....");
		}
		
	}

}
