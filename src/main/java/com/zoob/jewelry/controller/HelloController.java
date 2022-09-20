package com.zoob.jewelry.controller;

import com.zoob.jewelry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {



    @RequestMapping("/hello")
    public String handle01(){
        return "Hello Spring Boot2";
    }

}
