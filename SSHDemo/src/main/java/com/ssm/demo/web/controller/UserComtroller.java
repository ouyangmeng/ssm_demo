package com.ssm.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * user:ouym
 * date: 2015/7/31
 * time: 13:26
 */
@Controller
@RequestMapping("/")
public class UserComtroller {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
