package j09_클래스;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.studentCode = 20220001;
		student.name = "김준일";
		student.phone = "010-9988-1916";
		student.address = "부산 동래구 사직동";
		
		student.showStudentInfo();

	}

}
