package j18_예외;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public CustomException() {
		
	}
	
	public CustomException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "예외 내용: " + super.getMessage();
	}
	
	@Override
	public void printStackTrace() {
		System.out.print("printStackTrace: >>> ");
		super.printStackTrace();
	}
	

}
