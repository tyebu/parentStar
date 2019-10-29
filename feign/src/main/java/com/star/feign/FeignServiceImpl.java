package com.star.feign;

import org.springframework.stereotype.Component;

/**
 * @author Star.Wu
 * @date 2019/10/28 16:08
 * @description
 **/
@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry the connection has closed";
    }
}
