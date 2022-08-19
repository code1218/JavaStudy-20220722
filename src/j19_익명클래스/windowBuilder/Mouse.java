package j19_익명클래스.windowBuilder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("클래스 파일로 만든 로그인 클릭 이벤트");
	}
}
