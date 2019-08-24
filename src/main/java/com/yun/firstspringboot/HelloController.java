package com.yun.firstspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiaofeng
 * @date 2019-08-24 15:12
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String say(){
        return "第一个SpringBoot应用！";
    }
}
