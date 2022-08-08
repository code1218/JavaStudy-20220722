package j09_클래스.생성자;

public class Car {
	String company;
	String model;
	String color;
	
	public Car() {
		System.out.println("자신의 주소: " + this);
	}
	
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	public void showCarInfo() {
		System.out.println("company: " + company);
		System.out.println("model: " + model);
		System.out.println("color: " + color);
	}
}


