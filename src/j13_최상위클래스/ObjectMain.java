package j13_최상위클래스;

public class ObjectMain {

	public static void main(String[] args) {
		ObjectTest objectTest = new ObjectTest();
		
		int a = 10;
		
		System.out.println(a);
		
		System.out.println(objectTest.toString());
		System.out.println(objectTest);

		
		System.out.println();
		
		
		User user = new User("junil", "1234");
		
		System.out.println(user);
	}

}







