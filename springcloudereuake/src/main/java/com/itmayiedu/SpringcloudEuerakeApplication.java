package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEuerakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEuerakeApplication.class, args);
    }

}
