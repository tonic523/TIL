## 파일 입출력

#### 파일 쓰기

FileOutputStream 은 byte배열을 문자열로 바꿔줘야한다.

- FileWriter클래스(파일에 텍스트 쓰기)
  > 문자열을 직접 파일에 쓸 수 있다.

```
import java.io.FileWriter;
import java.io.IOException; // 예외처리
```

```
public static void main(String[] args) throws IOException /* 예외처리 */ {
		//파일 쓰기 객체 생성
		FileWriter scheduleFile = new FileWriter("C:\\Users\\diddm\\Desktop\\JAVA\\programmers\\src\\programmers\\test.txt");
		Scanner scanner = new Scanner(System.in);
		System.out.println("날짜를 입력하세요.");
		String date = scanner.next();
		System.out.println("일정을 입력하세요.");
		String sch = scanner.next();
		//파일 쓰기
		scheduleFile.write(date);
		scheduleFile.write(sch);

		scheduleFile.close();
	}
```

**입력값**
날짜를 입력하세요.
2020-01-07
일정을 입력하세요.
coding

**결과값**
파일-test.txt

```
2020-01-07coding
```

- PrintWriter
  > 입력할 때 마다 다음줄로 넘어갈 때 사용한다.

```
import java.io.FileWriter;
import java.io.IOException; // 예외처리
import java.io.PrintWriter; // 추가
public static void main(String[] args) throws IOException /* 예외처리 */ {
		//파일 쓰기 객체 생성
		FileWriter scheduleFile = new FileWriter("C:\\Users\\diddm\\Desktop\\JAVA\\programmers\\src\\programmers\\test.txt");
		Scanner scanner = new Scanner(System.in);
		System.out.println("날짜를 입력하세요.");
		String date = scanner.next();
		System.out.println("일정을 입력하세요.");
		String sch = scanner.next();
		//파일 쓰기
		scheduleFile.write(date);
		scheduleFile.write(sch);

		scheduleFile.close();
	}
```

**입력값**
날짜를 입력하세요.
2020-01-07
일정을 입력하세요.
coding

**결과값**
파일-test.txt

```
2020-01-07
coding
```
