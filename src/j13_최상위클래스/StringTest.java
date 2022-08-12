package j13_최상위클래스;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name1 = "김준일";
		String name2 = "김준일";
		String name3 = scanner.nextLine();
		String name4 = new String("김준일");
		
		System.out.println("name4: " + name4);
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name3));
		System.out.println(name2 == name3);
		System.out.println(name1 == name4);
		
	}

}







