package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author melon
 * @Description
 * @date 2020/6/4
 */
@RestController
public class hello {

    @PostMapping("hello")
    public String hello(){
        return "hello";
    }
}
