### 캘린더 클래스 활용

```
import java.util.Calendar;
```

- 현재 날짜와 시간만 구하면 되기 때문에 하나의 객체만 생성

```
Calendar cal = Calendar.getInstance();
```

- 연도 구하기

```
int year = cal.get(Calendar.YEAR);
System.out.println(year);
```

- 월 구하기

```
int month = cal.get(Calendar.MONTH) + 1;
System.out.println(month);
```

- 일, 분, 시, 초 구하기

```
int day = cal.get(Calendar.DAY_OF_MONTH);
int hour = cal.get(Calendar.HOUR_OF_DAY);
int min = cal.get(Calendar.MINUTE);
int sec = cal.get(Calendar.SECOND);
```
