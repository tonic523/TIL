package learnJava3;

import learnJava2.Student;//learnJava2 패키지의 Student클래스를 사용하기 위해

public class MainClass {

	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass();//레퍼런스(포인터) obj1의 주소 생성
		ObjectClass obj2 = new ObjectClass();//레퍼런스(포인터) obj2의 주소 생성
		ObjectClass obj3 = new ObjectClass("Hello", 10);//사용자 정의 생성자
		System.out.println("obj1의 레퍼런스 = " + obj1);
		
		obj1.SetInfo("Hi", 20);
		obj1.GetInfo();
		
		obj3.GetInfo();
		
		
		System.out.println("obj2의 레퍼런스 = " + obj2);		
		obj2 = null; // 래퍼런스 x
		System.out.println("obj2의 레퍼런스 = " + obj2);
		// obj2.GetInfo();  NullPointerException 발생
		
		Student stu1 = new Student("최우석", 90);
		stu1.GetInfo();
		stu1.setName("정동원");//setter
		stu1.setScore(80);//getter
		stu1.GetInfo();
	}

}
