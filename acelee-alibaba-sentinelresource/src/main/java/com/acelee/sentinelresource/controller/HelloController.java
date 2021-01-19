package com.acelee.sentinelresource.controller;

import com.acelee.sentinelresource.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
 
    @Autowired
    private HelloService helloService;
 
    @GetMapping("/hello")
    public String hello() {
        helloService.doSomething("hello " + new Date());
        return "aceleeyy.com";
    }
 
    @GetMapping("/hello2")
    public String hello2() {
        helloService.doSomething2("hello2 " + new Date());
        return "aceleeyy.com";
    }
 
}
