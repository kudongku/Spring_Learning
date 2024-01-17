# 정적인 페이지 와 동적인 페이지
- thymeleaf API 를 사용한다 가정하고 설명하겠다.

## 정적인 페이지?
- html을 그래도 return 하는 것을 말한다.
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
이런 html 을 그래도
```java
@Controller
public class HtmlController {
    @GetMapping("/hello")
    public String hello(){
        return "staticHello.html";
    }
}
```
컨드롤러에 담아서 리턴

접근하려면
- http://localhost:8081/hello

```
    /*
    정적인 페이지 
     */

 //thymeleaf 때문에 작동 안됨
    @GetMapping("/hello")
    public String hello(){
        return "staticHello.html";
    }

 //thymeleaf 사용중에 html 리턴하고 싶으면 redirect
    @GetMapping("/hello/redirect")
    public String helloRedirect(){
        return "redirect:/staticHello.html";
    }
    
//thymeleaf를 사용하면 html을 빼도 된다.
    @GetMapping("/hello/template")
    public String helloTemplate(){
        return "templateHtml";
    }
```

## 동적인 페이지
```html
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>dynamic</title>
</head>
<body>
    <h3>총 방문자 수 : <span th:text = "${visits}"></span></h3>
</body>
</html>
```
```java
@Controller
public class HtmlController {
    private static int visitCount = 0;

    /*
    동적인 페이지
     */

    @GetMapping("/hello/template")
    public String dynamic(Model model){
        ++visitCount;
        model.addAttribute("visits", visitCount);
        return "dynamicHTML";
    }
}
```
새로고침 할때 마다, 방문자 수가 변한다.