package j10_배열;

public class ForEach {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		String[] strArray = {"a", "b", "c", "d", "e", "f"};
		
		String[] lowAlphabet = new String[26];
		
		
		for(int i = 0; i < lowAlphabet.length; i++) {
			lowAlphabet[i] = Character.toString((char) (97 + i));
		}
		
		
		for(String a : lowAlphabet) {
			System.out.println(a);
		}
		
		Student[] students = new Student[9];
//		for(Student s : students) {
//			s = new Student(20220001, "김준");
//		}
//		for(Student s : students) {
//			System.out.println(s);
////			System.out.println("학번: " + s.getStudentCode());
////			System.out.println("이름: " + s.getStudentName());
////			System.out.println();
//		}
//		
//		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student(20220001 + i, "김준" + (i + 1));
		}
		
		for(Student s : students) {
			System.out.println("학번: " + s.getStudentCode());
			System.out.println("이름: " + s.getStudentName());
			System.out.println();
		}
//		
		
		
		

	}

}
