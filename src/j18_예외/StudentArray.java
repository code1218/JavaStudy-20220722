package j18_예외;

import java.util.List;

public class StudentArray {

	public void printList(List<Student> studentList) throws NullPointerException, ArrayIndexOutOfBoundsException, Exception {
		
		for(int i = 0; i < studentList.size(); i++) {
			System.out.println("학생정보: " + studentList.get(i));
			System.out.println("학생코드: " + studentList.get(i).getCode());
			System.out.println("학생이름: " + studentList.get(i).getName());
			System.out.println();
		}
		
	}
}
