package j06_조건;

import java.util.Scanner;

public class Baekjoon2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year = 0;
		
		System.out.print("년도를 입력하세요: ");
		year = scanner.nextInt();
		
		if(year < 1 || year > 4000) {
			System.out.println("계산 불가");
			
		}else if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println(1);
			
		}else {
			System.out.println(0);
			
		}
		
		
	}

}





