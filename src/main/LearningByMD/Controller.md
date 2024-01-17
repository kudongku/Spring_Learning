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