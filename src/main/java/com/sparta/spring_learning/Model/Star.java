package com.sparta.spring_learning.Model;

import lombok.Getter;

@Getter
public class Star {
    private static String name;
    private static Integer age;

    public Star(String name, Integer age) {
        Star.name = name;
        Star.age = age;
    }
}
