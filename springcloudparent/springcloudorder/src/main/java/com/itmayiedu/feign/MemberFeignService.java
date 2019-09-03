package com.itmayiedu.feign;
import com.itmayiedu.service.MemberService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="app-itmayi-member-impl")
public interface MemberFeignService extends MemberService {


}
