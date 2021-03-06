package com.evil.ibeteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IbetEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbetEurekaApplication.class, args);
    }

}
