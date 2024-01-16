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
정적인 HTML
### APACHE Tomcat
- Web server 와 Servlet 을 합쳐 놓음
- Web 은 정적인 데이터 처리
- Servlet 은 동적인 데이터 처리

## Spring 이란
### Spring Boot 와 다르다
- Annotation 을 사용함
- 의존성 관리 쉬움
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.7)

main] c.s.s.SpringLearningApplication          : Starting SpringLearningApplication using Java 17.0.8 
main] c.s.s.SpringLearningApplication          : No active profile set, falling back to 1 default profile: "default"
main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.17]
main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 437 ms
main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
main] c.s.s.SpringLearningApplication          : Started SpringLearningApplication in 0.793 seconds (process running for 1.13)
[nio-8080-exec-2] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
[nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
[nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms
```