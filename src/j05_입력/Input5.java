package j05_입력;

import java.util.Scanner;

public class Input5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputStr1 = null;
		String inputStr2 = null;
		
		System.out.println("문자열 입력(next): ");
		inputStr1 = scanner.next();
		
		System.out.println();
		System.out.println("문자열 입력(nextLine): ");
		inputStr2 = scanner.nextLine();
		
		System.out.println("next -> |" + inputStr1);
		System.out.println("nextLine -> |" + inputStr2);

	}

	
}





