package j04_문자열;

public class String3 {

	public static void main(String[] args) {
		String address = "경상남도 창원시 동래구 사직동 동산아파트";
		
		// indexOf() => 왼쪽을 기준으로 찾고자 하는 문자열의 위치를 반환
		int index1 = address.indexOf("시");
		int index2 = address.indexOf("구");
		int index3 = address.indexOf("동", address.indexOf("동") + 1);
		
		System.out.println("시: " + index1);
		System.out.println("구: " + index2);
		System.out.println("동: " + index3);
		
		// lastIndexOf() => 오른쪽을 기준으로 찾고자 하는 문자열의 위치를 반환
		int index4 = address.lastIndexOf("동", address.lastIndexOf("동") - 1);
		System.out.println("동: " + index4);
		
		int index5 = address.indexOf(" ");
		int index6 = address.indexOf(" ", index5 + 1);
		
		System.out.println(address.substring(index5 + 1, index6));

	}

}






