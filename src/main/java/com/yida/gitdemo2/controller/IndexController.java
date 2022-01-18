package com.yida.gitdemo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
