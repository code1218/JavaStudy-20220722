package j17_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class AlphabetMap {

	public static void main(String[] args) {
		HashMap<String, String> alphabet = new HashMap<String, String>();
		
		char a = 'a';
		
		for(int i = 0; i < 26; i++) {
			String low = Character.toString((char) (a + i));
			String upper = Character.toString((char) (a - 32 + i));
			alphabet.put(low, upper);
		}
		
		alphabet.put("1", "one");
		alphabet.put("2", "one");
		alphabet.put("3", "one");
		alphabet.put("4", "one");
		alphabet.put("5", "one");
		
		System.out.println(alphabet);
		
		System.out.println(alphabet.get("b"));
		
		System.out.println(alphabet.keySet());
		System.out.println(alphabet.values());
		
		ArrayList<String> test = new ArrayList<String>();
		test.addAll(alphabet.values());
		
		System.out.println(test.get(10));
		
		HashSet<String> test2 = new HashSet<String>();
		test2.addAll(alphabet.values());
		
		System.out.println(test2);
		
		test.clear();
		
		test.addAll(test2);
		
		System.out.println(test2);
		
		System.out.println(test.indexOf("one"));
		
		System.out.println(test.get(test.indexOf("one")));
		
		System.out.println(alphabet.entrySet());
		
		System.out.println(alphabet.entrySet().iterator().next().getKey());
		System.out.println(alphabet.entrySet().iterator().next().getValue());
	}

}






