package j19_익명클래스;

public class AddTestMain2 {

	public static void main(String[] args) {
		Add<String> a = new Add<String>() {
			
			@Override
			public String add(String x, String y) {
				return x + y;
			}
		};
		
		String result = a.add("안녕 ", "하세요.");
		System.out.println(result);

	}

}
