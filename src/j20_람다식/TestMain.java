package j20_람다식;

import java.util.function.Consumer;

public class TestMain {
	
	public static void main(String[] args) {
		Test<String> a = name -> {
			System.out.println("이름: " + name);
		};
		
		Consumer<String> consumer = t -> {System.out.println(t);};
		
		consumer.accept("람다 consumer test");
		
		a.printData("김준일");
		a.printData("이승민");
		a.printData("박상호");
		a.printData("강지원");
		a.printData("이가경");
		
		

	}

}
