package j10_배열;

public class Student {
	private int studentCode;
	private String studentName;
	
	public Student(int studentCode, String studentName) {
		super();
		this.studentCode = studentCode;
		this.studentName = studentName;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
}
