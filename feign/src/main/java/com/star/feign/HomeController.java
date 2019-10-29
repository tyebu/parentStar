package com.star.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Star.Wu
 * @date 2019/10/28 15:02
 * @description
 **/
@RestController
public class HomeController {
    @Autowired
    FeignService feignService;
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHello(@RequestParam String name) {
        return feignService.sayHiFromClientOne(name);
    }
}
