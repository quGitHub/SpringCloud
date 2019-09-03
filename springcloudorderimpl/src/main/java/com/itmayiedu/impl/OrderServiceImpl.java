package com.itmayiedu.impl;
import com.itmayiedu.IOrderService;
import com.itmayiedu.entity.User;
import com.itmayiedu.feign.MemberFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private MemberFeignService memberFeignService;

   @RequestMapping("/orderToMember")
    public String orderToMember() {
       User user = memberFeignService.getMember();
       return user.getName();
    }
}