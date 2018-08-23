package com.fu.controller;

import com.fu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fuxiaozhi on 2018\8\23 0023.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("hi")
    public String hiTest(@ModelAttribute("name") String name){
        return helloService.hiService(name);
    }

}
