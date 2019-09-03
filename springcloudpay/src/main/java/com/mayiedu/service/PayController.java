package com.mayiedu.service;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //刷新注解
public class PayController {


    @RequestMapping("/zuul")
    public String  issuccess()
    {
        return "路由成功";
    }

}
