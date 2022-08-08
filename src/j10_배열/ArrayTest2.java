package j10_배열;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//정수 배열
		int[] intArray = new int[7];
		final int MAX_INDEX = intArray.length - 1;
		int index = 0;
		
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 50;
		intArray[3] = 20;
		intArray[4] = 30;
		intArray[5] = 60;
		intArray[6] = 70;
		
		while(true) {
			System.out.print("인덱스: ");
			index = scanner.nextInt();
			
			if(index > MAX_INDEX || index < -1) {
				continue;
			}
			
			if(index == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.println(intArray[index]);
			System.out.println();
		}

	}

}





