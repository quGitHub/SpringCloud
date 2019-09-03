package com.itmayiedu;


import org.springframework.web.bind.annotation.RequestMapping;

public interface IOrderService {

    @RequestMapping("/orderToMember")
    public  String orderToMember();
}
