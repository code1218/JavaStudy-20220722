package j11_상속;

public class ClassB1 extends ClassA {

	public ClassB1() {
		// super 현재 this 객체의 부모 객체 주소를 의미한다.
		super();
		System.out.println("\t자식 클래스(ClassB1)");
		super.printData();
	}
}
