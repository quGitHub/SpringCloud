package com.itmayiedu.impl;
import com.itmayiedu.IOrderService;
import com.itmayiedu.entity.User;
import com.itmayiedu.feign.MemberFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("订单服务")
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private MemberFeignService memberFeignService;


    /*@ApiOperation("通过订单获取用户姓名")
    @GetMapping("/orderToMember")
    @ResponseBody
    @ApiImplicitParams({@ApiImplicitParam(name="name",value = "用户姓名",required =true ,dataType ="String"),
            @ApiImplicitParam(name="age",value = "用户年龄",required =true ,dataType ="String") } )
    public String orderToMember(String  name,String age) {
       User user = new User(name,age);
       return user.getName();
    }*/
    @ApiOperation("通过订单获取用户姓名")
    @GetMapping("/orderToMember")
    @ResponseBody
    @ApiImplicitParams({@ApiImplicitParam(name="name",value = "用户姓名",required =true ,dataType ="String"),
            @ApiImplicitParam(name="age",value = "用户年龄",required =true ,dataType ="String") } )
    public String orderToMember(String  name,String age) {
        User member = memberFeignService.getMemberTo();
        return member.getName();
    }
}