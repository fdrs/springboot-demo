package com.fdrs.springboot.commons;

import com.fdrs.springboot.commons.autoconfig.BizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by bruce.lch on 15/11/2017.
 */
@RestController
@RequestMapping("/get/message")
public class DemoController {

    @Autowired
    private Environment env;

    @Resource
    RedisTemplate redisTemplate;

    @Autowired
    BizService bizService;

    @RequestMapping("/enviroment")
    public String view() {
        return env.getProperty("spring.redis.host");
    }

    @RequestMapping("/hello")
    public String hello(){
        return bizService.getMsg();
    }
}
