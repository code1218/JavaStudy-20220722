package j06_조건;

import java.util.Scanner;

public class Baekjoon4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		System.out.print("x: ");
		x = scanner.nextInt();
		
		System.out.print("y: ");
		y = scanner.nextInt();
		
		if(x < -1000 || x > 1000 || x == 0 || y < -1000 || y > 1000 || y == 0) {
			System.out.println("계산 불가");
			
		}else if(x > 0 && y > 0) {
			System.out.println(1);
			
		}else if(x < 0 && y > 0) {
			System.out.println(2);
			
		}else if(x < 0 && y < 0) {
			System.out.println(3);
		
		}else {
			System.out.println(4);
		}
		
		
	}

}





