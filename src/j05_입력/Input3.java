package j05_입력;

import java.util.Scanner;

public class Input3 {
	
	/*
	 * name
	 * age
	 * address
	 * phone
	 * 
	 * [정보 입력]
	 * 이름 >> 김준일
	 * 나이 >> 29
	 * 주소 >> 부산 동래구 사직동
	 * 연락처 >> 010 9988 1916
	 * 
	 * [정보 출력]
	 * 고객님의 이름은 김준일입니다.
	 * 나이는 29세이고 주소는 부산 동래구 사직동입니다.
	 * 연락처 정보 -> 010-9988-1916
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int age = 0;
		String address = null;
		String phone = null;
		
		System.out.println("[정보 입력]");
		System.out.print("이름 >> ");
		name = scanner.next();
		
		System.out.print("나이 >> ");
		age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("주소 >> ");
		address = scanner.nextLine();
		
		System.out.print("연락처 >> ");
		phone = scanner.nextLine().replaceAll(" ", "-");
		
		System.out.println();
		
		System.out.println("[정보 출력]");
		System.out.println("고객님의 이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "세이고 주소는 " + address + "입니다.");
		System.out.println("연락처 정보 -> " + phone);

	}

}







