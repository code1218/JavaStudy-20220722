package j03_연산자;

public class Operation5 {
	
	public static void main(String[] args) {
		/*
		 * 조건 연산자(삼항 연산자)
		 * 
		 * 조건 ? 결과1(조건이 true일때) : 결과2(조건이 false일때)
		 * 
		 */
		
		System.out.println(3 > 0 ? "참이다" : "거짓이다");
		System.out.println(3 > 0 ? 3 : 0);
		System.out.println(3 > 0 ? '참' : '거');
		System.out.println(3 < 0 ? true : false);
		
		System.out.println("-------------------------------------");
		
		int result1 = 1 == 0 ? 1 : 0;
		char result2 = 1 == 1 ? 'T' : 'F';
		
		System.out.println(result1);
		System.out.println(result2);
		
		String result3 = 1 == 1 ? "참이다" : "거짓이다.";
		System.out.println(result3);
		
		/*
		 * 자료형의 종류
		 * 일반자료형(boolean, char, int, double)
		 * 참조자료형(class)
		 */
		
		
	}
	
}








