package com.itmayiedu;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableSwagger2Doc  //使用swagger文档
public class SpringcloudOrderFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOrderFeignApplication.class, args);
    }



}