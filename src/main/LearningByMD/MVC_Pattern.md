# MVC
- model, view, controller

## Model
- 데이터를 저장하고 불러옴

## View
- 사용자가 보는 화면을 구성

## Controller
- model 과 view

## Spring MVC

### servlet
1. HttpServletRequest 와 HttpServletResponse 객체 생성
2. servlet 분석
3. 찾은 servlet 
4. doGet(), doPost()...
5. 1에서 생성했던 객체에 정보를 담아서 return

### dispatcherServlet
- 전달하는 servlet
1. client 가 request
2. dispatcherServlet 이 분석
3. Handler mapping 을 통해 Controller 를 찾아 전달 (annotation으로 찾음)
```
@RestController
public class HelloController {
    @GetMapping("/api/hello")
    public String hello(){
        return "Hello";
    }
}
```
4. 컨트롤러에 요청 전달
5. 컨트롤러가 작업한 후 return 값(모델 과 뷰에 대한 정보)을 dispatcherServlet 에 전달
6. dispatchServlet 에서는 받은 데이터 값을 ViewResolver 로 전달해서 페이지로 구성하고
7. View에 전달
8. View 는 client 에게 response 한다.