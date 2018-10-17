package com.example.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Hello hello;
    @RequestMapping("/sayHi")
    public String sayHello(String name){
        return hello.hello(name);
    }
}
