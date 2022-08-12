package j16_제네릭;

import j15_스태틱.Student;

public class GenericTestMain {
	
	public static void main(String[] args) {
		Student student = new Student("김준일");
		
		GenericTest<Student> genericTest = new GenericTest<Student>(200, student);
		
		System.out.println(genericTest);
				
		GenericTest<String> genericTest2 = new GenericTest<String>(200, "전송완료");
		
		System.out.println(genericTest2);
	}
	
}
