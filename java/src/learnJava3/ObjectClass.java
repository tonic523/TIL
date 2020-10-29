package learnJava3;

public class ObjectClass {
	
	public String s;
	public static int x;//static을 사용하면 속성과 메소드를 객체 사이에서 어디서나 공유할 수 있다.
	
	
	public ObjectClass() {
		System.out.println("디폴트 생성자");
	}
	public ObjectClass(String s, int x) {
		System.out.println("사용자 정의 생성자");
		this.s = s;//this는 현재 객체를 가르킴
		this.x = x;
		
	}
	public void SetInfo(String s, int x) {
		System.out.println("----SetInfo-----");
		this.s = s;//this는 현재 객체를 가르킴
		this.x += x;
	}
	
	public void GetInfo() {
		System.out.println("----GetInfo-----");
		System.out.println("s----> " + this.s);
		System.out.println("x----> " + this.x);
	}
}
