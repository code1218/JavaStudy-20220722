package j13_최상위클래스;

import java.util.Objects;

public class UserObjectMain {

	public static void main(String[] args) {
		User user1 = new User("junil", "1234");
		User user2 = new User("junil", "1234");
		
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));
		
		System.out.println(Objects.hash("junil", "1234"));
		System.out.println(Objects.hash("junil", "1234"));
		
		System.out.println(user1.hashCode() == user2.hashCode());
		
		System.out.println("객체 비교: " + (user1.getClass() == User.class));

		Class<User> c1 = (Class<User>) user1.getClass();
		System.out.println("클래스명(풀네임): " + c1.getName());
		System.out.println("클래스명(패키지 생략): " + c1.getSimpleName());
		
		for(int i = 0; i < c1.getMethods().length; i++) {
			System.out.println(c1.getMethods()[i].getName());
		}
		
		for(int i = 0; i < c1.getFields().length; i++) {
			System.out.println(c1.getDeclaredFields()[i].getName());
		}
	}

}








