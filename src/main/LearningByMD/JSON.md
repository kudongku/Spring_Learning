# JSON

## @RestController 를 사용하는 경우
```java
@Controller
public class HelloController {

    //JSON 은 자바가 해석할 수 없다. => JSON 처럼 생긴 String type 으로 반환
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }
    // {"name" : "Robbie", "age" : 95}
    // Response Body
    // Content-Type : text/html


    // Content-Type : application/json
    // Response Body
    // { "name" : "Robbie", "age" : 95}
    @GetMapping("/json/class")
    @ResponseBody
    public Star helloStarJson() {
        return new Star("Robbie", 95);
    }
    //위의 메소드와 동일!
    // @Response Body = 우리는 html 을 반환하려는게 아니라, 그냥 객체를 반환할게
}

```
## @RestController 사용하는 경우
- ResponseBody 를 사용할 필요가 없음
```java
@RestController //response body가 다 적용된다.
public class HelloController {

    @GetMapping("/json/string")
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    @GetMapping("/json/class")
    public Star helloStarJson() {
        return new Star("Robbie", 95);
    }

}
```