package method;

public class Method {
	static int count = 10;
	public static void main(String[] args) {
		Method t = new Method();
		t.sum();
	}
	void sum() {
		int a = 5;
		int b = 10;
		System.out.println("value of a : "+a);
		System.out.println("Valuue of b : "+b);
		
		int c = a +b;
		System.out.println("Addition of a & b : "+c);
		//System.out.println(c);
		System.out.println(count);
	}

}
