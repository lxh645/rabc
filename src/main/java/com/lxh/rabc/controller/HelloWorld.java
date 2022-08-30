package com.lxh.rabc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    /**
     * 测试环境
     * @return
     */
    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }
}
