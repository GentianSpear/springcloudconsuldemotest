package com.example.provider;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String name){
        return "hi："+name;
    }
}
