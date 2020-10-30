package learnJava4;

public class FirstChildClass extends ParentClass {//상속(extends)받은 자식클래스
	public FirstChildClass() {
		System.out.println("-----FirstchildClass constructor-----");
	}
	
	public void firstchildFun() {
		System.out.println("----firstchild FUN!!-----");
	}
	@Override//부모클래스에 메소드를 오버라이드
	public void parentFun() {
		System.out.println("-----parent FUN! and FirstChild too Fun!!-----");
	}
	
}
