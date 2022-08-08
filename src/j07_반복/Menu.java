package j07_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = true;
		String select = null;
		
		while(flag) {
			System.out.println("[메뉴 선택]");
			System.out.println("1. 치킨");
			System.out.println("2. 피자");
			System.out.println("3. 떡볶이");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("메뉴를 선택하세요: ");
			select = scanner.nextLine();
			
			if(select.equals("q")) {
				System.out.println("프로그램 종료 선택");
				flag = false;
			}
			
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
		

	}

}










