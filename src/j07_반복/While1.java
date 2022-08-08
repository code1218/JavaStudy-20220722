package j07_반복;

public class While1 {
	
	public static void main(String[] args) {
		int i = 0; //반복 인덱스
		
		int n = 5; //반복 횟수
		
		// while반복이란.
		// 해당 조건이 참이면 { } 내의 명령을 
		// 조건이 거짓이 될때까지 실행하는 구조
		
		while(i < n) {
			System.out.println("i: " + i);
			i++;
		}
		
	}
	
}
