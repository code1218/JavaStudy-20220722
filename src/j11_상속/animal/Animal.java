package j11_상속.animal;

/*
 * 추상 클래스
 * 1. 생성 할 수 없다.
 * 2. 추상메소드를 포함 할 수 있다.
 */
public abstract class Animal {
	private String name;
	/*
	 * 추상 메소드
	 * 반환 자료형 앞에 abstract 키워드가 추가되고 메소드 실행문이 생략된다. 
	 * 그리고 마지막은 세미콜론으로 끝난다.
	 */
	public abstract void move();
	
	public void eat() {
		System.out.println("동물이 밥을 먹습니다.");
	}
}


/*
 *  class: Animal
 *  method: void move() -> 동물이 움직입니다. 출력을 할 수 있어야한다.
 *  
 *  
 *  class: Human
 *  extends: Animal
 *  method: void readBooks() -> 사람이 책을 읽습니다.
 *  
 *  class: Tiger
 *  extends: Animal
 *  method: void hunting() -> 호랑이가 사냥을 합니다.
 *  
 *  class: AnimalMain
 *  method: voie main()
 *  
 *  main
 *  human.move()
 *  human.readBooks()
 *  
 *  tiger.move()
 *  tiger.hunting()
 * 
 */












