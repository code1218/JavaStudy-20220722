package j02_변수와자료형;

public class Convert2 {

	public static void main(String[] args) {
		/*
		 * double kor = 84.5
		 * double math = 90.7
		 * double eng = 88.2
		 * 
		 * double subjectCount = 3;
		 * 
		 * int total = 
		 * int avg = total / subjectCount
		 * 
		 * 합계: 262
		 * 평균: 87
		 * 
		 */
		double kor = 84.5;
	 	double math = 90.7;
	 	double eng = 88.2;
	 	double subjectCount = 3;
	 	
	 	int total = (int) kor + (int) math + (int) eng;
	 	int avg = total / (int) subjectCount;
	 	
	 	System.out.println("합계: " + total);
	 	System.out.println("평균: " + avg);
	 	
	}

}








