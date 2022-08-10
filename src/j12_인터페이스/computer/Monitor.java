package j12_인터페이스.computer;

public class Monitor implements HDMI {

	@Override
	public void connect() {
		System.out.println("모니터를 연결합니다.");
	}

	@Override
	public void disConnect() {
		System.out.println("모니터 연결을 해제합니다.");
	}
	
	public void showDisplay() {
		System.out.println("디스플레이 화면을 출력합니다.");
	}

}
