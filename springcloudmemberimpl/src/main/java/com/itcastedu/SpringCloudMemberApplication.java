package com.itcastedu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudMemberApplication {


    public  static  void  main(String[] args){
        SpringApplication.run(SpringCloudMemberApplication.class, args);
    }
}
