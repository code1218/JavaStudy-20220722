package j09_클래스;

/*
 * 클래스		틀
 * 오브젝트		틀로 만들 수 있는 것
 * 인스턴스		틀로 만들어 진것
 * 
 */

public class Computer {
	String cpu;
	int ram;
	int ssd;
	
	void showInfo() {
		System.out.println("컴퓨터 사양");
		System.out.println("CPU: " + cpu);
		System.out.println("RAM: " + ram);
		System.out.println("SSD: " + ssd);
		System.out.println();
	}
	
	void powerOn() {
		System.out.println("컴퓨터의 전원을 켭니다");
		System.out.println();
	}
	
	void powerOff() {
		System.out.println("컴퓨터의 전원을 끕니다.");
		System.out.println();
	}
}











