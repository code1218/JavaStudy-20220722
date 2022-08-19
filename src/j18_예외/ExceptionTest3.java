package j18_예외;

public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
			throw new CustomException("우리가 만든 예외 발생");			
		}catch (CustomException e) {
			e.printStackTrace();
		}
		
	}

}
