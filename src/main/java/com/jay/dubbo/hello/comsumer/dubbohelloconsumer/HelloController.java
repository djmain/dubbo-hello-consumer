package com.jay.dubbo.hello.comsumer.dubbohelloconsumer;

import com.jay.duboo.hello.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Jay on 2019/8/2
 */
@RestController
public class HelloController
{

    @Reference
    HelloService helloService;

    @GetMapping("/hello")
    public String hello()
    {
        return helloService.sayHello("dj.");
    }
}
