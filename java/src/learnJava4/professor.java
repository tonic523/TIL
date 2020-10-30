package learnJava4;

public class professor implements school{//인터페이스를 활용
	@Override
	public void study() {
		System.out.println("A professor is studying hard.");
	};
	@Override
	public void teach(){
		System.out.println("A professor is studying.");
	};
	@Override
	public void rest(){
		System.out.println("A professor is studying.");
	};
	@Override
	public void sleep(){
		System.out.println("A professor is studying.");
	};
}
