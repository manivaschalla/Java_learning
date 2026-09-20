package assignments;

public class Operators {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		float c = 5.0f;
		
		
		System.out.println("TASK : 1");
		
		System.out.println(a +" + "+b+" -> "+(a+b));
		System.out.println(a +" - "+b+" -> "+(a-b));
		System.out.println(a +" * "+b+" -> "+(a*b));
		System.out.println(a +" / "+b+" -> "+(a/b));
		
		
		System.out.println("One int and One float");
		
		System.out.println(a +" + "+b+" -> "+(a+c));
		System.out.println(a +" - "+b+" -> "+(a-c));
		System.out.println(a +" * "+b+" -> "+(a*c));
		System.out.println(a +" / "+b+" -> "+(a/c));
		
		
		System.out.println();
		System.out.println("TASK : 2");
		
		
		boolean res1 = a == b;
		boolean res2 = a > b;
		boolean res3 = a < b;
		boolean res4 = a >= b;
		boolean res5 = a <= b;
		boolean res6 = a != b;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
		System.out.println();
		
		System.out.println("TASK : 3");
		
		short p = 5;
		short q = -5;
		boolean r = true;
		
//		short res7 = ++p;
//		short res8 = --q;
//		boolean res = !true;
		
		System.out.println(+p);
		System.out.println(-q);
		System.out.println(!(r));
		
		System.out.println(++p);
		System.out.println(p++);

		System.out.println(--q);
		System.out.println(q--);


		
		
		
		
		
		
		
	}
	

}
