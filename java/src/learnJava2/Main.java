package learnJava2;

public class Main// 메인 클래스: 자바를 실행시킬때 컴퓨터가 가장 먼저 수행하는 클래스
{
	public static void main(String[] args) {
	Student student = new Student();// 생성자: 객체 생성
	student.SetInfo("최우석", 90);// 메소드: 파라미터를 통해 입력
	student.GetInfo();//메소드: 정보 출력
	// student.Secret();// private이기 때문에 Student객체에서만 사용가능
}
}
