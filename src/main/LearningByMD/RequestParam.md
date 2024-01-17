# RequestParam 을 써보자

## 1. HTML
```html
<h2>GET /hello/request/form/param</h2>
<form method="GET" action="/response/rest/form/param">
  <div>
    이름: <input name="name" type="text">
  </div>
  <div>
    나이: <input name="age" type="text">
  </div>
  <button>전송</button>
</form>
<br>
```

## 2. JS
- 필요없습니다. 
- html 의 method 가 GET
- GET 방식으로 action URL 이동

## 3. JAVA
```
    // [Request sample]
    // GET http://localhost:8080/response/rest/form/param?name=Robbie&age=95
    // param 뒤에 정보값 들이 붙어서 온다
    @GetMapping("/form/param")
    @ResponseBody
    public String helloGetRequestParam(@RequestParam String name, @RequestParam int age) {
        return String.format("Hello, @RequestParam.<br> name = %s, age = %d", name, age);
    }
```