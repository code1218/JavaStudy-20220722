package j07_반복;

public class SumMain {

	public static void main(String[] args) {
		/*
		 * 1 부터 100까지 모두 더한 결과를 출력하시오.
		 * 
		 */

		int i = 0;
		
		int result = 0;
		
		/*
		 * i = 0
		 * 1. num = 0 + 1
		 * 2. i: 1
		 * 3. result = 0 + 1
		 * 4. i++
		 * 
		 * i = 1
		 * 1. num = 1 + 1
		 * 2. i: 2
		 * 3. result = 1 + 2
		 * 4. i++
		 * 
		 * i = 2
		 * 1. num = 2+ 1
		 * 2. i: 3
		 * 3. result = 3 + 3
		 * 4. i++
		 */
		
		while(i < 100) {
			int num = i + 1;
			System.out.println("i: " + num);
			result += num;			
			i++;
		}
		System.out.println();
		System.out.println("결과: " + result);
	}

}
