package com.star.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Star.Wu
 * @date 2019/10/28 14:58
 * @description
 **/
@FeignClient(value = "client", fallback = FeignServiceImpl.class)
public interface FeignService {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
