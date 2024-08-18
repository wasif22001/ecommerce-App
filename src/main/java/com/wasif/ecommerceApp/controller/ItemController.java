package com.wasif.ecommerceApp.controller;

import com.wasif.ecommerceApp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<List<String>> getItems() {
        var items = itemService.getItems();
        return ResponseEntity.ok(items);
    }

    @GetMapping("/{itemId}")
    public ResponseEntity<String> getItemById(@PathVariable("itemId") int itemId) {
        var item = itemService.getItemById(itemId);
        return ResponseEntity.ok(item);
    }

}
