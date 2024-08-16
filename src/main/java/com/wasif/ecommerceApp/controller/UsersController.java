package com.wasif.ecommerceApp.controller;

import com.wasif.ecommerceApp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    ResponseEntity<List<String>> getUsers() {
        var users = usersService.getUsers();
        return ResponseEntity.ok(users);
    }
}
