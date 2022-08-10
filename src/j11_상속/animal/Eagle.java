package j11_상속.animal;

public class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 날개를 펴고 움직입니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 하늘로 날아오릅니다.");
	}
}
