package j11_상속.animal;

public class Tiger extends Animal {
	
	//호랑이가 네발로 뜁니다.
	
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

/*
 *  Eagle
 *  독수리가 날개를 펴고 움직입니다.
 *  
 *  flying
 *  독수리가 하늘로 날아오릅니다.
 */

