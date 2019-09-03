package com.itmayiedu.service;

import com.itmayiedu.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;

public interface MemberService {

    @RequestMapping("/getMember")
    public User getMember();
}
