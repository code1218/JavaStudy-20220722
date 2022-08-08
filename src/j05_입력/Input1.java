package j05_입력;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputStr = null; //문자열이 비었다.
		
		System.out.print("입력: ");
		inputStr = scanner.next();
		
		System.out.println("입력된 값: " + inputStr);
		
	}

}





