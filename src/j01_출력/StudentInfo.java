package j01_출력;

import j15_스태틱.Student;

public class StudentInfo {

	public static void main(String[] args) {
		int num = Student.getAutoNumber();
		System.out.println(num);
		int a;
		a = 31;
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("나이: ");
		System.out.println(a);
		System.out.print("주소: ");
		System.out.println("부산 동래구 사직동");
		
		a = 40;
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("나이: ");
		System.out.println(a);
		System.out.print("주소: ");
		System.out.println("부산 동래구 사직동");

	}

}
