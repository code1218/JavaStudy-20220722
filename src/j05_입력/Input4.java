package j05_입력;

import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("숫자 3개를 띄어로 구분하여 입력하세요: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

	}

}
