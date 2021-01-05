## Scanner (nextInt-> nextLine) 사용시 문제점

- nextInt 사용시 숫자를 입력받고 엔터를 쳤을 때 문제가 발생한다.
- nextInt는 엔터(개행문자)입력전까지 입력을 받기 때문에 개행문자의 값을 nextLine이 읽었기 때문이다.
- 이를 해결하기 위해 nextInt와 nextLine 사이에 nextLine() 함수를 한번 더 사용해 개행문자를 없애준다.

<img src="C:\Users\diddm\AppData\Roaming\Typora\typora-user-images\image-20201230120916423.png" alt="image-20201230120916423" style="zoom:80%;" />

## char형 입력받기

```
Scanner scanner = new Scanner(System.in);
command = scanner.next().charAt(0);
```

## 메소드 Scanner 사용

- 메소드마다 스케너를 생성하기 위해 객체를 생성하면 부하가 많이 걸리기 때문에 매개변수를 통해 스캐너를 생성한다.

```
public static int useScanner(Scanner s){
int num = s.nextInt();
return num;
}

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int num = useScanner(scanner);
}
```
