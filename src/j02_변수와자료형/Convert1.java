package j02_변수와자료형;

public class Convert1 {

	public static void main(String[] args) {
		char alphabetA = 'a';
		System.out.println("문자 a: " + alphabetA);
		
		System.out.println("문자 a를 정수로 변환: " + (int) alphabetA);
		int numA = alphabetA; //업캐스팅(묵시적 형변환)
		
		System.out.println("문자 a를 정수로 변환: " + numA);
		
		double doubleNumA = numA;
		System.out.println("정수 numA를 실수로 변환: " + doubleNumA);
		
		//////////////////////////////////////////////////////////////////
		
		//다운 캐스팅
		double pi = 3.14;
		System.out.println("pi: " + (int) pi);
		
		int intPi = (int) pi;
		System.out.println("pi를 정수로 형변환: " + intPi);
		
		char charPi = (char) 65;
		System.out.println("intPi를 문자로 형변환: " + charPi);
		
	}

}









