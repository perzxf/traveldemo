package com.zcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启用eureka服务端
public class TraveleurekademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraveleurekademoApplication.class, args);
    }

}

