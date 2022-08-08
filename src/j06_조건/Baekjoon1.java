package j06_조건;

import java.util.Scanner;

public class Baekjoon1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.print("입력: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		
	}

}





