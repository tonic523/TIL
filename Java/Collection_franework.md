# 컬렉션 프레임워크

자료구조를 기반으로 **데이터의 CRUD**를 사용자가 효율적으로 객체를 사용하기 위해 작성 되어있는 인터페이스, 클래스

## ArrayList

기존의 배열의 단점을 보완한 배열

> List 인터페이스를 상속받은 클래스, 크기가 가변적으로 변하는 선형리스트
>
> 일반적인 배열과 같은 순차리스트
>
> 한번 생성되면 크기가 변하지 않는 배열과 달리 저장 용량을 초과한다면 자동으로 부족한 크기만큼 저장 용량이 늘어나는 특징을 가지고 있다.

- 사용방법

  ```
  import java.util.ArrayList;

  ArrayList<자료형> 배열 = new ArrayList<>();

  배열.add(값); 배열에 값을 추가한다.(인덱스 순서대로 0,1,2,3...)
  배열.add(값2);
  배열.size(); 배열의 사이즈 값을 구한다.
  배열.get(인덱스); 배열의 인덱스값을 받아 해당하는 값을 받아온다.
  배열.remove(인덱스); 배열의 인덱스값을 받아 해당하는 값을 제거한다.
  ```

## HashMap

key-value 형태로 데이터를 저장하여 key 값으로 value를 탐색할 수 있다.

> Map 인터페이스를 구현한 대표적인 Map 컬렉션
>
> Map은 키와 값으로 구성된 객체를 저장하는 구조를 가지고 있는 자료구조
>
> 많은 양의 데이터를 검색할 때 사용된다.

- 사용방법

```
import java.util.HashMap;

HashMap<String, String> a = new HashMap<>();
		a.put("이름", "최우석"); 배열에 값을 추가
		a.put("나이", "25");

		System.out.println(a.get("이름")); 배열에 값 출력
		System.out.println(a.get("나이"));

		a.remove("나이"); 배열에 값 제거
		System.out.println(a.get("나이"));

		System.out.println(a.size()); 배열의 크기 출력
```
