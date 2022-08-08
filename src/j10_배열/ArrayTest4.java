package j10_배열;

public class ArrayTest4 {

	public static void main(String[] args) {
		Student student1 = new Student(20220001, "김준일");
		Student student2 = null;
		Student student3 = new Student(20220003, "김준삼");
		Student student4 = new Student(20220004, "김준사");
		
		Student[] students = {student1, student2, student3, student4};
		
//		System.out.println(student1.getStudentCode() + " 학번 학생 이름: " + student1.getStudentName());
//		System.out.println(student2.getStudentCode() + " 학번 학생 이름: " + student2.getStudentName());
//		System.out.println(student3.getStudentCode() + " 학번 학생 이름: " + student3.getStudentName());
//		System.out.println(student4.getStudentCode() + " 학번 학생 이름: " + student4.getStudentName());
		
		System.out.println();
		
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				continue;
			}
			System.out.println(students[i].getStudentCode() + " 학번 학생 이름: " + students[i].getStudentName());
		}
		
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		int number4 = 40;
		
		int[] numbers = {number1, number2, number3, number4};

	}

}
