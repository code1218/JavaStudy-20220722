package j17_컬렉션.List;

import java.util.ArrayList;

public class StringArrayListMain {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		//값 추가
		numberList.add(10);
		numberList.add(30);
		numberList.add(10);
		numberList.add(10);
		numberList.add(10);
		
		//값을 get(가져오기)
		System.out.println(numberList.get(1));
		
		//제거
		numberList.remove(1);
		
		//값 찾기
		//1. 데이터가 포함되어 있는지 없는지
		boolean r1 = numberList.contains(10);
		System.out.println("contains: " + r1);
		
		//2. 해당 데이터의 위치를 찾아주는 기능
		int index = numberList.indexOf(10);
		System.out.println("indexOf: " + index);
		
		//원하는 위치에 값 삽입
		numberList.add(1, 20);
		
		//값 수정
		numberList.set(2, 50);
		
		System.out.println(numberList);
		
		for(int i : numberList) {
			System.out.println(i);
		}
		
		for(int i = 0; i < numberList.size(); i++) {
			System.out.println(numberList.get(i));
		}
		
		Object[] nums = numberList.toArray();
		for(Object obj : nums) {
			System.out.println((Integer) obj);
		}

	}

}






