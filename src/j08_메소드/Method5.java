package j08_메소드;

/*
 * 메소드 오버로딩
 * 매개변수가 다르면 동일한 메소드명을 사용할 수 있는 것
 * 
 */

public class Method5 {
	
	public static void addName(String name) {
		System.out.println("이름추가: " + name);
	}
	
	public static void addName(String name1, String name2) {
		System.out.println("이름 추가1: " + name1);
		System.out.println("이름 추가2: " + name2);
	}
	
	public static void main(String[] args) {
		addName("김준일");
		addName("김준일", "김준이");
	}
	
}







