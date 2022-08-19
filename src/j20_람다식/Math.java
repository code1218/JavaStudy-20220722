package j20_람다식;

public class Math {

	public static void main(String[] args) {
		Add<Integer> integerAdd = new Add<Integer>() {
			
			@Override
			public Integer add(Integer x, Integer y) {
				return x + y;
			}
		};
		
		Add<Integer> integerAdd2 = new Add<Integer>() {
			
			@Override
			public Integer add(Integer x, Integer y) {
				return (x * x) + (y * y);
			}
		};
		
		int result1 = integerAdd.add(10, 20);
		System.out.println("result1: " + result1);
		
		int result2 = integerAdd2.add(10, 20);
		System.out.println("result2: " + result2);
		
		/*=======================<< lambda >>===========================*/
		
		Add<Integer> lambdaAdd = (a, b) -> a + b;
		
		int result3 = lambdaAdd.add(5, 2);
		System.out.println("result3: " + result3);
		
		Add<Integer> lambdaAdd2 = (c, d) -> {
			System.out.println("c: " + c);
			System.out.println("d: " + d);
			return c + d;
		};
		
		int result4 = lambdaAdd2.add(5, 2);
		System.out.println("result4: " + result4);

	}

}





