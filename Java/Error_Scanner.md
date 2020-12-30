## Scanner (nextInt-> nextLine) 사용시 문제점

nextInt 사용시 숫자를 입력받고 엔터를 쳤을 때 문제가 발생한다.

nextInt는 엔터(개행문자)입력전까지 입력을 받기 때문에 개행문자의 값을 nextLine이 읽었기 때문이다.

이를 해결하기 위해 nextInt와 nextLine 사이에 nextLine() 함수를 한번 더 사용해 개행문자를 없애준다.

<img src="C:\Users\diddm\AppData\Roaming\Typora\typora-user-images\image-20201230120916423.png" alt="image-20201230120916423" style="zoom:80%;" />
