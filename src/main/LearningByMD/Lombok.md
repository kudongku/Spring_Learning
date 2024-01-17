# Lombok

## 구현하기 전
comman + , : 
1. plugin에 롬복 설치하기
2. compile -> annotation process -> enable 에 체크하기

## 구현방법
### annotation
```java
package com.sparta.spring_learning;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Memo {
    private String username;
    private String contents;
}
```
위 코드의 annotation 은
- getter
- setter

을 넣어주었다.

### class 파일
```java
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.sparta.spring_learning;

public class Memo {
    private String username;
    private String contents;

    public Memo() {
    }

    public String getUsername() {
        return this.username;
    }

    public String getContents() {
        return this.contents;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public void setContents(final String contents) {
        this.contents = contents;
    }
}

```
클래스 파일은 getter 와 setter 메소드들이 구현되었음을 알 수 있다.

### AllArgumentConstructor
```
    public Memo(final String username, final String contents) {
        this.username = username;
        this.contents = contents;
        }
```

### NoArgumentConstructor
```
    public Memo() {
    }
```
### RequiredArgsContructor
- final 만 생성자 매개변수로 받음
```
    public Memo(final String username) {
        this.username = username;
    }
```