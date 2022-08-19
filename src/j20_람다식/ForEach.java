package j20_람다식;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ForEach {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("김준일");
		names.add("장한이");
		names.add("이가경");
		names.add("강지원");
		names.add("이승민");
		
		names.forEach(name -> {
			System.out.println("이름: " + name);
		});
		
		Map<String, String> user = new HashMap<String, String>();
		user.put("김준일", "부산");
		user.put("이승민", "경남");
		user.put("김하진", "경북");
		user.put("장한이", "울산");
		
		user.forEach((key, value) -> {
			System.out.println("이름: " + key);
			System.out.println("지역: " + value);
			System.out.println();
		});
		
		/*============<< UUID >>============*/
		
		String key = UUID.randomUUID().toString().replaceAll("-", "");
		
		System.out.println(key);

	}

}








