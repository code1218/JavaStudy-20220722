package j08_메소드;

public class Method2 {
	/*
	 * 함수(메소드)의 용어 정리
	 * 1. 반환자료형, 리턴자료형
	 * 2. 반환값, 리턴값
	 * 3. 메소드명, 함수명
	 * 4. 파라미터, 매개변수, 인수
	 * 5. 메소드(함수) 정의
	 * 6. 메소드(함수) 호출(콜)
	 * 
	 * 메소드 형태의 종류
	 */
	
	// 반환도 없고 매개변수도 없는 메소드
	public static void test1() {
		System.out.println("test1 메소드 호출");
		System.out.println();
	}
	
	// 반환이 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("test2 메소드 호출");
		System.out.println("num: " + num);
		System.out.println();
	}
	
	// 반환이 없고 매개변수가 두개인 메소드
	public static void test3(int num1, int num2) {
		System.out.println("test3 메소드 호출");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println();
	}
	
	// 반환이 있고 매개변수가 없는 메소드
	public static int test4() {
		System.out.println("test4 메소드 호출");
		System.out.println();
		return 100;
	}
	
	// 반환도 있고 매개변수도 있는 메소드
	public static String test5(String name, int age) {
		System.out.println("test5 메소드 호출");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println();
		return name + ", " + age + "살";
	}
	
	public static void main(String[] args) {
		test1(); //호출(콜)
		test2(1);
		test2(10);
		test2(100);
		test3(10, 20);
		int result = test4();
		System.out.println(result);
		String result2 = test5("김준일", 29);
		System.out.println(result2);
	}
	
}







