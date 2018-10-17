package com.example.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("provider")
public interface Hello {
    @RequestMapping("/hi")
    String hello(@RequestParam(value = "name")String name);
}
