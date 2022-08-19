package j18_예외;

public class ExceptionTest {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 3, 4, 5 };

		try {
			throw new RuntimeException();
			
//			for (int i = 0; i < 5; i++) {
//				System.out.println(numbers[i]);
//			}			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 초과하여 인덱스 참조를 하였습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("여기가 실행됨");
		}
		
		
		System.out.println("프로그램 종료");

	}

}
