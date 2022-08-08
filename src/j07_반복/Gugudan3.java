package j07_반복;

public class Gugudan3 {

	public static void main(String[] args) {
		int i = 0;
		
		while(i < 8) {
			int dan = i + 2;
			System.out.println(dan + "단");
			
			int j = 0;
			while(j < 9) {
				int num = j + 1;
				System.out.println(dan + " x " + num + " = " + (dan * num));
				j++;
			}
			System.out.println();
			
			i++;
		}
	}

}
