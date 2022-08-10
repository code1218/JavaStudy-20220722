package j12_인터페이스.computer;

public class ComputerMain {
	
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		BeamProject beamProject = new BeamProject();
		
		HDMI hdmi = monitor;
		
		Computer computer = new Computer(hdmi);
		
		computer.run();
		
	}
	
}
