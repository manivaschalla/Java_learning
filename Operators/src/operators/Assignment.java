package operators;

/*
 * 
 * Used to assign values to variables:
	= : Assign (a = 10)
	+= : Add and assign (a += 5) -> a = a + 5
	-= : Subtract and assign (a -= 5)
	*= : Multiply and assign (a *= 5)
	/= : Divide and assign (a /= 5)
	%= : Modulus and assign (a %= 5)
 * 
 * 
*/
public class Assignment {
	public static void main(String[] args) {
		int a = 10;
		a += 5;
		a -= 2;
		a *= 3;
		a /= 2;
		a %= 4;
		System.out.println("Final a: " + a);

	}

}
