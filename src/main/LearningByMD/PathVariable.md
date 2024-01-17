# PathVariable 을 사용해보자

## 1. html
```html
<h2>GET /star/{name}/age/{age}</h2>
<form id="helloPathForm">
  <div>
    이름: <input name="name" type="text">
  </div>
  <div>
    나이: <input name="age" type="text">
  </div>
</form>
<div>
  <button id="helloPathFormSend">전송</button>
</div>
<br>
```
- form 에 데이터를 담는다.
## 2. JS
```javascript
  // GET /star/{name}/age/{age}
  const helloPathForm = document.querySelector("#helloPathFormSend")
  helloPathForm.onclick = (e) => {
    const form = document.querySelector("#helloPathForm");
    const name = form.querySelector('input[name="name"]').value;
    const age = form.querySelector('input[name="age"]').value;
    const relativeUrl = `/response/rest/star/${name}/age/${age}`;
    window.location.href = relativeUrl;
  }

```
- querySelector 해놓기
- onclick시 각 값들을 url에 담고
- ```window.location.href = relativeUrl;``` 로 href 보내기

## 3. java
```
    // [Request sample]
    // GET http://localhost:8080/hello/request/star/Robbie/age/95
    @GetMapping("/star/{name}/age/{age}")
    @ResponseBody
    public String helloRequestPath(@PathVariable String name, @PathVariable int age) {
        return String.format("Hello, @PathVariable.<br> name = %s, age = %d", name, age);
    }
```
1. 위 js 를 통해 GET http://localhost:8080/hello/request/star/Robbie/age/95 로 이동한다.
2. @GetMapping("/star/{name}/age/{age}") 을 통해 name 과 age 변수인자를 받는다.
3. @PathVariable String name, @PathVariable int age 로 return 값에 실는다.
