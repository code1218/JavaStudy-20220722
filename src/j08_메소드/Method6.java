package j08_메소드;

public class Method6 {
	
	public static void test1() {
		System.out.println("매개변수가 없는 test1");
	}
	
	public static void test1(int num1) {
		System.out.println("매개변수가 하나이고 int자료형인 test1");
	}
	
	public static void test1(int num1, int num2) {
		System.out.println("매개변수가 두개이고 둘다 int자료형인 test1");
	}
	
	public static void test1(int num1, String num2) {
		System.out.println("매개변수가 두개이고 첫번째 매개변수는 int, "
				+ "두번째 매개변수는 String인 test1");
	}
	
	public static void test1(String a, int b) {
		System.out.println("매개변수가 두개이고 첫번째 매개변수는 String, "
				+ "두번째 매개변수는 int인 test1");
	}

	public static void main(String[] args) {
		test1();
	}

}



