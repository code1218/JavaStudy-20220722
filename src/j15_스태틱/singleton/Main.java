package j15_스태틱.singleton;

public class Main {
	
	public static void main(String[] args) {
		KIA kia = KIA.getInstance();
		
		kia.showCarList();
		
		Factory f1 = new Factory1();
		Factory f2 = new Factory2();
		
		f1.createCar("k5");
		f2.createCar("k8");
		f1.createCar("스포티지");
		f1.createCar("k3");
		f2.createCar("k7");
		
		kia.showCarList();
		
	}
	
}
