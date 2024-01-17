package com.sparta.spring_learning.controller;

import com.sparta.spring_learning.Model.Star;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
