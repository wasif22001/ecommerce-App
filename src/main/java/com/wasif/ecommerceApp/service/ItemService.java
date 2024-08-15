package com.wasif.ecommerceApp.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    public List<String> getItems() {
        return List.of("Laptop", "Mouse", "Keyboard", "Head phones");
    }
}
