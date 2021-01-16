package com.aceless.common.config;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "nacos-config", autoRefreshed = true)
public class NacosCommonConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosCommonConfigApplication.class, args);
    }

}
