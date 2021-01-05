## SimpleDateFormat 클래스

- SimpleDateFormat 클래스에서 새로운 객체를 생성한다.(이때 매개변수가 필요하다!)

```
SimpleDateFormat sdf = new SimpleDateFormat("yyyy / MM / dd / HH:mm:ss");
```

- 아직 sdf는 객체값을 가지고 있기 때문에 String 타입으로 변환해준다.

```
String datestr = sdf.format(cal.getTime());
System.out.println(datestr);
```

**실행값:**

**2021/01/05/17:45:31**
