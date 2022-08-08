package j03_연산자;

/*
 * false(0): 정수로 0의 값 또는 값이 비어있는 상태
 * true(1): 0또는 비어있는 상태가 아니면 무조건 참인 상태
 * 
 * 논리연산자
 * AND(&&)	-> 곱
 * true && true = true
 * true && false = false
 * false && false = false
 * 
 * OR(||)	-> 합
 * true || true = true
 * true || false = true
 * false || false = false
 * 
 * NOT(!)	-> 부정
 * !true = false
 * !false = true
 * 
 */

public class Operation3 {
	
	public static void main(String[] args) {
		boolean a = 10 > 5;
		boolean b = 1 == 0;
		boolean c = 0 == 0;
		
		boolean result = a && b;
		System.out.println(result);
		
		boolean result2 = a || b || c;
		System.out.println(result2);
		
		boolean result3 = (a || c) && b;
		System.out.println(result3);
		
	}
	
}








