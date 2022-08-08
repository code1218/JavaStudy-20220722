package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		String name = "김준일";
		int age = 29;
		String address = "부산 동래구 사직동";
		String phone = "010-9988-1916";
		char gender = 'm';
		
		System.out.print("이름: ");
		System.out.println(name);
		
		System.out.print("나이: ");
		System.out.println(age);
		
		System.out.print("주소: ");
		System.out.println(address);
		
		System.out.print("연락처: ");
		System.out.println(phone);
		
		System.out.print("성별: ");
		System.out.println(gender == 'M' || gender == 'm' ? "남성" 
				: gender == 'F' || gender == 'f' ? "여성" : "알 수 없음");
		
		

	}

}






