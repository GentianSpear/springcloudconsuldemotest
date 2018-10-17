package com.example.customer;

import org.springframework.stereotype.Component;

@Component
public class HelloImpl implements Hello {
    @Override
    public String hello(String name) {
        return "my name is "+name;
    }
}
