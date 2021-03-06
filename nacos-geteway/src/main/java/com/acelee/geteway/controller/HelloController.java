//package com.acelee.geteway.controller;
//
//import com.alibaba.nacos.api.config.annotation.NacosValue;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @author liuziping
// * @date 2020/12/25 4:43 下午
// */
//@RestController
//public class HelloController {
//
//    @NacosValue(value = "${nacos.test.property}", autoRefreshed = true)
//    private String prop;
//
//    @GetMapping(value = "/hello")
//    public String sayHello() {
//        System.out.println("prop: " + prop);
//        return "hello gateway";
//    }
//}
