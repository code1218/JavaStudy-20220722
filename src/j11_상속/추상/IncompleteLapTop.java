package j11_상속.추상;

public abstract class IncompleteLapTop extends Computer {

	@Override
	public void powerOn() {
		System.out.println("노트북의 전원을 켭니다.");
	}
	
	public void open() {
		System.out.println("노트북을 엽니다.");
	}
}
