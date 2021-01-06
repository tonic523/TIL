## 예외처리

- 예외 발생

```
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a의 값을 입력해주세요");
		System.out.print("> ");
		int a = scanner.nextInt();
		System.out.println("b의 값을 입력해주세요");
		System.out.print("> ");
		int b = scanner.nextInt();
		System.out.printf("%d + %d = %d", a, b, a/b);
		scanner.close();
	}
```
**입력값** >> a : 10 , b : abc

**결과값**

Exception in thread "main" **java.util.InputMismatchException**
at java.base/java.util.Scanner.throwFor(Scanner.java:939)
at java.base/java.util.Scanner.next(Scanner.java:1594)
at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
at programmers.Exam1.main(Exam1.java:14)

**java.util.InputMismatchException** 클래스형 예외 발생

- 정수형 입력에 문자열이 들어가서 '입력 부적합 예외'가 발생했다.

**입력값**>> a : 10 , b : 0

**결과값**

Exception in thread "main" **java.lang.ArithmeticException**: / by zero
at programmers.Exam1.main(Exam1.java:15)

**java.lang.ArithmeticException**클래스형 예외 발생

- 산술 연산 예외(0으로 나누기) 예외가 발생했다.

이를 해결하기 위해 **try-catch**를 사용한다.

```
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			try {
				System.out.println("a의 값을 입력해주세요");
				System.out.print("> ");
				int a = scanner.nextInt();
				System.out.println("b의 값을 입력해주세요");
				System.out.print("> ");
				int b = scanner.nextInt();
				System.out.printf("%d + %d = %d", a, b, a / b);
			} catch (ArithmeticException e) {
				System.out.println("산술 오류 발생 -> " + e);
			} catch (InputMismatchException e) {
				System.out.println("입력 오류 발생 -> " + e);
				System.out.println("다시 입력해주세요.");
			}finally {
				System.out.println("-------------------");
			}

		scanner.close();
	}
```

- try
  - try 블록에서 예외가 발생하면, 처리가 중단되고 catch 절로 프로그램이 흐름이 이동하여 예외를 포착합니다.
  - 예외가 발생하지 않으면 try 블록은 끝까지 실행합니다.
- catch
  - 예외를 포착해 구체적인 처리를 하는 부분
- finally
  - try 블록에서 예외 발생 유무와 관계없이 반드시 실행됩니다.
