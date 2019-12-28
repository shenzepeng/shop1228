package com.controller;

import org.apache.ibatis.annotations.ResultType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: szp
 * @Date: 2019/12/28 20:13
 * @Description: 沈泽鹏写点注释吧
 */
@RestController
public class HelloController {
    /**
     * y=kx +z
     * @return
     */
//    @GetMapping(produces = "text/html;charset=utf-8")
//    public String getHello(){
//        return "你好！ spring";
//    }
    @GetMapping("hello2")
    public String getHello2(){
        return "hello2";
    }
}
