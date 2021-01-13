### MVC와 템플릿 엔진
> MVC : Model, View, Controller
**Controller**
- 비즈니스 로직과 관련된 것
- 내부적인 것을 처리할 때
**View**
- 보여지는 것
**static 디렉토리**
> 직접 파일이름을 입력하여 출력할 수 있는 파일 모음
- 컨트롤러에서 먼저 찾고 없으면 static 폴더에서 파일을 찾는다.
**Controller**
- 주소칸에 파라미터 입력받아 웹에 출력하기

```
http://localhost:8080/hello-mvc?name=spring
```

- Controller에서 @Controller 로 어노테이션 된 클래스에서 @GetMapping("hello-mvc")로 어노테이션된메소드를 실행한다.

```
@Controller
public class HelloController {

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }
    
}
```

- @RequestParam이 파라미터를 입력받는다.
  -  http://localhost:8080/hello-mvc **?name=spring**
- model에 입력받은 파라미터 값을 templates 폴더내에 hello-template으로 전달하고 이 파일을 웹에 출력한다.(viewResolver)

```
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>hello</title>
    <meta http-equiv="Content-Type" content="text/html";  charset="UTF-8"/>
</head>
<body>
<p th:text = "'hello ' + ${name}" ></p>
</body>
</html>
```

>xmlns : thymeleaf 탬플릿을 적용
>
>th:text = "'hello ' + ${name}"--> name에 모델이 받은 name값을 대입하고 출력한다.
>
![image](https://user-images.githubusercontent.com/59171113/104457069-e191be80-55ec-11eb-9812-5ea25c188af2.png)
