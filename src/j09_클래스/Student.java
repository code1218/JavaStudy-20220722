package j09_클래스;

public class Student {
	int studentCode;
	String name;
	String phone;
	String address;
	
	void showStudentInfo() {
		System.out.println("학번: " + studentCode);
		System.out.println("이름: " + name);
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
	}
}
