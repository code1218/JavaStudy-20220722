package j18_예외;

import java.util.Arrays;
import java.util.List;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		Student[] studentArray = {
		
		new Student(1, "김준일"),
		new Student(2, "이승민"),
		new Student(3, "박상호"),
		new Student(4, "김수현"),
		new Student(5, "이가경"),
		new Student(6, "장한이"),
		new Student(7, "강성빈"),
		null
		
		};
		
		List<Student> students = Arrays.asList(studentArray);
		
//		try {
//			for(int i = 0; i < 8; i++) {
//				System.out.println(students.get(i).getName());
//			}			
//			
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("리스트의 공간을 초과하여 참조하였습니다.");
//			
//		}catch (NullPointerException e) {
//			System.out.println("null은 참조할 수 없습니다.");
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//			
//		}finally {
//			/*
//			 * 예외가 발생하든 하지 않든 무조건 실행되는 부분
//			 */
//		}
		
		
		StudentArray array = new StudentArray();
		
		try {
			array.printList(students);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		
		System.out.println("프로그램 종료");

	}

}




