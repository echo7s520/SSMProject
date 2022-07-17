package com.xx.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerIndex {
    @RequestMapping(value = "/")
    public String index01() {
        return "index";
    }

    @RequestMapping(value = "/addUser")
    public String addUser(){
        return "UserAdd";
    }
}
