package j15_스태틱.singleton;

public class Factory2 extends Factory {
	
	private String factoryName = "2공장";
	
	@Override
	public Car createCar(String model) {
		KIA kia = KIA.getInstance();
		
		return kia.addCar(factoryName, model);
	}

}
