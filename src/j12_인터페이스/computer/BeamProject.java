package j12_인터페이스.computer;

public class BeamProject implements HDMI {

	@Override
	public void connect() {
		System.out.println("빔프로젝트를 연결합니다.");
		
	}

	@Override
	public void disConnect() {
		System.out.println("빔프로젝트 연결을 해제합니다.");
		
	}
	
	public void showBeam() {
		System.out.println("빔을 쏴서 화면을 출력합니다.");
	}

}
