package learnJava6.HashMap;

import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("map size : " + map.size());
		//키,데이터 값 입력
		map.put(1, "Hello");
		map.put(2, "Bye");
		map.put(22, "Java world!");
		System.out.println("map : " + map);
		System.out.println("map size : " + map.size());
		//키, 데이터 재설정
		map.put(2, "Hi");
		System.out.println("map : " + map);
		//제거
		map.remove(2);
		System.out.println("map : " + map);
		//데이터 추출
		String str1 = map.get(22);
		System.out.println("str1 : " + str1);
		//데이터 전체제거
		map.clear();
		System.out.println("map size : " + map.size());
		//데이터 유무
		boolean b = map.isEmpty();
		System.out.println("map is Empty : " + b);
	}

}
