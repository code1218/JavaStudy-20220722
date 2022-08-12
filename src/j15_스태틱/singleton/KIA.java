package j15_스태틱.singleton;

/*
 * 싱글톤 패턴
 * 
 * 딱 한번만 생성해서 딱 하나의 객체를 공유하는 생성패턴
 * 
 * 1. 생성자의 접근지정자가 private 이어야 한다.
 * 2. instance static this 변수를 가져야 한다.
 * 3. instance를 외부로 가져갈 수 있는 getInstance() static 메소드가 존재해야한다.
 */

public class KIA {
	private static KIA instance;
	
	private int autoNumber = 20220001;
	private Car[] carList;
	
	private KIA() {
		carList = new Car[5];
	}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car addCar(String factoryName, String model) {
		Car car = new Car(autoNumber++, getClass().getSimpleName(), factoryName, model);
		
		for(int i = 0; i < carList.length; i++) {
			if(carList[i] == null) {
				carList[i] = car;
				return car;
			}
		}
		return null;
	}
	
	public void showCarList() {
		for(Car car : carList) {
			System.out.println(car);
		}
	}

}





