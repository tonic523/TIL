package learnJava5.lamdaInterface;

public class MainClass {
	
	public static void main(String[] args) {
		LamdaInterface1 li1 = (int i, int k) -> System.out.println(i + " " + k);
		li1.method(10, 20);
		
		LamdaInterface2 li2 = (i) -> System.out.println(i);
		li2.method(30);
		
		LamdaInterface3 li3 = () -> System.out.println("No parameter");
		li3.method();
		
		LamdaInterface4 li4 = (int x, int y) -> {
			return x+y;
		};
		System.out.println("li4.method(10, 20) : " + li4.method(10, 20));
	}
		
}
