package j08_메소드;

public class Method4 {
	
	/*
	 * 메소드명: calc
	 * 매개변수: year
	 * return true or false
	 * 
	 * 윤년
	 * 해당 년도가 4의 배수 이고 100의 배수는 아니거나 또는
	 * 400의 배수인 것이 윤년다.
	 */
	public static boolean calc(int year) {
//		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
//			return true;
//		}else {
//			return false;
//		}
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
		
	}

	public static void main(String[] args) {
		int year1 = 1999;
		int year2 = 1200;
		int year3 = 1600;
		int year4 = 2000;
		
		String result1 = calc(year1) ? "윤년" : "윤년아님";
		boolean result2 = calc(year2);
		boolean result3 = calc(year3);
		boolean result4 = calc(year4);
		
		System.out.println("result1: " + result1); 
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);

	}

}




