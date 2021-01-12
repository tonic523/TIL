# 스프링 부트(Spring initializr)

### Dependencies
> 어떤 라이브러리를 쓸건지 선택

- Spring Web : 스프링으로 웹 개발할 때 사용
- Thymeleaf : html을 만들어주는 템플릿 엔진(회사마다 다르다)
### 스프링 부트 라이브러리
- spring-boot-starter-web
  - spring-boot-starter-tomcat: **톰켓 (웹서버)**
  - spring-boot-starter-thymeleaf:**타임리프 템플릿 엔진(View)**
  - spring-boot-starter(공통): **스프링 부트+스프링 코어+ 로깅**
    - spring-boot
      - spring-core
    - spring-boot-starter-logging
      - logback, slf4j
### 테스트 라이브러리
- spring-boot-starter-test
  - juit: **테스트 프레임워크**
  - mockito: 목 라이브러리
  - assertj: 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
  - spring-test: 스프링 통합 테스트 지원
### 스프링에서 원하는 기능 찾는 방법
- spring.io에 접속
- Projects -> Spring Boot
- Learn -> 내가 지금 사용하고 있는 버전
- 검색기능을 통해 찾기
