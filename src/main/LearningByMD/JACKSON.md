# 잭슨은 무엇인가
---
## Jackson
- JSON 데이터 구조를 처리해주는 라이브러리
- 객체를 JSON 타입의 String으로 변환해준다.
- JSON 타입의 String을 객체로도 변환해줄 수 있다.

## 구현방법
```java
class HelloControllerTest {

    @Test
    @DisplayName("Object To JSON : get Method 필요")
    void test1() throws JsonProcessingException {
        Star star = new Star("Robbie", 95);

        ObjectMapper objectMapper = new ObjectMapper(); // Jackson 라이브러리의 ObjectMapper
        String json = objectMapper.writeValueAsString(star);

        System.out.println("json = " + json);
    }

    @Test
    @DisplayName("JSON To Object : 기본 생성자 & (get OR set) Method 필요")
    void test2() throws JsonProcessingException {
        String json = "{\"name\":\"Robbie\",\"age\":95}"; // JSON 타입의 String

        ObjectMapper objectMapper = new ObjectMapper(); // Jackson 라이브러리의 ObjectMapper

        Star star = objectMapper.readValue(json, Star.class);
        System.out.println("star.getName() = " + star.getName());
    }
}
```
### 객체를 JSON 으로
- ```ObjectMapper objectMapper = new ObjectMapper();``` : ObjectMapper 생성
- ```String json = objectMapper.writeValueAsString(star);``` : String 으로 변환

### JSON을 객체로
- ```String json = "{\"name\":\"Robbie\",\"age\":95}";``` : String 타입의 JSON
- ```ObjectMapper objectMapper = new ObjectMapper();``` : ObjectMapper 생성
- ```Star star = objectMapper.readValue(json, Star.class);``` : 객체로 변환