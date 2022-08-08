package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String welcomeMessage = null;
		String name = null;
		String phone = null;
		int age = 0;
		
		System.out.print("인사말 >> ");
		welcomeMessage = scanner.nextLine();
		
		System.out.println("인사말 내용: " + welcomeMessage);
		
		System.out.print("이름 >> ");
		name = scanner.next();
		
		System.out.print("연락처 >> ");
		phone = scanner.next();
		
		System.out.print("나이 >> ");
		age = scanner.nextInt();
		
		System.out.println("이름: " + name);
		System.out.println("연락처: " + phone);
		System.out.println("나이: " + age);
		

	}

}





