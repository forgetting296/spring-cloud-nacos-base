package com.acelee.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
//@NacosPropertySource(dataId = "nacos-config", autoRefreshed = true)
public class NacosGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosGetewayApplication.class, args);
    }

}
