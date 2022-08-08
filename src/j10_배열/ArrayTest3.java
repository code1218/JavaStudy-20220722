package j10_배열;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		String[] names = new String[] {
			"김준일",
			"강지원",
			"박광현",
			"박상호",
			"장한이",
			"이진서",
			"이가경",
			"강성빈"
		};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + "번: " + names[i]);
		}

	}

}




