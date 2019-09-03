package com.itcastedu.impl;

import com.itmayiedu.entity.User;
import com.itmayiedu.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl  implements MemberService {

    @GetMapping("/getMember")
    public User getMember() {
        User user=new User();
        user.setAge("10");
        user.setName("张三");
        return user;
    }
}
