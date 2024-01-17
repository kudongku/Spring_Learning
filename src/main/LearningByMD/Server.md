# Server

> 백엔드 에서 중요한 서버 개발

## Client <=> Internet <=> Server 관계
1. client 는 server 에게 요청
2. server 는 client 에게 반응

### 택배를 예로 들면
- 주소 = IP
- 받는 사람 = port

### client 입장 
1. client 는 Chrome browser 에서 무언갈 요청
2. Chrome 은 Server 의 API 에 HTML CSS JS 등을 넣어서 보낸 값을 받게됨
3. client 는 Chrome 으로 이 화면을 보게 됨

### API 란?
- 약속된 요청
- Restful API 등이 있다. ( GET, POST, PUT )

## APACHE Tomcat
### HTTP 
- 정적인 컨텐츠
- 이미 완성된 내용을 보냄
### APACHE Tomcat
- Web server 와 Servlet(WAS) 을 합쳐 놓음
- Web 은 정적인 데이터 처리
- Servlet 은 동적인 데이터 처리

## Spring 이란
### Spring Boot
- Annotation 을 사용함
- 의존성 관리 쉬움
- 내장 Apache Tomcat
### Hello, World 해보기
1. controller 생성
```java
package com.sparta.spring_learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String hello(){
        return "Hello";
    }
}
```
2. Application 실행
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.7)

main] c.s.s.SpringLearningApplication          : Starting SpringLearningApplication using Java 17.0.8 
main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.17]
main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
main] c.s.s.SpringLearningApplication          : Started SpringLearningApplication in 0.793 seconds (process running for 1.13)
```
3. Postman 접속
- GET 방식 으로 http://localhost:8080/api/hello Send
- body 에서 Hello 받은 것을 확인