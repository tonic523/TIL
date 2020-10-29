package learnJava2;

public class Student {//클래스 이름: 일반적으로 첫글자는 대문자로
	private String name;// 속성(정보 은닉)
	private int score;// 속성(정보 은닉)
	
	public Student()// 생성자
	{
		System.out.println("----constructor-------");
	}
	
	public Student(String n, int s)// 생성자: 파라미터 사용 /오버로딩: 파라미터가 다르면 이름을 똑같이 사용할 수 있다.
	{
		System.out.println("------constructor(parameter)----");
		name = n;
		score = s;
	}
	
	public void SetInfo(String n,int s) //메소드
	{
		System.out.println("----SetInfo----");
		name = n;
		score = s;
	}
	public void GetInfo() //메소드
	{
		System.out.println("----GetInfo----");
		System.out.printf("이름: %s\n", name);
		System.out.printf("점수: %d\n", score);
		Secret();
	}
	
	
	// getter, setter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	private void Secret()//메소드: Student 클래스에서만 접근 가능
	{
		System.out.println("보안정보");
	}
}
