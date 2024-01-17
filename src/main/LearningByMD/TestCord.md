# TestCord
- 버그를 찾기 위함
- 버그 : 소스코드 혹은 설계과정에서의 오류로 인해 예상치 못한 결과가 나오는 것
- QA 가 작성하기도  
## 구현방법
1. Test 모듈 안 text 코드 작성
```java
package com.sparta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "+", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(4, result);
    }
}
```
2. @Test : 위 메소드가 test 위한 메소임을 알려줌
3. Assertions.assertEquals(10, result); : result 가 10임을 예상한다 
    1. 틀릴경우 
```
Expected :3.0
Actual   :4.0
<Click to see difference>

org.opentest4j.AssertionFailedError: expected: <3.0> but was: <4.0>
```