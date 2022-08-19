package j17_컬렉션.Set;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		// 값 추가
		set.add("김준일");
		set.add("김준이");
		set.add("김준삼");
		set.add("김준사");
		
		System.out.println(set);
		
		// set 데이터 전체 조회
		System.out.println("<<<< Iterator >>>>");
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		System.out.println("<<<< foreach >>>>");
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println("<<<< lambda foreach >>>>");
		set.forEach(str -> {
			System.out.println(str);
		});
		
		System.out.println();
		
		// 찾고자하는 값을 구하는 방법
		
		Iterator<String> ir2 = set.iterator();
		
		while(ir2.hasNext()) {
			if(ir2.next().equals("김준이")) {
				System.out.println("김준이를 찾음");
			}
		}
		
		System.out.println();
		
		// 값 제거
		ir2 = set.iterator();
		
		while(ir2.hasNext()) {
			if(ir2.next().equals("김준이")) {
				set.remove("김준이");
				break;
			}
		}
		
		System.out.println(set);
		
	}

}










