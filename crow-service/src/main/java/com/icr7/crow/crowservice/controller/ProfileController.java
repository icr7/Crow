package com.icr7.crow.crowservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crow")
public class ProfileController {
    @GetMapping("/test")
    public String getTest(){
        return "test sucess";
    }
}
