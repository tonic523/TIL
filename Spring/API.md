### API
> return 값을 그대로 내려준다.

![image](https://user-images.githubusercontent.com/59171113/104457095-ece4ea00-55ec-11eb-8147-d76bf370b0b4.png)
- @GetMapping으로 어노테이션된 메소드에 @ResponseBody도 어노테이션된 메소드를 호출할 때

```
@GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello " + name;
    }
```
> 리턴 값이 String일 경우 그대로 웹에 출력한다.

- 리턴 값이 객체일 경우

```
@GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
```
> 객체를 json 방식(키, 값)으로 웹에 출력한다.(기본 디폴트 방식)

![image](https://user-images.githubusercontent.com/59171113/104457129-f53d2500-55ec-11eb-93c1-9a270f6c0fbd.png)

**json**
- 키 값으로 이루어진 데이터 구조
- ```
  {"name":"string"}
  ```
