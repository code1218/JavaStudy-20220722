package j08_메소드;

public class Method1 {
	
	public static int add(int x, int y) {
		int z = x + y;
		return z;
	}

	public static void main(String[] args) {	
		int a = 10;
		int b = 20;
		
		int c = 30;
		int d = 40;
		
		int result = 0;
		
		System.out.println(add(a, b));
		System.out.println(add(c, d));
		result = add(a, c);
		System.out.println(result);
		result = add(result, d);
		System.out.println(result);
	}

}




