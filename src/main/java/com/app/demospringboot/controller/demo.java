package com.app.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package com.app.demospringboot.controller
 * @ClassName demo
 * @Author shaobin.wang
 * @Date 2019/01/31 11:21
 * @Version 1.0
 * @Description:
 **/
@RestController
public class demo {

    @RequestMapping("/")
    public String hello() {
        return "<h1>Hello Word!</h1>";
    }
}
