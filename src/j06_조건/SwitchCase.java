package j06_조건;

public class SwitchCase {

	public static void main(String[] args) {
		String select = "2";
		
		switch(select) {
		case "1": 
			System.out.println("1을 선택했습니다.");
			break;
		case "2":
			System.out.println("2를 선택했습니다.");
			break;
		default:
			System.out.println("해당 값은 사용할 수 없습니다.");
			
		}
		

	}

}
