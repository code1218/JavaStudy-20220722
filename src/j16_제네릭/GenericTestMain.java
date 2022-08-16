package j16_제네릭;

import j15_스태틱.Student;

public class GenericTestMain {
	
	public static GenericTest<?> getData(int code, Object obj) {
		GenericTest<?> genericTest = null;
		
		if(obj.getClass() == Student.class) {
			genericTest = new GenericTest<>(code, (Student) obj);
		
		}else if(obj.getClass() == String.class) {
			genericTest = new GenericTest<>(code, (String) obj);
			
		}
		
		return genericTest;
		
	}
	
	public static void main(String[] args) {
		Student student = new Student("김준일");
		System.out.println(getData(100, student));
		System.out.println(getData(200, "전송 완료?"));
	}
	
}
