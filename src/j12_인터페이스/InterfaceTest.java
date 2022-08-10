package j12_인터페이스;

/*
 * 인터페이스
 * 1. 일반 변수는 가질 수 없다.
 * 2. 무조건 스태틱 상수만 선언 할 수 있다.
 * 3. 기본적으로 모든 메소드는 추상 메소드로 선언된다.
 * 4. 일반 메소드를 선언하고자하면 default를 명시해야한다.
 * 5. 인터페이스는 생성이 불가능하다.
 * 6. 생성자를 가질 수 없다.
 * 
 */
public interface InterfaceTest {
	public String name = "김준일";
	
	public void printTest();
	
	public default void printTest2() {
		System.out.println("인터페이스 안에서 일반 메소드 선언");
	}
	
	
}








