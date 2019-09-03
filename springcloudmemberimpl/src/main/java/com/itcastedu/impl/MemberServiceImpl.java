package com.itcastedu.impl;

import com.itmayiedu.entity.User;
import com.itmayiedu.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("会员服务")
public class MemberServiceImpl  implements MemberService {

    @ResponseBody
    @GetMapping("/getMember")
    @ApiOperation("获取用户会员信息")
    @ApiImplicitParams({@ApiImplicitParam(name="name",value = "用户姓名",required =true ,dataType ="String"),
                        @ApiImplicitParam(name="age",value = "用户年龄",required =true ,dataType ="String") } )
    public User getMember(String name,String age) {
        User user=new User(name,age);
        user.setAge("10");
        user.setName("张三");
        return user;
    }

    @Override
    public User getMember() {
        return null;
    }
}
