## Web 에 Hello 출력하기

![image](https://user-images.githubusercontent.com/59171113/104302943-c64f8200-550c-11eb-97ee-be37889d3407.png)

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

![image](https://user-images.githubusercontent.com/59171113/104303004-da937f00-550c-11eb-94f7-ef55ab71b9c5.png)

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
      	@GetMapping("hello")
      	public String hello(Model model) {
      		model.addAttribute("data", "Hello!!");
      		return "hello";
      	}
      }
      ```

- resources/templates/hello.html
  - http://localhost:8080/hello 입력시 웹에 출력
  
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
