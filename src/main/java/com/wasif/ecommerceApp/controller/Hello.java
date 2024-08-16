package com.wasif.ecommerceApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class Hello {

    @GetMapping
    public String health() {
        return "E-commerce Application is running and Up!";
    }
}
