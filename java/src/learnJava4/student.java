package learnJava4;

public class student implements school {//인터페이스를 활용
	@Override
	public void study() {
		System.out.println("A student is studying.");
	};
	@Override
	public void teach(){
		System.out.println("A student can't study.");
	};
	@Override
	public void rest(){
		System.out.println("A student is resting.");
	};
	@Override
	public void sleep(){
		System.out.println("A student is sleeping.");
	};
}
