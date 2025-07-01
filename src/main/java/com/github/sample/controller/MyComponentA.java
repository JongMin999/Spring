package com.github.sample.controller;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponentA {
    //@Autowired 여기에 하든 밑에 set 생성자로 만들어서 하든 자유
    private MyComponentB componentB;

    public void sayHello() {
        String message = componentB + ", 그리고 난 MyComponentA";
        System.out.println(message);
    }

    @Autowired
    public void setComponentB(MyComponentB componentB) {
        this.componentB = componentB;
    }
}
