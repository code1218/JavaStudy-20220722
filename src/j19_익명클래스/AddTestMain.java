package j19_익명클래스;

public class AddTestMain {

	public static void main(String[] args) {
		Add<Integer> a = new Add<Integer>() {
			
			@Override
			public Integer add(Integer x, Integer y) {
				return x + y;
			}
		};
		
		int result = a.add(10, 20);
		System.out.println(result);

	}

}
