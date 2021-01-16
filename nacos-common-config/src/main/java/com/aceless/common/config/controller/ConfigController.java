package com.aceless.common.config.controller;

import com.aceless.common.config.pojo.CommonConfig;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:
 * @Date:
 */
@RestController
public class ConfigController {

    @NacosValue(value = "${nacos.test.property1:123}", autoRefreshed = true)
    public String prop1;

    @NacosValue(value = "${nacos.test.property2:123}", autoRefreshed = true)
    public String prop2;

    @GetMapping("/prop1")
    public String test(){
        CommonConfig config = new CommonConfig();
        return CommonConfig.prop1;
    }

    @GetMapping("/prop2")
    public String prop(){
        return null;
    }

    @GetMapping("/prop3")
    public String prop3(){
        return prop1 + " " + prop2;
    }
}
