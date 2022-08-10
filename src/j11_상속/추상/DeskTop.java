package j11_상속.추상;

public class DeskTop extends Computer {

	@Override
	public void powerOn() {
		System.out.println("데스크탑의 전원을 켭니다.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("데스크탑의 전원을 끕니다.");
	}
	
	public void repair() {
		System.out.println("본체를 수리합니다.");
	}
}
