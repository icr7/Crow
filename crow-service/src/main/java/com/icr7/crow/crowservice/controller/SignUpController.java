package com.icr7.crow.crowservice.controller;

import com.icr7.crow.crowservice.util.JwtUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign-up")
public class SignUpController {
    @GetMapping("/test")
    public String getTest(){
        JwtUtils jwtUtils = new JwtUtils();
        return jwtUtils.generateToken("ishwar.singh@db.com");
    }
}
