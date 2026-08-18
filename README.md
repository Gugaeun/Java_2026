# ☕ Java 2026

Java 수업에서 진행한 내용을 정리한 저장소입니다.
기초 문법과 객체지향부터, **Servlet/JSP 기반 웹 백엔드 개발**까지 단계적으로 학습했습니다.

---

## 📚 Part 1. Java 기초 & 객체지향 (Week 1~8)

### 🗓 Week 1 - Java 기초(이론)
- 변수, 자료형 / 출력 및 입력 / 기본 연산자

💬 Java의 기본 구조와 문법을 처음 학습한 주차

---

### 🗓 Week 2 - 조건문 / 반복문
- [Java_2week](https://github.com/Gugaeun/Java_2026/tree/main/Java_2week)
- if / switch, for / while, 간단한 문제 풀이
- [예제 코드](https://github.com/Gugaeun/Java_2026/blob/main/Java_2week/src/Mypack/TypeConversion.java)

---

### 🗓 Week 3 - 배열
- [Java_3week](https://github.com/Gugaeun/Java_2026/tree/main/Java_3week)
- 1차원 배열, 배열을 활용한 문제 해결
- [예제 코드](https://github.com/Gugaeun/Java_2026/blob/main/Java_3week/src/Practice/SuccessOrFail.java)

---

### 🗓 Week 4 - 객체지향 기초
- [Java_4week](https://github.com/Gugaeun/Java_2026/tree/main/Java_4week)
- 클래스 / 객체, 생성자, 메서드
- [예제 코드](https://github.com/Gugaeun/Java_2026/blob/main/Java_4week/src/Practice4/SevenPratice.java)

---

### 🗓 Week 5 - 객체지향 심화
- [Java_5week](https://github.com/Gugaeun/Java_2026/tree/main/Java_5week)
- 캡슐화, 접근제어자, 클래스 설계
- [예제 코드](https://github.com/Gugaeun/Java_2026/blob/main/Java_5week/src/Practice5/ScoreAverage.java)

---

### 🗓 Week 6 - 배열 예외처리 & 상속
- [Java_6week](https://github.com/Gugaeun/Java_2026/tree/main/Java_6week)
- 배열 관련 예외 처리, 정적(static) 멤버, 상속(super)
- [예제 코드](https://github.com/Gugaeun/Java_2026/blob/main/Java_6week/src/pratice6/StaticMember.java)

---

### 🗓 Week 7 - 다형성 & 자바 심화 문법
- [Java_7week](https://github.com/Gugaeun/Java_2026/tree/main/Java_7week)
- 인터페이스, 메서드 오버라이딩, equals/toString, 오토박싱, StringBuffer
- [예제 코드](https://github.com/Gugaeun/Java_2026/blob/main/Java_7week/src/Practice7/InterfaceEx.java)

---

### 🗓 Week 8 - 컬렉션 & 파일 입출력
- [Java_8week](https://github.com/Gugaeun/Java_2026/tree/main/Java_8week)
- ArrayList, HashMap, Vector, Iterator 등 컬렉션 프레임워크
- 제네릭 메서드, 파일 입출력(FileReader/Writer, BufferedIO)
- [예제 코드](https://github.com/Gugaeun/Java_2026/blob/main/Java_8week/src/Practice8/HashMapStudentEx.java)

💬 자바 기초 문법에서 컬렉션·파일 입출력까지 실무에서 자주 쓰는 도구들을 학습 마무리

---

## 📚 Part 2. Servlet/JSP 웹 백엔드 (pro05 ~ pro17)

Tomcat 서버와 Servlet/JSP를 이용해 **웹 애플리케이션 서버 개발**을 실습했습니다.

| 프로젝트 | 주제 |
|---|---|
| [pro05](https://github.com/Gugaeun/Java_2026/tree/main/pro05) | Tomcat 연동, 첫 Servlet 작성 |
| [pro06](https://github.com/Gugaeun/Java_2026/tree/main/pro06) | Servlet으로 폼 데이터 처리, 로그인 예제 |
| [pro07](https://github.com/Gugaeun/Java_2026/tree/main/pro07) | **DAO/VO 패턴**으로 회원 관리, Oracle DB 연동(JDBC) |
| [pro08](https://github.com/Gugaeun/Java_2026/tree/main/pro08) | RequestDispatcher(forward), ServletContext |
| [pro09](https://github.com/Gugaeun/Java_2026/tree/main/pro09) | **Cookie** 설정/조회 |
| [pro10](https://github.com/Gugaeun/Java_2026/tree/main/pro10) | **Session** 관리, 로그인/로그아웃, 필터(Filter) |
| [pro14](https://github.com/Gugaeun/Java_2026/tree/main/pro14) | JSP, **EL(표현언어)**, JSTL 태그 라이브러리 |
| [pro17](https://github.com/Gugaeun/Java_2026/tree/main/pro17) | **MVC 패턴**(Controller-Service-DAO)으로 게시판(Board) CRUD 구현 |

💬 단순 Servlet 작성에서 시작해, 세션/쿠키 기반 로그인 처리, DB 연동, MVC 패턴 게시판까지 웹 백엔드의 전체 흐름을 실습

---

## ⭐ Key Takeaways

- Java 기본 문법, 객체지향(캡슐화·상속·다형성), 컬렉션·파일 입출력까지 언어 전반을 학습
- Servlet 생명주기, HTTP 요청/응답 처리, Session/Cookie를 이용한 상태 관리 이해
- DAO/VO 패턴과 MVC 패턴을 적용해 DB 연동 게시판(CRUD)을 직접 구현
- JSP·EL·JSTL을 활용한 뷰(View) 처리 경험
- Spring 이전 단계의 순수 Servlet/JSP 기반 웹 개발 흐름을 체득

---

## 🔗 관련 저장소

- [Java_Spring_Study](https://github.com/Gugaeun/Java_Spring_Study) — 이후 Spring 프레임워크로 확장한 학습 (이전 학기)

---

## 🛠 Tech Stack
- Java, Servlet, JSP, JSTL, Tomcat, JDBC(Oracle)
