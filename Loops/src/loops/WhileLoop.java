package loops;

/*
 * Used when we don't know how many iterations
 * 
 * Syntax : 
 * 			while(condition){
 * 
 * 			i++/i--
 * }
 * 
 * 
 */

//Dice Game 

public class WhileLoop {
	public static void main(String[] args) {
		
		int dice = (int) ((Math.random()*6) +1); // 0.0 > 0.9999999999999 <1.0
		
		while(dice != 6) {
			System.out.println("Dice : "+dice);
			
			dice = (int) ((Math.random()*6) +1);
		}
		
	}

}
