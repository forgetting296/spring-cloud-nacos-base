package com.acelee.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:
 * @Date:
 */
@RestController
public class ConfigController {

    @NacosValue(value = "${nacos.test.property:123}", autoRefreshed = true)
    private String testProperties;

    @GetMapping("/test")
    public String test(){
        return testProperties;
    }
}
