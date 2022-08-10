package j12_인터페이스.computer;

public class Computer {

	private HDMI hdmi;
	
	public Computer(HDMI hdmi) {
		this.hdmi = hdmi;
	}
	
	public void run() {
		connectHDMI();
		
		if(hdmi instanceof Monitor) {
			Monitor monitor = (Monitor) hdmi;
			monitor.showDisplay();
			
		}else if(hdmi instanceof BeamProject) {
			BeamProject beamProject = (BeamProject) hdmi;
			beamProject.showBeam();
			
		}
		
		disConnectHDMI();
	}
	
	private void connectHDMI() {
		hdmi.connect();
	}
	
	private void disConnectHDMI() {
		hdmi.disConnect();
	}
}
