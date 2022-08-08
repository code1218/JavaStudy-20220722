package j03_연산자;

public class Operation1 {
	
	public static void main(String[] args) {
		int num = 10;
		
		num = num + 1;
		System.out.println(num);
		
		System.out.println(++num);
		System.out.println(num);
		
		System.out.println(num++);
		System.out.println(num);
		
		num = num + 1; // ++num
		System.out.println(num);
		
		System.out.println(num);// num--
		num = num + 1; 
		System.out.println(num);
		
		
	}
	
}
