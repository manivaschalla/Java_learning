package loops;

public class Patterns {
	public static void main(String[] args) {
		
//		****
//		****
//		****
//		****
		
		
//		for(int i=1; i<=4; i++) {
//			System.out.println();
//			for(int j = 1; j<=4; j++) {
//				System.out.print("*");
//			}
//		}
//		System.out.println();
		
		
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
//		1 2 3 4 5 
		
//		for(int i = 1; i<=3; i++) {
//			System.out.println();
//			for(int j = 1; j<=5; j++) {
//				System.out.print(" "+j);
//			}
//		}
//		System.out.println();
		
//		*
//		**
//		***
//		****
//		*****
		
//		for(int i = 1; i<=5; i++) {
//			System.out.println();
//			for(int j = 1; j<= i; j++) {
//				System.out.print("*");
//			}
//		}
//		
//		54321
//		5432
//		543
//		54
//		5
		
		for(int i = 1; i<=5; i++) {
			System.out.println();
			for(int j =5; j>=i; j--) {
				System.out.print(" "+j);
			}
			
		}
		
		
		
		
		
	}

}
