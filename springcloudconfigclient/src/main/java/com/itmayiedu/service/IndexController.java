package com.itmayiedu.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //刷新注解
public class IndexController {

     @Value("${ipaddress}")
     private   String  ipaddress;

    @RequestMapping("/ipaddress")
    public String ipaddress(){
        return ipaddress;
    }
}
