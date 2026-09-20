package operators;
/*
 *
 *Used to combine multiple boolean conditions:
	&& : Logical AND (a > 5 && a < 10)
	|| : Logical OR (a > 5 || b < 3)
	! : Logical NOT (!(a > 5))
	
*/

public class Logical {
	public static void main(String[] args) {
		int a = 10, b = 50;
		System.out.println((a > 5) && (b < 10));
		System.out.println((a < 5) || (b < 10));
		System.out.println(!(a < b));

	}

}
