package com.star.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: Star.Wu
 * @date: 2019/8/9 17:59
 * @description:
 **/
@RestController
public class TestController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/home")
    public String home(@RequestParam(value = "name", defaultValue = "fasd") String name) {
        return name + "========" + port;
    }
}
