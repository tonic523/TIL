package learnJava4;

public class MainClass {

	public static void main(String[] args) {
		/*
		ParentClass childs[] = new ParentClass[2];//클래스는 자료형으로 취급, 배열로 사용가능
		FirstChildClass child1 = new FirstChildClass();
		SecondChildClass child2 = new SecondChildClass();
		
		childs[0] = child1;//자식클래스는 부모클래스에 적용가능
		childs[1] = child2;
		
		child1.parentFun();//부모클래스의 메소드를 오버라이드
		
		new FirstChildClass() {
			public void parentFun() {//익명클래스 메소드 호출: 이름이 없고 한번만 호출하고 끝내는 기능
				System.out.println("-----AnonymousClass-----");
			}
		}.parentFun();
		*/
		school stu1 = new student();
		school pro1 = new professor();
		
		school schools[] = {stu1,pro1};
		
		for (int i = 0; i < schools.length; i++) {
			schools[i].study();
			schools[i].teach();
			schools[i].rest();
			schools[i].sleep();
		}

	}

}
