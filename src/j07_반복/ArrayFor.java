package j07_반복;

public class ArrayFor {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 10;
		}
		
		System.out.print("[ ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			
			if(i != numbers.length - 1) {
				System.out.print(", ");
			}
			
		}
		System.out.println(" ]");

	}

}
