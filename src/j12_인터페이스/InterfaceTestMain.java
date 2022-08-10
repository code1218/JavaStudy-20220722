package j12_인터페이스;

public class InterfaceTestMain {


	public static void main(String[] args) {
		
		//인터페이스는 생성이 불가능.
		InterfaceTest interfaceTest = new InterfaceTestImpl();
		
		interfaceTest.printTest();
		interfaceTest.printTest2();
		
		System.out.println(interfaceTest.name);
		
		
	}

}
