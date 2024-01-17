# Controller 이해하기
```java
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/get")
    @ResponseBody // 순수하게 문자열만 반환
    public String hello() {
        return "Hello, world";
    }

    @PostMapping("/")
    @ResponseBody // 순수하게 문자열만 반환
    public String post() {
        return "post";
    }

    @PutMapping("/")
    @ResponseBody // 순수하게 문자열만 반환
    public String put() {
        return "put";
    }

    @DeleteMapping("/")
    @ResponseBody // 순수하게 문자열만 반환
    public String delete() {
        return "delete";
    }
}
```

## @Controller
- 이 클래스가 컨틀롤러임을 알리는 annotation

## @RequestMapping("/hello")
- http://localhost:8081/hello/get 이런 localhost 에서 
- 각 메소드들이 @GetMapping("/get") 이정도만 mapping 할 수 있게끔

## @GetMapping("/get")
## @PostMapping("/")
## @PutMapping("/")
## @DeleteMapping("/")

## @ResponseBody
- return 값을 문자열 그대로 리턴해준다.

## 정적인 페이지 리턴
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>static hello</title>
</head>
<body>
  <h1>hello, world</h1>
</body>
</html>
```
```java
@Controller
public class HtmlController {
    @GetMapping("/hello")
    public String hello(){
        return "staticHello.html";
    }
}
```
- http://localhost:8081/hello
```java
    /*
    정적인 페이지 들
     */

// thymeleaf 때문에 작동 안됨
//    @GetMapping("/hello")
//    public String hello(){
//        return "staticHello.html";
//    }

// thymeleaf 사용중에 html 리턴하고 싶으면 redirect
//    @GetMapping("/hello/redirect")
//    public String helloRedirect(){
//        return "redirect:/staticHello.html";
//    }
//
//    //thymeleaf를 사용하면 html을 빼도 된다.
//    @GetMapping("/hello/template")
//    public String helloTemplate(){
//        return "templateHtml";
//    }
```