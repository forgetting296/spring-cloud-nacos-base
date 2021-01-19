package com.acelee.sentinelresource;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AceleeAlibabaSentinelresourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AceleeAlibabaSentinelresourceApplication.class, args);
    }

    //注解支持的配置Bean
    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }
}
