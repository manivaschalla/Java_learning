package assignments;

import java.util.Scanner;

public class CtcCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double baseSalary = sc.nextDouble();
		double pfPer = 12.0;
		double HRAPer = 70.0;
		double allowancePer = 25.0;
		double pf = (pfPer / 100)*baseSalary;
		double HRA = (HRAPer / 100)*baseSalary;
		double allowance = (allowancePer / 100)*HRA;
		double CTC = baseSalary + pf + HRA + allowance;
		
		
		
		System.out.println("Basic Salary : "+baseSalary);
		System.out.println("PF : "+ pf);
		System.out.println("HRA : "+ HRA);
		System.out.println("Allowance : "+ allowance);
		System.out.println("CTC : "+CTC);
		
		
	}
	

}
