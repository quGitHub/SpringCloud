package com.itmayiedu.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="app-itmayi-member-impl")
public interface MemberFeign    {

}
