package com.xiaxi.springcloud.feignuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FeignUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignUserApplication.class, args);
    }
}
