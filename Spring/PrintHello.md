## Web 에 Hello 출력하기

<img src="C:\Users\diddm\AppData\Roaming\Typora\typora-user-images\image-20210112114950714.png" alt="image-20210112114950714" style="zoom:67%;" />

- localhost:8080
  - src/main/resource/static/index.html 파일을 웹에 출력한다.

```
<!DOCTYPE HTML>
<html>
<head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html"  charset="UTF-8"/>
</head>
<body>
Hello
<a href="/hello">hello</a>
</body>
</html>
```

<img src="C:\Users\diddm\AppData\Roaming\Typora\typora-user-images\image-20210112115251539.png" alt="image-20210112115251539" style="zoom:80%;" />

- helloController(컨트롤러)

  - @Controller로 메소드를 정의한다(java/hello/hellospring/controller/HelloController)

    - ```
      @Controller
      public class HelloController {}
      ```

  - @GetMapping을 사용하여 웹 애플리케이션에서 호출하는 값을 정의한다.

    - model 에서 "data" = 키 , "Hello!!" = 값

    - return 값은 resources/templates 'return 값'.html 을 가르킵니다.

    - ```
      @Controller
      public class HelloController {
      	@GetMapping
      	public String hello(Model model) {
      		model.addAttribute("data", "Hello!!");
      		return "hello";
      	}
      }
      ```

- resources/templates/hello.html
  - http://localhost:8080/hello 입력시 웹에 출력
  -
  ```
    <!DOCTYPE HTML>
    <html xmlns:th="http://www.thymeleaf.org">
    <head>
        <title>Hello</title>
        <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8" />
    </head>
    <body>
    <p th:text="'안녕하세요. ' + ${data}" >안녕하세요. 손님</p>
    </body>
    </html>
  ```

```




```
