package loops;

/*
 * 	When we know no of iterations we use for loop.
 * 
 *  SYANTAX :-
 *  		for(initialization; condition; update){
 *  
 *  		}
 *  
 *  		OR
 *  
 *  		initialization //i= 0;
 *  
 *  		for(	; condition;	){
 *  
 *  			update // i++
 *  		}
 * 
 */

public class ForLoop {
	
	public static void main(String[] args) {
		
		 //int i = 0;
		
		 int count = 0;
		
		for(int i = 1; i<=100; i++){
		
			if(i % 2 ==0) {
				System.out.print(" "+i);
				count++;
			}
			if (count%10 ==0) {
				System.out.println();
			}
	}
		
		
//		for(; i<=10; ){ 
//			
//			if(i % 2 ==0) {
//				System.out.print(" "+i);
//				count++;
//			}
//			
//			i++;
//	}
//		
		
		System.out.println();
		System.out.println("Total nimber of even numbers :"+count);
	}
	
	

}
