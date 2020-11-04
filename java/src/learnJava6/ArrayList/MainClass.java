package learnJava6.ArrayList;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("list size : " + list.size());
		//데이터 추가
		list.add("Hello ");
		list.add("Java ");
		list.add("World!");
		System.out.println(list.get(0));
		System.out.println("list size : " + list.size());
		//데이터 재설정
		list.set(0, "Hi");
		System.out.println(list.get(0));
		//데이터 제거
		list.remove(0);
		System.out.println(list.get(0));
		//모든 데이터 초기화
		list.clear();
		//데이터 유무
		boolean b = list.isEmpty();
		System.out.println("list is Empty : " + b);
	}

}
