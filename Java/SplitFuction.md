## Split

- Split() 함수로 문자열 자르기

```
String input = "Hello";
String[] inputSplit = input.split("(?!^)");
for (int i = 0; i < inputSplit.length; i++) {
			System.out.println(inputSplit[i]);
		}
```

**실행값:**

**H**

**e**

**l**

**l**

**o**
