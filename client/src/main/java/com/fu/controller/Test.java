package com.fu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fuxiaozhi on 2018\8\23 0023.
 */
@RestController
@RequestMapping("/test")
public class Test {


    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String test(@ModelAttribute("name")String name){
        return name + "==========" + port;
    }

}
