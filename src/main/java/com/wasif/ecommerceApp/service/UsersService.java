package com.wasif.ecommerceApp.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    public List<String> getUsers() {
        return List.of("Tom", "Jerry", "Spike");
    }

    public String getUserById(int id){
        return "Tom";
    }

    public void updateUser(String user){
        System.out.println("user is updated!");
    }
}
