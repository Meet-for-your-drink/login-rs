package com.duang.loginrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LoginrsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginrsApplication.class, args);
    }

}
