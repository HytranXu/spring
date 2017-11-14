package com.smart.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuhc on 2017/10/15.
 */
//@RestController
//@EnableAutoConfiguration
public class BbsDaemon {
   // @RequestMapping("/")
    public String index()
    {
        return "欢迎光临小春论坛";
    }

    public static void main11(String[] args) throws Exception//如果测试去掉11
    {
        SpringApplication.run(BbsDaemon.class,args);
    }
}
