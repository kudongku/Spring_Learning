package com.sparta.spring_learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/get")
    @ResponseBody // 순수하게 문자열만 반환
    public String hello(){
        return "Hello, world";
    }

    @PostMapping("/")
    @ResponseBody // 순수하게 문자열만 반환
    public String post(){
        return "post";
    }

    @PutMapping("/")
    @ResponseBody // 순수하게 문자열만 반환
    public String put(){
        return "put";
    }

    @DeleteMapping("/")
    @ResponseBody // 순수하게 문자열만 반환
    public String delete(){
        return "delete";
    }
}
