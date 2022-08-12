package j15_스태틱;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student("김준일");
		Student student2 = new Student("이승민");
		Student student3 = new Student("조준현");
		Student student4 = new Student("김상현");
		Student student5 = new Student("이가경");
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5);
		
		System.out.println(Student.getAutoNumber());
		
	}

}






