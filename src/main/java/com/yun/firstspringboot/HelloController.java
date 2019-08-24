package com.yun.firstspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangxiaofeng
 * @date 2019-08-24 15:12
 * @Controller + @ResponseBody = @RestController
 */
//@Controller
@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Value("${minMoney}")
//    private BigDecimal minMoney;
//
//    @Value("${description}")
//    private String desc;

    @Autowired
    private LimitConfig limit;

    @GetMapping("/say")
//    @PostMapping("/say")
//    @RequestMapping("/say") //get、post方式都支持
//    @ResponseBody
    public String say(@RequestParam(value="id",required = false, defaultValue = "0") Integer id){
//        return "说明："+limit.getDescription();
        return "id:" + id;
//        return "index"; //返回页面模板
    }

}
