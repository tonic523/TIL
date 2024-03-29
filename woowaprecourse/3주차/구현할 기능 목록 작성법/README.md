# 구현할 기능 목록 작성법
> 구현할 기능 목록을 너무 상세하게 작성하지 않는다.

1주차와 2주차까진 구현할 기능 목록이 그렇게 많지 않았기 때문에 각 객체간의 상호작용을 어떻게 하는지까지 머릿속으로 구상이 가능한 정도였던 것 같다.\
머릿속으로 이미 구상이 되있기 때문에 기능 목록을 메서드단위까지 디테일하게 작성할 수 있었고 구현하면서 수정할 때도 있지만 충분히 감당 가능한 정도였다.

> 3주차 부터 프로그램의 전체적인 흐름이 머릿속에 들어오지 않는다.

3주차의 기능 요구사항을 보면서 1,2주차와 비교했을 때 확실히 구현할 요구사항이 많았다.\
처음엔 하던대로 자판기의 흐름을 이해하기 위해 생각나는 대로 구현할 기능 목록을 작성하고 구현을 시작했지만 어려운 부분이 많았다.
1. 객체 간의 상호작용을 이해하기 어려웠다.
2. 구현할 기능 목록에 추가할 상황이 많았다.
3. 어느 정도 구현했을 때 구현한 기능들을 대대적으로 리팩토링을 해야하는 경우가 생겼다.

> 보완점, 해결 방법
- 요구사항의 구현 단위를 기준으로 브랜치를 따로 파서 구현한다.

위 방법으로 구현하려면 다음과 같은 방법을 반복한다.
1. 브랜치를 만든다.
2. 요구사항의 구현 단위를 보고 구현할 기능 목록을 작성한다.
3. 구현할 기능 목록을 구현한다.
4. 구현한 기능들을 크게 리팩토링 해야하는 경우가 생긴다면 1번 부터 다시 한다. (이 때 리팩토링할 부분을 반영하여 시작한다) 

> before

![image](https://user-images.githubusercontent.com/59171113/145680551-57ff4463-329f-4054-b894-f0503b526fed.png)

> after

![image](https://user-images.githubusercontent.com/59171113/145680886-dbd55a52-8564-4b25-b183-0233b137099f.png)
