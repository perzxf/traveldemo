package com.zcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //开启feign客户端
public class TravelfeigndemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelfeigndemoApplication.class, args);
    }

}

