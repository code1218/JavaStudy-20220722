package j10_배열.random;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
	
	public int createNumber(int[] rotto) {
		Random random = new Random();
		
		int num = 0;
		
		int count = 0;
		
		while(num == 0 || count > 0) {
			num = random.nextInt(46);
			
			count = 0;
			
			for(int i = 0; i < rotto.length; i++) {
				if(rotto[i] == num) {
					count++;
					break;
				}
			}
		}
		
		return num;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Random1 random = new Random1();
		
		int[] rotto = new int[7];
		int[] rottoInput = new int[6];
		
		for(int i = 0; i < rotto.length; i++) {
			rotto[i] = random.createNumber(rotto);
			System.out.print(rotto[i] + " ");
			
		}
		
		System.out.println();
		
		System.out.println("로또번호 입력(띄어쓰기로 구분)");
		for(int i = 0; i < rottoInput.length; i++) {
			rottoInput[i] = scanner.nextInt();
		}
		
		boolean bonus = false;
		
		int count = 0;
		
		for(int i = 0; i < rottoInput.length; i++) {
			for(int j = 0; j < rottoInput.length; j++) {
				if(rottoInput[i] == rotto[j]) {
					count++;
				}
			}
			if(rottoInput[i] == rotto[6]) {
				bonus = true;
			}
		}
		if(count == 6) {
			System.out.println("1등");
		}else if(count == 5 && bonus) {
			System.out.println("2등");
		}else if(count == 5) {
			System.out.println("3등");
		}else if(count == 4) {
			System.out.println("4등");
		}else if(count == 3) {
			System.out.println("5등");
		}else {
			System.out.println("꽝");
		}
		
		
		// 1. 배열에 6개의 로또번호를 생성한다.
		
		// 2. 로또번호 6자리를 입력받는다.
		
		// 3. 로또 등수 확인
		/*
		 * 1등 6개 전부 맞아야한다.
		 * 2등 0 ~ 5인덱스 중에 5개와 마지막 번호 6인덱스의 값이랑 일치하면
		 * 3등 전체 중에 5개가 일치하면
		 * 4등 전체 중에 4개가 일치하면
		 * 5등 전체 중에 3개가 일치하면
		 * 꽝
		 */
		
		
	}

}
