package j08_메소드;

public class Method3 {
	
	public static int 일(int a, String b) {
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		return a;
	}
	
	public static String 이() {
		return "2";
	}

	public static void main(String[] args) {
		int num1 = 일(1, "이");
		
		System.out.println(num1);
		
		System.out.println(이() + num1);
		

	}

}
