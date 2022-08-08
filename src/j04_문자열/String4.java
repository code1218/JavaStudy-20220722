package j04_문자열;

public class String4 {

	public static void main(String[] args) {
		String address = "경상남도 창원시 동래구 사직동 동산아파트";
		
		int index1 = address.indexOf(" ");
		int index2 = address.indexOf(" ", index1 + 1);
		int index3 = address.indexOf(" ", index2 + 1);
		int index4 = address.indexOf(" ", index3 + 1);
		
		System.out.println(address.substring(0, index1));
		System.out.println(address.substring(index1 + 1, index2));
		System.out.println(address.substring(index2 + 1, index3));
		System.out.println(address.substring(index3 + 1, index4));
		System.out.println(address.substring(index4 + 1));
		

	}

}






