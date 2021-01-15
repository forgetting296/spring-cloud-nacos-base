package com.acelee.provider.controller;

import com.aceless.common.config.pojo.CommonConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Ace Lee
 * @Date: 2019/3/14 14:14
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam("name")String name){
        return "Hello "+name+", this is nacos-provider message.";
    }

    @RequestMapping("/hello2")
    public String hello2(@RequestParam("name")String name){
        System.out.println(CommonConfig.prop7);
        return "Hello "+name+", this is nacos-provider message.";
    }
}
