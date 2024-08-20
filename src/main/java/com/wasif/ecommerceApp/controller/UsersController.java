package com.wasif.ecommerceApp.controller;

import com.wasif.ecommerceApp.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{userId}")
    ResponseEntity<String> getUserById(@PathVariable("userId") int userId) {
        var user = usersService.getUserById(userId);
        return ResponseEntity.ok(user);
    }

    @PutMapping
    ResponseEntity<String> updateUser(String user) {
        usersService.updateUser(user);
        return ResponseEntity.ok().build();
    }
}
