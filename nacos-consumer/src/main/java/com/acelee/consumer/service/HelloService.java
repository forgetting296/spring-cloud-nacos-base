package com.acelee.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: Ace Lee
 * @Date: 2019/3/14 14:03
 */
@FeignClient("nacos-provider")
public interface HelloService {

    @RequestMapping("/hello")
    String hello(@RequestParam("name")String name);
}
