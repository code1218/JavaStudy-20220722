package j11_상속.추상;

public class ComputerMain {

	public static void main(String[] args) {
		Computer[] computers = new Computer[2];
		
		computers[0] = new DeskTop();
		computers[1] = new LapTop();
		
		
		for(Computer computer : computers) {
			computer.powerOn();
			
			computer.powerOff();
		}

	}

}
