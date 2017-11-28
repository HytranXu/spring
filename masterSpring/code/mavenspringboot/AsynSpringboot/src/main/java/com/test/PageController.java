package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.Callable;

@Controller
public class PageController {
    @RequestMapping("/test.jsp")
    @ResponseBody
    public Callable<String> callable() {
        // 这么做的好处避免web server的连接池被长期占用而引起性能问题，
        // 调用后生成一个非web的服务线程来处理，增加web服务器的吞吐量。
        return new Callable<String>() {
            public String call() throws Exception {
                System.out.println("In PageController::callable");
                Thread.sleep(3 * 10L);
                return "index";
            }
        };
    }

    @RequestMapping(value = "/testin.jsp")
    public String loginPage(){
        return "index";
    }
}
