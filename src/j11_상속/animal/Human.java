package j11_상속.animal;

public class Human extends Animal {
	
	@Override // @ -> 어노테인션, @Override 재정의 메소드를 의미한다.
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}
