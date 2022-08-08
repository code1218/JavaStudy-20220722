package j09_클래스.생성자;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		System.out.println("car1의 주소: " + car1);
		
		Car car2 = new Car("현대", "쏘나타", "화이트");

	}

}
