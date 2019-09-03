package com.itcastedu;


import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc  //生成swagger文档
public class SpringCloudMemberApplication {


    public  static  void  main(String[] args){
        SpringApplication.run(SpringCloudMemberApplication.class, args);
    }
}
