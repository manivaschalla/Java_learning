package operators;

/*
 * 
	Operate on a single operand:
	+ : Unary plus (+a)
	- : Unary minus (-a)
	++ : Increment (++a / a--)
	-- : Decrement (--a / a--)
	! : Logical NOT (!true)
	
*/

public class Unary {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(+a);
		System.out.println(-a);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(a);
		boolean flag = false;
		System.out.println(!flag);
	}

}
