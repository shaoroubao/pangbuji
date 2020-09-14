package com.shaoroubao.springboot.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("helloWord")
    public String helloWord(){
        return "hello word";
    }
}
