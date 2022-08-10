package j11_상속.animal;

public class AnimalMain {
	public static void main(String[] args) {	
		
		Animal[] animals = new Animal[3];
		
		Animal human = (Animal) new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		animals[0] = human;
		animals[1] = tiger;
		animals[2] = eagle;
		
		for(Animal animal : animals) {
			animal.move();
			
			if(animal instanceof Human) {
				((Human) animal).readBooks();	
				
			}else if(animal instanceof Tiger) {
				Tiger t = (Tiger) animal;
				t.hunting();
				
			}else if(animal instanceof Eagle) {
				Eagle e = (Eagle) animal;
				e.flying();
				
			}else {
				System.out.println("다운캐스팅 불가능");
			}
		}
		
//		human.move();
//		((Human) human).readBooks();
//		
//		tiger.move();
//		((Tiger) tiger).hunting();
//		
//		eagle.move();
//		((Eagle) eagle).flying();
		
	}
}
