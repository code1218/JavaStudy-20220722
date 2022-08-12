package j15_스태틱;

import lombok.Data;

@Data
public class Student {
	private static int autoNumber = 20220001;
	
	private int studentCode;
	private String studentName;

	public Student(String studentName) {
		studentCode = autoNumber++;
		this.studentName= studentName; 
	}
	
	public static int getAutoNumber() {
		return autoNumber;
	}
	
}









