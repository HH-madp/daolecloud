package com.daole.eureakaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Eureakaclient01Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureakaclient01Application.class, args);
    }

}
